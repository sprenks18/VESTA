grammar EDR;

root: inscription EOF;

inscription: line NEWLINE inscription
           | line;

line: term
    | term SPACE line
    ;

term: misspell | figural | abbrev | string;

figural: L_PAREN L_PAREN COLON desc R_PAREN R_PAREN;

misspell: word SPACE L_PAREN COLON string R_PAREN
        | word SPACE L_PAREN COLON string QUESTION R_PAREN
        ;

abbrev: word L_PAREN string R_PAREN #normal_abbr
      | word L_PAREN string QUESTION R_PAREN #uncertain_abbr
      | word L_PAREN DASH DASH DASH R_PAREN #unknown_abbr1
      | word L_PAREN DASH DASH DASH QUESTION R_PAREN #unknown_abbr2
      ;

desc: desc SPACE word PUNCT
    | desc SPACE word
    | word PUNCT
    | word
    ;

string: word SPACE string
      | word
      ;

word: word chunk | chunk;

chunk: normal_chunk | under_chunk | dot_chunk;

normal_chunk: LETTER normal_chunk | LETTER;

under_chunk: under_helper;

under_helper: LETTER UNDERLINE under_helper
            | LETTER UNDERLINE
            ;

dot_chunk: dot_helper;

dot_helper: dot_helper LETTER DOT
          | LETTER DOT
          ;

L_PAREN: '(';
R_PAREN: ')';
L_BRACKET: '[';
R_BRACKET: ']';
COLON: ':';
QUESTION: '?';
DASH: '-';
UNDERLINE: '&#818;';
CIRUMFLEX: '\u0302';
DOT: '&#803;';
LETTER : [A-Za-z];
SPACE: [ \t]+;
NEWLINE: [\n\r]+ | '<BR>' | '<br>';
PUNCT: '.' | ',';