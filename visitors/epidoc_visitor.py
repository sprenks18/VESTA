
from grammar.EDRVisitor import EDRVisitor
from grammar.EDRParser import EDRParser
from utils.conversion import greek_letters_dict
from translations.epidoc import *

class EpidocVisitor(EDRVisitor):

    def __init__(self):
        self._count = 0
        self._column = 0
        self._break = True
        EDRVisitor.__init__(self)

    def getLetter(self, letter):
        if letter in greek_letters_dict:
            return greek_letters_dict[letter]
        else:
            return letter
        
    def visitRoot(self, ctx:EDRParser.RootContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])
    
    def visitColumn(self, ctx:EDRParser.ColumnContext):
        l = list(ctx.getChildren())
        self._count = 0
        c = chr(self._column + 97)
        self._column += 1
        if len(l) == 3:
            return COLUMN_COUNT % (c, self.visit(l[2]))
        elif len(l) == 5:
            return COLUMN_COUNT % (c, self.visit(l[2])) + "\n" + self.visit(l[4])
        elif len(l) == 1:
            return self.visit(l[0])
        
    # Visit a parse tree produced by EDRParser#multi_line_inscription.
    def visitMulti_line_inscription(self, ctx:EDRParser.Multi_line_inscriptionContext):
        l = list(ctx.getChildren()) 
        content = self.visit(l[0])
        self._break = True
        return content + "\n" + self.visit(l[2]) 


    # Visit a parse tree produced by EDRParser#no_word_break.
    def visitNo_word_break(self, ctx:EDRParser.No_word_breakContext):
        l = list(ctx.getChildren()) 
        return self.visit(l[0]) + "\n" + self.visit(l[1])


    # Visit a parse tree produced by EDRParser#excess_new_line.
    def visitExcess_new_line(self, ctx:EDRParser.Excess_new_lineContext):
        l = list(ctx.getChildren()) 
        return self.visit(l[0])


    # Visit a parse tree produced by EDRParser#single_line_inscription.
    def visitSingle_line_inscription(self, ctx:EDRParser.Single_line_inscriptionContext):
        l = list(ctx.getChildren()) 
        return self.visit(l[0])            
        
    def visitContinuation(self, ctx:EDRParser.ContinuationContext):
        l = list(ctx.getChildren())
        self._break = False
        return self.visit(l[2])
        
    def visitContent(self, ctx:EDRParser.ContentContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])
        
    def visitHorz(self, ctx:EDRParser.HorzContext):
        l = list(ctx.getChildren())
        self._count += 1
        if self._break:
            return LINE_COUNT % (self._count) + self.visit(l[0])
        else:
            return NO_BREAK % (self._count) + self.visit(l[0])
                 
    def visitPerp(self, ctx:EDRParser.PerpContext):
        l = list(ctx.getChildren())
        self._count += 1
        if self._break:
            return PERP_LINE % (self._count) + self.visit(l[2])
        else:
            return PERP_NO_BREAK % (self._count) + self.visit(l[0])
        
    def visitRow(self, ctx:EDRParser.RowContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])

    def visitLine(self, ctx:EDRParser.LineContext):
        l = list(ctx.getChildren())
        if len(l) == 3:
            return self.visit(l[0]) + " " + self.visit(l[2])
        else:
            return self.visit(l[0])

    def visitTerm(self, ctx:EDRParser.TermContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])

    def visitFigural(self, ctx:EDRParser.FiguralContext):
        l = list(ctx.getChildren())
        desc = self.visit(l[3])
        return FIGURAL % (desc,)
       
    def visitNormal_misspell(self, ctx:EDRParser.Normal_misspellContext):
        l = list(ctx.getChildren())
        original = self.visit(l[0])
        correct  = self.visit(l[4])
        return MISSPELL % (correct, original)


    def visitNo_space_misspell(self, ctx:EDRParser.No_space_misspellContext):
        l = list(ctx.getChildren())
        original = self.visit(l[0])
        correct  = self.visit(l[3])
        return MISSPELL % (correct, original)

    def visitUnsure_misspell(self, ctx:EDRParser.Unsure_misspellContext):
        l = list(ctx.getChildren())
        original = self.visit(l[0])
        correct  = self.visit(l[4])
        return MISSPELL_UNCERTAIN % (correct, original)

    def visitUnsure_no_space_misspell(self, ctx:EDRParser.Unsure_no_space_misspellContext):
        l = list(ctx.getChildren())
        original = self.visit(l[0])
        correct  = self.visit(l[3])
        return MISSPELL_UNCERTAIN % (correct, original)

    def visitNormal_abbr(self, ctx:EDRParser.Normal_abbrContext):
        l = list(ctx.getChildren())
        present = self.visit(l[0])
        expand  = self.visit(l[2])
        return ABBREV % (present, expand)

    def visitUncertain_abbr(self, ctx:EDRParser.Uncertain_abbrContext):
        l = list(ctx.getChildren())
        present = self.visit(l[0])
        expand  = self.visit(l[2])
        return ABBREV_UNCERTAIN % (present, expand)

    def visitUnknown_abbr1(self, ctx:EDRParser.Unknown_abbr1Context):
        l = list(ctx.getChildren())
        present = self.visit(l[0])
        return ABBREV_UNKNOWN % (present,)

    def visitUnknown_abbr2(self, ctx:EDRParser.Unknown_abbr2Context):
        l = list(ctx.getChildren())
        present = self.visit(l[0])
        return ABBREV_UNKNOWN % (present,)

    def visitDesc(self, ctx:EDRParser.DescContext):
        l = list(ctx.getChildren())
        if len(l) == 4:
            return self.visit(l[0]) + " " + self.visit(l[2]) + l[3].getText()
        elif len(l) == 3:
            return self.visit(l[0]) + " " + self.visit(l[2])
        elif len(l) == 2:
            return self.visit(l[0]) + l[1].getText()
        else:
            return self.visit(l[0])

    def visitString(self, ctx:EDRParser.StringContext):
        l = list(ctx.getChildren())
        if len(l) == 3:
            return self.visit(l[0]) + " " + self.visit(l[2])
        else:
            return self.visit(l[0])

    def visitWord(self, ctx:EDRParser.WordContext):
        l = list(ctx.getChildren())
        if len(l) == 2:
            return self.visit(l[0]) + self.visit(l[1])
        else:
            return self.visit(l[0])
        
    def visitChunk(self, ctx:EDRParser.ChunkContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])

    def visitNormal_chunk(self, ctx:EDRParser.Normal_chunkContext):
        l = list(ctx.getChildren())
        if len(l) == 2:
            return self.getLetter(l[0].getText()) + self.visit(l[1])
        else:
            return self.getLetter(l[0].getText())
        
    def visitUnder_helper(self, ctx:EDRParser.Under_helperContext):
        l = list(ctx.getChildren())
        if len(l) == 3:
            return self.getLetter(l[0].getText()) + self.visit(l[2])
        else:
            return self.getLetter(l[0].getText())

    def visitUnder_chunk(self, ctx:EDRParser.Under_chunkContext):
        l = list(ctx.getChildren())
        return MISSING_CHARS % (self.visit(l[0]),)
    
    def visitDot_chunk(self, ctx:EDRParser.Dot_chunkContext):
        l = list(ctx.getChildren())
        return UNCLEAR % (self.visit(l[0]),)

    def visitDot_helper(self, ctx:EDRParser.Dot_helperContext):
        l = list(ctx.getChildren())
        if len(l) == 3:
            return self.visit(l[0]) + self.getLetter(l[1].getText())
        else:
            return self.getLetter(l[0].getText())
        
    def visitLost_chunk(self, ctx:EDRParser.Lost_chunkContext):
        l = list(ctx.getChildren())
        if len(l) == 3:
            return LOST % (self.visit(l[1]),)
        elif len(l) == 4:
            return LOST_UNCERTAIN % (self.visit(l[1]))
        
    def visitGap_unknown(self, ctx:EDRParser.Gap_unknownContext):
        return GAP_UNKNOWN
    
    def visitErased(self, ctx:EDRParser.ErasedContext):
        l = list(ctx.getChildren())
        return ERASED % (self.visit(l[1]),)
    
    def visitIllegible(self, ctx:EDRParser.IllegibleContext):
        l = list(ctx.getChildren())
        return ILLEGIBLE % (len(ctx.getText()))

    def visitLost_lines_unknown(self, ctx:EDRParser.Lost_lines_unknownContext):
        return UNKNOWN_LOST_LINES
    
    def visitLost_line(self, ctx:EDRParser.Lost_lineContext):
        l = list(ctx.getChildren())
        return 1

    def visitLost_lines(self, ctx:EDRParser.Lost_linesContext):
        l = list(ctx.getChildren())
        if len(l) == 1:
            return LOST_LINES % (1,)
        else:
            d = int(self.visit(l[0]).split('"')[3]) + 1
            return LOST_LINES % (d,)
        
    def visitSurplus(self, ctx:EDRParser.SurplusContext):
        l = list(ctx.getChildren())
        return SURPLUS % (self.visit(l[1]),)
    
    def visitJoined(self, ctx:EDRParser.JoinedContext):
        l = list(ctx.getChildren())
        return JOINED % (self.visit(l[0]),)

    def visitJoined_helper(self, ctx:EDRParser.Joined_helperContext):
        l = list(ctx.getChildren())
        if len(l) == 3:
            return self.visit(l[0]) + l[2].getText()
        else:
            return self.visit(l[0])
    
    def visitJoined_letters(self, ctx:EDRParser.Joined_lettersContext):
        l = list(ctx.getChildren())
        return l[0].getText() + l[2].getText()
    
    def visitSymbol(self, ctx:EDRParser.SymbolContext):
        l = list(ctx.getChildren())
        sym = self.visit(l[2])
        return SYMBOL % (sym,sym)
    
    def visitLost_chars(self, ctx:EDRParser.Lost_charsContext):
        l = list(ctx.getChildren())
        char_count = int(l[2].getText())
        return LOST_CHARS % (char_count,)
    
    def visitLost_chars_known(self, ctx:EDRParser.Lost_chars_knownContext):
        l = list(ctx.getChildren())
        char_count = len(l[1].getText())
        return LOST_CHARS_KNOWN % (char_count,)
    
    def visitEditorial(self, ctx:EDRParser.EditorialContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])

    def visitVacat(self, ctx:EDRParser.VacatContext):
        return VACAT

    def visitIanua(self, ctx:EDRParser.IanuaContext):
        return IANUA
    
    def visitSubaudible(self, ctx:EDRParser.SubaudibleContext):
        l = list(ctx.getChildren())
        if len(l) == 4:
            word = self.visit(l[2])
        else:
            word = self.visit(l[1])
        return SUB_AUDIBLE % (word,)
    
    def visitOmitted(self, ctx:EDRParser.OmittedContext):
        l = list(ctx.getChildren())
        word = self.visit(l[1])
        return OMITTED % (word,)
    
    def visitLost_with_gap(self, ctx:EDRParser.Lost_with_gapContext):
        l = list(ctx.getChildren())
        word = self.visit(l[1])
        return LOST_AND_GAP % (word,)
    
    def visitMissing_chunk(self, ctx:EDRParser.Missing_chunkContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])

    def visitStandard_chunk(self, ctx:EDRParser.Standard_chunkContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])
    
    def visitLine_in_bracket(self, ctx:EDRParser.Line_in_bracketContext):
        l = list(ctx.getChildren())
        if len(l) == 3:
            return self.visit(l[0]) + " " + self.visit(l[2])
        else:
            return self.visit(l[0])

    def visitTerm_in_bracket(self, ctx:EDRParser.Term_in_bracketContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])

    def visitString_in_bracket(self, ctx:EDRParser.String_in_bracketContext):
        l = list(ctx.getChildren())
        if len(l) == 3:
            return self.visit(l[0]) + " " + self.visit(l[2])
        else:
            return self.visit(l[0])


    def visitWord_in_bracket(self, ctx:EDRParser.Word_in_bracketContext):
        l = list(ctx.getChildren())
        if len(l) == 2:
            return self.visit(l[0]) + self.visit(l[1])
        else:
            return self.visit(l[0])