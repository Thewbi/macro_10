// $antlr-format alignTrailingComments true, columnLimit 150, minEmptyLines 1, maxEmptyLinesToKeep 1, reflowComments false, useTab false
// $antlr-format allowShortRulesOnASingleLine false, allowShortBlocksOnASingleLine true, alignSemicolons hanging, alignColons hanging

// start symbol: asm_file

parser grammar Macro10Parser;

options {
    language = Java;
    tokenVocab = Macro10Lexer;
}

asm_file :
    variable_definition
    |
    variable_equality_definition
    |
	mnemonic_line
	| 
	assembler_instruction_line
	|
	macro_call_line
	;

assembler_instruction_line :
	assembler_instruction
	;
	
assembler_instruction :
	  macro_definition 
    | IFE expr COMMA block 
    | IFN expr COMMA block
    | FNS
	;
	
macro_definition : 
	DEFINE ( IDENTIFIER | mnemonic) macro_params? COMMA block
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
	label? mnemonic ( block | param_list )
	;
	
mnemonic :
	  LDA 
	| LDAI // <---- is a pseudo instruction!!!!
    | LDYI // <---- is a pseudo instruction!!!!
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
	IDENTIFIER COLON
	;
	
block : LOWERTHAN ( IDENTIFIER | expr | mnemonic_line | assembler_instruction_line | macro_call_line | variable_definition | variable_equality_definition )+ GREATERTHAN
	;
	
variable_definition :
	IDENTIFIER EQ expr
	;
	
variable_equality_definition :
	IDENTIFIER ASSIGN expr
	;
	
param_list :
	param param_list
	|
	param
	;
	
param :
	expr
	;
	
expr :
	CARET expr
	| expr AMPERSAND expr
    | expr PLUS expr
    | expr MUL expr
	| expr DIV expr
    | expr MINUS expr
	| block 
	| IDENTIFIER 
	| INTEGER
    | DOT
	;
	
// IDENTIFIER for the macro the a comma separated list of parameters
macro_call_line :
	IDENTIFIER identifier_list
	;
	
identifier_list :
	IDENTIFIER COMMA identifier_list
	|
	IDENTIFIER
	;