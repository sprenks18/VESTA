# Generated from EDR.g by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .EDRParser import EDRParser
else:
    from EDRParser import EDRParser

# This class defines a complete generic visitor for a parse tree produced by EDRParser.

class EDRVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by EDRParser#root.
    def visitRoot(self, ctx:EDRParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#inscription1.
    def visitInscription1(self, ctx:EDRParser.Inscription1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#inscription2.
    def visitInscription2(self, ctx:EDRParser.Inscription2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#row.
    def visitRow(self, ctx:EDRParser.RowContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#line.
    def visitLine(self, ctx:EDRParser.LineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#term.
    def visitTerm(self, ctx:EDRParser.TermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#figural.
    def visitFigural(self, ctx:EDRParser.FiguralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#misspell.
    def visitMisspell(self, ctx:EDRParser.MisspellContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#normal_abbr.
    def visitNormal_abbr(self, ctx:EDRParser.Normal_abbrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#uncertain_abbr.
    def visitUncertain_abbr(self, ctx:EDRParser.Uncertain_abbrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#unknown_abbr1.
    def visitUnknown_abbr1(self, ctx:EDRParser.Unknown_abbr1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#unknown_abbr2.
    def visitUnknown_abbr2(self, ctx:EDRParser.Unknown_abbr2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#desc.
    def visitDesc(self, ctx:EDRParser.DescContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#string.
    def visitString(self, ctx:EDRParser.StringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#word.
    def visitWord(self, ctx:EDRParser.WordContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#chunk.
    def visitChunk(self, ctx:EDRParser.ChunkContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#normal_chunk.
    def visitNormal_chunk(self, ctx:EDRParser.Normal_chunkContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#under_chunk.
    def visitUnder_chunk(self, ctx:EDRParser.Under_chunkContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#under_helper.
    def visitUnder_helper(self, ctx:EDRParser.Under_helperContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#dot_chunk.
    def visitDot_chunk(self, ctx:EDRParser.Dot_chunkContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#dot_helper.
    def visitDot_helper(self, ctx:EDRParser.Dot_helperContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#erased.
    def visitErased(self, ctx:EDRParser.ErasedContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#lost_chunk.
    def visitLost_chunk(self, ctx:EDRParser.Lost_chunkContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#gap_unknown.
    def visitGap_unknown(self, ctx:EDRParser.Gap_unknownContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#illegible.
    def visitIllegible(self, ctx:EDRParser.IllegibleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#lost_lines_unknown.
    def visitLost_lines_unknown(self, ctx:EDRParser.Lost_lines_unknownContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#lost_line.
    def visitLost_line(self, ctx:EDRParser.Lost_lineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#lost_lines.
    def visitLost_lines(self, ctx:EDRParser.Lost_linesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by EDRParser#surplus.
    def visitSurplus(self, ctx:EDRParser.SurplusContext):
        return self.visitChildren(ctx)



del EDRParser