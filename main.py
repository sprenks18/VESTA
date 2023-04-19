from antlr4 import *
from EDRLexer import EDRLexer
from EDRParser import EDRParser
from eval_visitor import EvalVisitor

def translate(text):
    #input_stream = FileStream("inscription.txt", encoding='utf-8')
    input_stream = InputStream(text)
    lexer = EDRLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = EDRParser(token_stream)
    tree = parser.root()
    # print(tree.toStringTree(recog=parser))
    visitor = EvalVisitor()
    ret = visitor.visit(tree)
    return ret