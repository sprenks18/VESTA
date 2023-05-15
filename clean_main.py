from antlr4 import *
from EDRLexer import EDRLexer
from EDRParser import EDRParser
from clean_visitor import EvalVisitor

def translate(text):
    input_stream = InputStream(text)
    lexer = EDRLexer(input_stream)
    lexer.removeErrorListeners()
    token_stream = CommonTokenStream(lexer)
    parser = EDRParser(token_stream)
    parser.removeErrorListeners()
    tree = parser.root()
    visitor = EvalVisitor()
    ret = visitor.visit(tree)
    return ret