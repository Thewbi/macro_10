// Generated from macro10\Macro10Parser.g4 by ANTLR 4.9.1
package macro10;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Macro10Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Macro10ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#asm_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsm_file(Macro10Parser.Asm_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#assembler_instruction_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssembler_instruction_line(Macro10Parser.Assembler_instruction_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#assembler_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssembler_instruction(Macro10Parser.Assembler_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#macro_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_definition(Macro10Parser.Macro_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#macro_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_params(Macro10Parser.Macro_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#macro_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_param_list(Macro10Parser.Macro_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#macro_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_param(Macro10Parser.Macro_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#comma_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_list(Macro10Parser.Comma_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#comma_list_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_list_element(Macro10Parser.Comma_list_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#mnemonic_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMnemonic_line(Macro10Parser.Mnemonic_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#mnemonic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMnemonic(Macro10Parser.MnemonicContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(Macro10Parser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Macro10Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#variable_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_definition(Macro10Parser.Variable_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#variable_equality_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_equality_definition(Macro10Parser.Variable_equality_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(Macro10Parser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(Macro10Parser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Macro10Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#macro_call_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_call_line(Macro10Parser.Macro_call_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link Macro10Parser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(Macro10Parser.Identifier_listContext ctx);
}