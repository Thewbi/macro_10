// $antlr-format alignTrailingComments true, columnLimit 150, maxEmptyLinesToKeep 1, reflowComments false, useTab false
// $antlr-format allowShortRulesOnASingleLine true, allowShortBlocksOnASingleLine true, minEmptyLines 0, alignSemicolons ownLine
// $antlr-format alignColons trailing, singleLineOverrulesHangingColon true, alignLexerCommands true, alignLabels true, alignTrailers true

// start symbol: asm_file

lexer grammar Macro10Lexer;

// case insensitive chars
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

//
// 6502 Mnemonics
//

ADC : A D C ; // add with carry
AND : A N D ; // and (with accumulator)
ASL : A S L ; // arithmetic shift left
BCC : B C C ; // branch on carry clear
BCS : B C S ; // branch on carry set
BEQ : B E Q ; // branch on equal (zero set)
BIT : B I T ; // bit test
BMI : B M I ; // branch on minus (negative set)
BNE : B N E ; // branch on not equal (zero clear)
BPL : B P L ; // branch on plus (negative clear)
BRK : B R K ; // break / interrupt
BVC : B V C ; // branch on overflow clear
BVS : B V S ; // branch on overflow set
CLC : C L C ; // clear carry
CLD : C L D ; // clear decimal
CLI : C L I ; // clear interrupt disable
CLV : C L V ; // clear overflow
CMP : C M P ; // compare (with accumulator)
CPX : C P X ; // compare with X
CPY : C P Y ; // compare with Y
DEC : D E C ; // decrement
DEX : D E X ; // decrement X
DEY : D E Y ; // decrement Y
EOR : E O R ; // exclusive or (with accumulator)
INC : I N C ; // increment
INX : I N X ; // increment X
INY : I N Y ; // increment Y
JMP : J M P ; // jump
JSR : J S R ; // jump subroutine
LDA : L D A ; // load accumulator
LDX : L D X ; // load X
LDY : L D Y ; // load Y
LSR : L S R ; // logical shift right
NOP : N O P ; // no operation
ORA : O R A ; // or with accumulator
PHA : P H A ; // push accumulator
PHP : P H P ; // push processor status (SR)
PLA : P L A ; // pull accumulator
PLP : P L P ; // pull processor status (SR)
ROL : R O L ; // rotate left
ROR : R O R ; // rotate right
RTI : R T I ; // return from interrupt
RTS : R T S ; // return from subroutine
SBC : S B C ; // subtract with carry
SEC : S E C ; // set carry
SED : S E D ; // set decimal
SEI : S E I ; // set interrupt disable
STA : S T A ; // store accumulator
STX : S T X ; // store X
STY : S T Y ; // store Y
TAX : T A X ; // transfer accumulator to X
TAY : T A Y ; // transfer accumulator to Y
TSX : T S X ; // transfer stack pointer to X
TXA : T X A ; // transfer X to accumulator
TXS : T X S ; // transfer X to stack pointer
TYA : T Y A ; // transfer Y to accumulator

//
// PSEUDO INSTRUCTIONS
//

LDAI : L D A I ;
LDYI : L D Y I ;

//
// Assembler Instructions
//

DEFINE : D E F I N E ;

FNS : F N S ;

IFN : I F N ;
IFE : I F E ;

DOUBLESTAR    : '**'  ;
ASSIGN        : '=='  ;
LE            : '<='  ;
GE            : '>='  ;
ARROW         : '=>'  ;
NEQ           : '/='  ;
VARASGN       : ':='  ;
BOX           : '<>'  ;
DBLQUOTE      : '"'   ;
SEMI          : ';'   ;
COMMA         : ','   ;
AMPERSAND     : '&'   ;
LPAREN        : '('   ;
RPAREN        : ')'   ;
LBRACKET      : '['   ;
RBRACKET      : ']'   ;
COLON         : ':'   ;
MUL           : '*'   ;
DIV           : '/'   ;
PLUS          : '+'   ;
MINUS         : '-'   ;
LOWERTHAN     : '<'   ;
GREATERTHAN   : '>'   ;
EQ            : '='   ;
BAR           : '|'   ;
DOT           : '.'   ;
BACKSLASH     : '\\'  ;
CARET         : '^'   ;

LETTER
  : 'a'..'z' | 'A'..'Z'
  ;

IDENTIFIER
  : LETTER ( '_' ( LETTER | DIGIT ) | LETTER | DIGIT )*
  ;

INTEGER
  : DIGIT ( '_' | DIGIT )*
  ;

DIGIT
  : '0'..'9'
  ;

COMMENT
  : ';' ( ~'\n' )*
  -> skip
  ;

WS  
  : [ \t\r\n]+ -> skip 
  ;