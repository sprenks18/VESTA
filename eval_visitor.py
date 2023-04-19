
if __name__ is not None and "." in __name__:
    from .EDRVisitor import EDRVisitor
    from .EDRParser import EDRParser
else:
    from EDRVisitor import EDRVisitor
    from EDRParser import EDRParser

LINE_COUNT = "<lb n=\"%d\"/>\n"
MISSPELL = "<choice><reg>%s</reg><orig>%s</orig></choice>"
MISSPELL_UNCERTAIN = "<choice><reg cert=\"low\">%s</reg><orig>%s</orig></choice>"
FIGURAL = "<figure><figDesc>%s</figDesc></figure>"
ABBREV = "<expan><abbr>%s</abbr><ex>%s</ex></expan>"
ABBREV_UNCERTAIN = "<expan><abbr>%s</abbr><ex cert=\"low\">%s</ex></expan>"
ABBREV_UNKNOWN = "<abbr>%s</abbr>"
MISSING_CHARS = "<supplied reason=\"undefined\" evidence=\"previouseditor\">%s</supplied>"
UNCLEAR = "<unclear>%s</unclear>"

class EvalVisitor(EDRVisitor):

    def __init__(self):
        self._count = 1
        EDRVisitor.__init__(self)

    def visitRoot(self, ctx:EDRParser.RootContext):
        l = list(ctx.getChildren())
        return LINE_COUNT % (self._count) + self.visit(l[0])

    # Visit a parse tree produced by EDRParser#inscription.
    def visitInscription(self, ctx:EDRParser.InscriptionContext):
        l = list(ctx.getChildren())
        if len(l) == 3:
            self._count += 1
            return self.visit(l[0]) + "\n" + LINE_COUNT % (self._count,) + self.visit(l[2])
        else:
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


    # Visit a parse tree produced by EDRParser#misspell.
    def visitMisspell(self, ctx:EDRParser.MisspellContext):
        l = list(ctx.getChildren())
        original = self.visit(l[0])
        correct  = self.visit(l[4])
        if len(l) == 6:
            return MISSPELL % (correct, original)
        else:
            return MISSPELL_UNCERTAIN % (correct, original)

    # Visit a parse tree produced by EDRParser#normal_abbr.
    def visitNormal_abbr(self, ctx:EDRParser.Normal_abbrContext):
        l = list(ctx.getChildren())
        present = self.visit(l[0])
        expand  = self.visit(l[2])
        return ABBREV % (present, expand)

    # Visit a parse tree produced by EDRParser#uncertain_abbr.
    def visitUncertain_abbr(self, ctx:EDRParser.Uncertain_abbrContext):
        l = list(ctx.getChildren())
        present = self.visit(l[0])
        expand  = self.visit(l[2])
        return ABBREV_UNCERTAIN % (present, expand)

    # Visit a parse tree produced by EDRParser#unknown_abbr1.
    def visitUnknown_abbr1(self, ctx:EDRParser.Unknown_abbr1Context):
        l = list(ctx.getChildren())
        present = self.visit(l[0])
        return ABBREV_UNKNOWN % (present,)

    # Visit a parse tree produced by EDRParser#unknown_abbr2.
    def visitUnknown_abbr2(self, ctx:EDRParser.Unknown_abbr2Context):
        l = list(ctx.getChildren())
        present = self.visit(l[0])
        return ABBREV_UNKNOWN % (present,)

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
            return l[0].getText() + self.visit(l[1])
        else:
            return l[0].getText()
        
    # Visit a parse tree produced by EDRParser#under_helper.
    def visitUnder_helper(self, ctx:EDRParser.Under_helperContext):
        l = list(ctx.getChildren())
        if len(l) == 3:
            return l[0].getText() + self.visit(l[2])
        else:
            return l[0].getText()

    # Visit a parse tree produced by EDRParser#under_chunk.
    def visitUnder_chunk(self, ctx:EDRParser.Under_chunkContext):
        l = list(ctx.getChildren())
        return MISSING_CHARS % (self.visit(l[0]),)
    
    # Visit a parse tree produced by EDRParser#dot_chunk.
    def visitDot_chunk(self, ctx:EDRParser.Dot_chunkContext):
        l = list(ctx.getChildren())
        return UNCLEAR % (self.visit(l[0]),)

    # Visit a parse tree produced by EDRParser#dot_helper.
    def visitDot_helper(self, ctx:EDRParser.Dot_helperContext):
        l = list(ctx.getChildren())
        if len(l) == 3:
            return self.visit(l[0]) + l[1].getText()
        else:
            return l[0].getText()


