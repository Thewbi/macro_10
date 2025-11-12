; example with created symbols (page 263)
DEFINE	INCW(R),<
	INC	R
	BNE	%Q
	INC	R+1
%Q:> ; %Q: is a label which uses a defined_symbol