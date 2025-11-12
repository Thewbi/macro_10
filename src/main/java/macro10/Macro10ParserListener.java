// Generated from macro10\Macro10Parser.g4 by ANTLR 4.9.1
package macro10;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Macro10Parser}.
 */
public interface Macro10ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#asm_file}.
	 * @param ctx the parse tree
	 */
	void enterAsm_file(Macro10Parser.Asm_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#asm_file}.
	 * @param ctx the parse tree
	 */
	void exitAsm_file(Macro10Parser.Asm_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#assembler_instruction_line}.
	 * @param ctx the parse tree
	 */
	void enterAssembler_instruction_line(Macro10Parser.Assembler_instruction_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#assembler_instruction_line}.
	 * @param ctx the parse tree
	 */
	void exitAssembler_instruction_line(Macro10Parser.Assembler_instruction_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#assembler_instruction}.
	 * @param ctx the parse tree
	 */
	void enterAssembler_instruction(Macro10Parser.Assembler_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#assembler_instruction}.
	 * @param ctx the parse tree
	 */
	void exitAssembler_instruction(Macro10Parser.Assembler_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#ifdif}.
	 * @param ctx the parse tree
	 */
	void enterIfdif(Macro10Parser.IfdifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#ifdif}.
	 * @param ctx the parse tree
	 */
	void exitIfdif(Macro10Parser.IfdifContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#irpc}.
	 * @param ctx the parse tree
	 */
	void enterIrpc(Macro10Parser.IrpcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#irpc}.
	 * @param ctx the parse tree
	 */
	void exitIrpc(Macro10Parser.IrpcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#macro_definition}.
	 * @param ctx the parse tree
	 */
	void enterMacro_definition(Macro10Parser.Macro_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#macro_definition}.
	 * @param ctx the parse tree
	 */
	void exitMacro_definition(Macro10Parser.Macro_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#macro_params}.
	 * @param ctx the parse tree
	 */
	void enterMacro_params(Macro10Parser.Macro_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#macro_params}.
	 * @param ctx the parse tree
	 */
	void exitMacro_params(Macro10Parser.Macro_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#macro_param_list}.
	 * @param ctx the parse tree
	 */
	void enterMacro_param_list(Macro10Parser.Macro_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#macro_param_list}.
	 * @param ctx the parse tree
	 */
	void exitMacro_param_list(Macro10Parser.Macro_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#macro_param}.
	 * @param ctx the parse tree
	 */
	void enterMacro_param(Macro10Parser.Macro_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#macro_param}.
	 * @param ctx the parse tree
	 */
	void exitMacro_param(Macro10Parser.Macro_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#created_symbol}.
	 * @param ctx the parse tree
	 */
	void enterCreated_symbol(Macro10Parser.Created_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#created_symbol}.
	 * @param ctx the parse tree
	 */
	void exitCreated_symbol(Macro10Parser.Created_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#comma_list}.
	 * @param ctx the parse tree
	 */
	void enterComma_list(Macro10Parser.Comma_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#comma_list}.
	 * @param ctx the parse tree
	 */
	void exitComma_list(Macro10Parser.Comma_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#comma_list_element}.
	 * @param ctx the parse tree
	 */
	void enterComma_list_element(Macro10Parser.Comma_list_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#comma_list_element}.
	 * @param ctx the parse tree
	 */
	void exitComma_list_element(Macro10Parser.Comma_list_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#mnemonic_line}.
	 * @param ctx the parse tree
	 */
	void enterMnemonic_line(Macro10Parser.Mnemonic_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#mnemonic_line}.
	 * @param ctx the parse tree
	 */
	void exitMnemonic_line(Macro10Parser.Mnemonic_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#mnemonic}.
	 * @param ctx the parse tree
	 */
	void enterMnemonic(Macro10Parser.MnemonicContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#mnemonic}.
	 * @param ctx the parse tree
	 */
	void exitMnemonic(Macro10Parser.MnemonicContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(Macro10Parser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(Macro10Parser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Macro10Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Macro10Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#variable_definition}.
	 * @param ctx the parse tree
	 */
	void enterVariable_definition(Macro10Parser.Variable_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#variable_definition}.
	 * @param ctx the parse tree
	 */
	void exitVariable_definition(Macro10Parser.Variable_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#variable_equality_definition}.
	 * @param ctx the parse tree
	 */
	void enterVariable_equality_definition(Macro10Parser.Variable_equality_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#variable_equality_definition}.
	 * @param ctx the parse tree
	 */
	void exitVariable_equality_definition(Macro10Parser.Variable_equality_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(Macro10Parser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(Macro10Parser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(Macro10Parser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(Macro10Parser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Macro10Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Macro10Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#macro_call_line}.
	 * @param ctx the parse tree
	 */
	void enterMacro_call_line(Macro10Parser.Macro_call_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#macro_call_line}.
	 * @param ctx the parse tree
	 */
	void exitMacro_call_line(Macro10Parser.Macro_call_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Macro10Parser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(Macro10Parser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Macro10Parser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(Macro10Parser.Identifier_listContext ctx);
}