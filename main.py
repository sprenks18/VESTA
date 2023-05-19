from antlr4 import *
from grammar.EDRLexer import EDRLexer
from grammar.EDRParser import EDRParser
from eval_visitor import EvalVisitor

def translate(text):
    #input_stream = FileStream("inscription.txt", encoding='utf-8')
    input_stream = InputStream(text)
    lexer = EDRLexer(input_stream)
    lexer.removeErrorListeners()
    token_stream = CommonTokenStream(lexer)
    parser = EDRParser(token_stream)
    parser.removeErrorListeners()
    tree = parser.root()
    # print(tree.toStringTree(recog=parser))
    visitor = EvalVisitor()
    ret = visitor.visit(tree)
    return ret