from antlr4 import *
from grammar.EDRLexer import EDRLexer
from grammar.EDRParser import EDRParser
from visitors.epidoc_visitor import EpidocVisitor
from visitors.clean_visitor import CleanVisitor

def translateToEpidoc(text):
    tree = getAST(text)
    visitor = EpidocVisitor()
    return visitor.visit(tree)

def translateToClean(text):
    tree = getAST(text)
    visitor = CleanVisitor()
    return visitor.visit(tree)

def getAST(text):
    input_stream = InputStream(text)
    lexer = EDRLexer(input_stream)
    lexer.removeErrorListeners()
    token_stream = CommonTokenStream(lexer)
    parser = EDRParser(token_stream)
    parser.removeErrorListeners()
    return parser.root()

#input_stream = FileStream("inscription.txt", encoding='utf-8')
# print(tree.toStringTree(recog=parser))