grammar EDR;

root: figural EOF;

figural: L_PAREN L_PAREN COLON string R_PAREN R_PAREN;

abbrev: word L_PAREN string R_PAREN;

misspell: word L_PAREN COLON string R_PAREN;

word: word LETTER | LETTER;

string: string word
        | word
        ;

L_PAREN: '(';
R_PAREN: ')';
COLON: ':';
LETTER : [A-Za-z\u03B1-\u03C9\u0391-\u03A9\u03D1-\u03D7];
WS: [ \n] -> skip;