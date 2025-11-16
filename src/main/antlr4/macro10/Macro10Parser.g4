// $antlr-format alignTrailingComments true, columnLimit 150, minEmptyLines 1, maxEmptyLinesToKeep 1, reflowComments false, useTab false
// $antlr-format allowShortRulesOnASingleLine false, allowShortBlocksOnASingleLine true, alignSemicolons hanging, alignColons hanging

// start symbol: asm_file

parser grammar Macro10Parser;

options {
    language = Java;
    tokenVocab = Macro10Lexer;
}

asm_file :
    (
    label
    |
    variable_definition
    |
    variable_equality_definition
    |
	mnemonic_line
	| 
	assembler_instruction_line
	|
	macro_call_line
    |
    raw_data_line
    )*
	;

assembler_instruction_line :
	assembler_instruction
	;
	
assembler_instruction :
      irpc
    | ifdif
	| macro_definition 
    | FNS
    | conditional_assembly
    | ORG INTEGER
    | PAGE 
    | RADIX INTEGER
    | SALL
    | SEARCH IDENTIFIER
    | SUBTTL
    | TITLE
    | label? ADR expr
    | END expr
	;

irpc : IRPC IDENTIFIER COMMA? block
    ;

ifdif : IFDIF block block COMMA block
    ;
	
macro_definition : 
	DEFINE ( IDENTIFIER | mnemonic ) macro_params? COMMA block
    ;

macro_params : 
	macro_param_list
	|
	LPAREN macro_param_list RPAREN
	;
	
macro_param_list :     
	macro_param macro_param_list
	|
	macro_param
	;

macro_param :
    IDENTIFIER
    ;

conditional_assembly :
      IFE expr COMMA block 
    | IFN expr COMMA block
    ;

created_symbol :
    PERCENT IDENTIFIER
    ;
	
comma_list : 
	comma_list_element comma_list
	|
	comma_list_element
	;
	
comma_list_element :
	expr
	|
	block
	;
	
mnemonic_line :
	label? EXCLAMATION? mnemonic ( block | param_list COMMA? )?
	;
	
mnemonic :
      CMPI
	| LDAI // <---- is a pseudo instruction!!!!
    | LDYI // <---- is a pseudo instruction!!!!
    | SBCI // <---- is a pseudo instruction!!!!

//	| https://www.masswerk.at/6502/6502_instruction_set.html
    | ADC | AND | ASL
    | BCC | BCS | BEQ | BIT | BMI | BNE | BPL | BRK | BVC | BVS
    | CLC | CLD | CLI | CLV | CMP | CPX | CPY
    | DEC | DEX | DEY
    | EOR
    | INC | INX | INY
    | JMP | JSR
    | LDA | LDX | LDY | LSR
    | NOP
    | ORA
    | PHA | PHP | PLA | PLP
    | ROL | ROR | RTI | RTS
    | SBC | SEC | SED | SEI | STA | STX | STY
    | TAX | TAY | TSX | TXA | TXS | TYA
	;
	
label :
    CUSTOM_START_LABEL COLON
    |
	IDENTIFIER COLON
    |
    created_symbol COLON
	;

block : 
    QUOTE_BLOCK
    |
    LOWERTHAN ( StringLiteral | label | IDENTIFIER | expr | mnemonic_line | assembler_instruction_line | macro_call_line | variable_definition | variable_equality_definition )+ GREATERTHAN
	;
	
variable_definition :
	IDENTIFIER EQ expr
	;
	
variable_equality_definition :
	IDENTIFIER ASSIGN expr
	;
	
param_list :
	param COMMA param_list
	|
	param
	;
	
param :
	expr
	;
	
expr :
	  CARET expr
    | LPAREN expr RPAREN
	| expr AMPERSAND expr
    | expr PLUS expr
    | expr MINUS expr
    | expr MUL expr
	| expr DIV expr
    | expr ASSIGN expr
	| block 
	| IDENTIFIER
    | StringLiteral
	| INTEGER
    | DOT
    | created_symbol
    | END
	;
	
// IDENTIFIER for the macro the a comma separated list of parameters
macro_call_line :
	label? IDENTIFIER param_list
	;

raw_data_line :
    label? INTEGER
    ;
	
identifier_list :
	IDENTIFIER COMMA identifier_list
	|
	IDENTIFIER
	;