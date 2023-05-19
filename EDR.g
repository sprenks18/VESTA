grammar EDR;

root: column EOF;

column: inscription
      | COLUMN NEWLINE inscription
      | COLUMN NEWLINE inscription NEWLINE column;

inscription: content NEWLINE inscription
           | content NEWLINE
           | content
           ;

content: horz | perp;

row: line | lost_lines_unknown | lost_lines;

perp: PERPENDICULUM NEWLINE row;

horz: row;

line: term
    | term SPACE line
    ;

term: misspell | figural | abbrev | string | editorial;

figural: L_PAREN L_PAREN COLON desc R_PAREN R_PAREN;

misspell: word SPACE L_PAREN COLON string R_PAREN #normal_misspell
        | word L_PAREN COLON string R_PAREN #no_space_misspell
        | word SPACE L_PAREN COLON string QUESTION R_PAREN #unsure_misspell
        | word L_PAREN COLON string QUESTION R_PAREN #unsure_no_space_misspell
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

// The order of these matters (lost chunk is technically recursive [TODO - fix this])
chunk: normal_chunk | under_chunk | dot_chunk | erased | lost_chunk
     | gap_unknown | illegible | surplus | joined | symbol | lost_chars
     | lost_chars_known | omitted;

normal_chunk: LETTER normal_chunk | LETTER;

under_chunk: under_helper;

under_helper: LETTER UNDERLINE under_helper
            | LETTER UNDERLINE
            ;

dot_chunk: dot_helper;

dot_helper: dot_helper LETTER DOT
          | LETTER DOT
          ;

erased: L_BRACKET L_BRACKET line R_BRACKET R_BRACKET;

lost_chunk: L_BRACKET line R_BRACKET
          | L_BRACKET line QUESTION R_BRACKET
          ;

gap_unknown: L_BRACKET DASH DASH DASH R_BRACKET
           | L_BRACKET SPACE DASH SPACE DASH SPACE DASH SPACE R_BRACKET
           | L_BRACKET DASH SPACE DASH SPACE DASH R_BRACKET;

illegible: PLUS illegible
         | PLUS; 

lost_lines_unknown: DASH DASH DASH DASH DASH DASH
                  | DASH SPACE DASH SPACE DASH SPACE DASH SPACE DASH SPACE DASH
                  ;

lost_chars_known: L_BRACKET dashes R_BRACKET;

lost_line: L_BRACKET DASH DASH DASH DASH DASH DASH R_BRACKET;

lost_lines: lost_lines NEWLINE lost_line
          | lost_line;

surplus: L_CURLY word R_CURLY; 

joined: joined_helper;

joined_helper: joined_letters CIRCUMFLEX LETTER
             | joined_letters;

joined_letters: LETTER CIRCUMFLEX LETTER;

symbol: L_PAREN L_PAREN word R_PAREN R_PAREN;

lost_chars: L_BRACKET PLUS NUM QUESTION PLUS R_BRACKET;

// Allow for 1,2,4,5, and more (3 and 6 are reserved with separate meaning)
dashes: DASH | DASH DASH | DASH DASH DASH DASH | 
        DASH DASH DASH DASH DASH | DASH DASH DASH DASH DASH DASH dashes;

editorial: vacat | ianua | subaudible;

vacat: VACAT;
ianua: IANUA;
subaudible: L_ANGLE COLON normal_chunk R_ANGLE
       | L_PAREN normal_chunk R_PAREN;

omitted: L_ANGLE normal_chunk R_ANGLE;

// Tokens
L_PAREN: '(';
R_PAREN: ')';
L_BRACKET: '[';
R_BRACKET: ']';
L_CURLY: '{';
R_CURLY: '}';
COLON: ':';
QUESTION: '?';
DASH: '-';
PLUS: '+';
UNDERLINE: '&#818;';
CIRCUMFLEX: '&#770;';
DOT: '&#803;';
LETTER : [A-Za-z]
       | CAPITAL_GREEK
       | LOWER_GREEK;
CAPITAL_GREEK: '&#9'('13'|'14'|'15'|'16'|'17'|'18'|'19'|'20'|
               '21'|'22'|'23'|'24'|'25'|'26'|'27'|'28'|
               '29'|'31'|'32'|'33'|'34'|'35'|'36'|'37')';';
LOWER_GREEK: '&#9'('45'|'46'|'47'|'48'|'49'|'50'|'51'|'52'|
             '53'|'54'|'55'|'56'|'57'|'58'|'59'|'60'|
             '61'|'62'|'63'|'64'|'65'|'66'|'67'|'68'|'69')';';
SPACE: [ \t]+;
NEWLINE: [ ]* (LINE_BREAK)+ [ ]*;
LINE_BREAK: [\n\r] | '<BR>' | '<br>';
PUNCT: '.' | ',';
NUM: [0-9]+;
L_ANGLE: '&#12296;' | '<';
R_ANGLE: '&#12297;' | '>';
VACAT: L_ANGLE':vacat'R_ANGLE;
IANUA: L_ANGLE':ianua'R_ANGLE;
PERPENDICULUM: L_ANGLE':ad perpendiculum'R_ANGLE;
COLUMN: L_ANGLE ':columna' SPACE [IVX]+ R_ANGLE; 
