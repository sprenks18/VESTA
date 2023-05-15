
if __name__ is not None and "." in __name__:
    from .EDRVisitor import EDRVisitor
    from .EDRParser import EDRParser
else:
    from EDRVisitor import EDRVisitor
    from EDRParser import EDRParser

from conversion import greek_letters_dict

FIGURAL = "((:%s))"

class EvalVisitor(EDRVisitor):

    def __init__(self):
        EDRVisitor.__init__(self)

    def getLetter(self, letter):
        if letter in greek_letters_dict:
            return greek_letters_dict[letter]
        else:
            return letter

    def visitRoot(self, ctx:EDRParser.RootContext):
        l = list(ctx.getChildren())
        return self.visit(l[0]).strip().replace("  ", " ")
            
    # Visit a parse tree produced by EDRParser#inscription1.
    def visitInscription1(self, ctx:EDRParser.Inscription1Context):
        l = list(ctx.getChildren())
        return self.visit(l[0]) + "\n" +  self.visit(l[2])


    # Visit a parse tree produced by EDRParser#inscription2.
    def visitInscription2(self, ctx:EDRParser.Inscription2Context):
        l = list(ctx.getChildren())
        return self.visit(l[0])
    
    # Visit a parse tree produced by EDRParser#inscription3.
    def visitInscription3(self, ctx:EDRParser.Inscription3Context):
        l = list(ctx.getChildren())
        return self.visit(l[0])
        
    # Visit a parse tree produced by EDRParser#row.
    def visitRow(self, ctx:EDRParser.RowContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])

    # Visit a parse tree produced by EDRParser#line.
    def visitLine(self, ctx:EDRParser.LineContext):
        l = list(ctx.getChildren())
        if len(l) == 3:
            return self.visit(l[0]) + " " + self.visit(l[2])
        else:
            return self.visit(l[0])

    # Visit a parse tree produced by EDRParser#term.
    def visitTerm(self, ctx:EDRParser.TermContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])

    # Visit a parse tree produced by EDRParser#figural.
    def visitFigural(self, ctx:EDRParser.FiguralContext):
        l = list(ctx.getChildren())
        desc = self.visit(l[3])
        return FIGURAL % (desc,)
       
    # Visit a parse tree produced by EDRParser#normal_misspell.
    def visitNormal_misspell(self, ctx:EDRParser.Normal_misspellContext):
        l = list(ctx.getChildren())
        correct  = self.visit(l[4])
        return correct


    # Visit a parse tree produced by EDRParser#no_space_misspell.
    def visitNo_space_misspell(self, ctx:EDRParser.No_space_misspellContext):
        l = list(ctx.getChildren())
        correct  = self.visit(l[3])
        return correct


    # Visit a parse tree produced by EDRParser#unsure_misspell.
    def visitUnsure_misspell(self, ctx:EDRParser.Unsure_misspellContext):
        l = list(ctx.getChildren())
        correct  = self.visit(l[4])
        return correct

    # Visit a parse tree produced by EDRParser#unsure_no_space_misspell.
    def visitUnsure_no_space_misspell(self, ctx:EDRParser.Unsure_no_space_misspellContext):
        l = list(ctx.getChildren())
        correct  = self.visit(l[3])
        return correct

    # Visit a parse tree produced by EDRParser#normal_abbr.
    def visitNormal_abbr(self, ctx:EDRParser.Normal_abbrContext):
        l = list(ctx.getChildren())
        present = self.visit(l[0])
        expand  = self.visit(l[2])
        return present + expand

    # Visit a parse tree produced by EDRParser#uncertain_abbr.
    def visitUncertain_abbr(self, ctx:EDRParser.Uncertain_abbrContext):
        l = list(ctx.getChildren())
        present = self.visit(l[0])
        expand  = self.visit(l[2])
        return present + expand

    # Visit a parse tree produced by EDRParser#unknown_abbr1.
    def visitUnknown_abbr1(self, ctx:EDRParser.Unknown_abbr1Context):
        l = list(ctx.getChildren())
        present = self.visit(l[0])
        return present

    # Visit a parse tree produced by EDRParser#unknown_abbr2.
    def visitUnknown_abbr2(self, ctx:EDRParser.Unknown_abbr2Context):
        l = list(ctx.getChildren())
        present = self.visit(l[0])
        return present

    # Visit a parse tree produced by EDRParser#desc.
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


    # Visit a parse tree produced by EDRParser#string.
    def visitString(self, ctx:EDRParser.StringContext):
        l = list(ctx.getChildren())
        if len(l) == 3:
            return self.visit(l[0]) + " " + self.visit(l[2])
        else:
            return self.visit(l[0])

    # Visit a parse tree produced by EDRParser#word.
    def visitWord(self, ctx:EDRParser.WordContext):
        l = list(ctx.getChildren())
        if len(l) == 2:
            return self.visit(l[0]) + self.visit(l[1])
        else:
            return self.visit(l[0])
        
    # Visit a parse tree produced by EDRParser#chunk.
    def visitChunk(self, ctx:EDRParser.ChunkContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])

    # Visit a parse tree produced by EDRParser#normal_chunk.
    def visitNormal_chunk(self, ctx:EDRParser.Normal_chunkContext):
        l = list(ctx.getChildren())
        if len(l) == 2:
            return self.getLetter(l[0].getText()) + self.visit(l[1])
        else:
            return self.getLetter(l[0].getText())
        
    # Visit a parse tree produced by EDRParser#under_helper.
    def visitUnder_helper(self, ctx:EDRParser.Under_helperContext):
        l = list(ctx.getChildren())
        if len(l) == 3:
            return self.getLetter(l[0].getText()) + self.visit(l[2])
        else:
            return self.getLetter(l[0].getText())

    # Visit a parse tree produced by EDRParser#under_chunk.
    def visitUnder_chunk(self, ctx:EDRParser.Under_chunkContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])
    
    # Visit a parse tree produced by EDRParser#dot_chunk.
    def visitDot_chunk(self, ctx:EDRParser.Dot_chunkContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])

    # Visit a parse tree produced by EDRParser#dot_helper.
    def visitDot_helper(self, ctx:EDRParser.Dot_helperContext):
        l = list(ctx.getChildren())
        if len(l) == 3:
            return self.visit(l[0]) + self.getLetter(l[1].getText())
        else:
            return self.getLetter(l[0].getText())
        
    # Visit a parse tree produced by EDRParser#lost_chunk.
    def visitLost_chunk(self, ctx:EDRParser.Lost_chunkContext):
        l = list(ctx.getChildren())
        if len(l) == 3:
            return self.visit(l[1])
        elif len(l) == 4:
            return self.visit(l[1])
        
    # Visit a parse tree produced by EDRParser#gap_unknown.
    def visitGap_unknown(self, ctx:EDRParser.Gap_unknownContext):
        return ""
    
    # Visit a parse tree produced by EDRParser#erased.
    def visitErased(self, ctx:EDRParser.ErasedContext):
        l = list(ctx.getChildren())
        return self.visit(l[2])
    
    # Visit a parse tree produced by EDRParser#illegible.
    def visitIllegible(self, ctx:EDRParser.IllegibleContext):
        return ""

    # Visit a parse tree produced by EDRParser#lost_lines_unknown.
    def visitLost_lines_unknown(self, ctx:EDRParser.Lost_lines_unknownContext):
        return ""
    
    # Visit a parse tree produced by EDRParser#lost_line.
    def visitLost_line(self, ctx:EDRParser.Lost_lineContext):
        return 1

    # Visit a parse tree produced by EDRParser#lost_lines.
    def visitLost_lines(self, ctx:EDRParser.Lost_linesContext):
        return ""
        
    # Visit a parse tree produced by EDRParser#surplus.
    def visitSurplus(self, ctx:EDRParser.SurplusContext):
        return ""
    
    # Visit a parse tree produced by EDRParser#joined.
    def visitJoined(self, ctx:EDRParser.JoinedContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])

    # Visit a parse tree produced by EDRParser#joined_helper.
    def visitJoined_helper(self, ctx:EDRParser.Joined_helperContext):
        l = list(ctx.getChildren())
        if len(l) == 3:
            return self.visit(l[0]) + l[2].getText()
        else:
            return self.visit(l[0])
    
    # Visit a parse tree produced by EDRParser#joined_letters.
    def visitJoined_letters(self, ctx:EDRParser.Joined_lettersContext):
        l = list(ctx.getChildren())
        return l[0].getText() + l[2].getText()
    
    # Visit a parse tree produced by EDRParser#symbol.
    def visitSymbol(self, ctx:EDRParser.SymbolContext):
        l = list(ctx.getChildren())
        sym = self.visit(l[2])
        return sym
    
    # Visit a parse tree produced by EDRParser#lost_chars.
    def visitLost_chars(self, ctx:EDRParser.Lost_charsContext):
        return ""
    
    # Visit a parse tree produced by EDRParser#lost_chars_known.
    def visitLost_chars_known(self, ctx:EDRParser.Lost_chars_knownContext):
        return ""
    
    # Visit a parse tree produced by EDRParser#editorial.
    def visitEditorial(self, ctx:EDRParser.EditorialContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])

    # Visit a parse tree produced by EDRParser#vacat.
    def visitVacat(self, ctx:EDRParser.VacatContext):
        return ""

    # Visit a parse tree produced by EDRParser#ianua.
    def visitIanua(self, ctx:EDRParser.IanuaContext):
        return ""
    
    # Visit a parse tree produced by EDRParser#subaudible.
    def visitSubaudible(self, ctx:EDRParser.SubaudibleContext):
        l = list(ctx.getChildren())
        if len(l) == 4:
            word = self.visit(l[2])
        else:
            word = self.visit(l[1])
        return word
    
    # Visit a parse tree produced by EDRParser#omitted.
    def visitOmitted(self, ctx:EDRParser.OmittedContext):
        l = list(ctx.getChildren())
        word = self.visit(l[1])
        return word
