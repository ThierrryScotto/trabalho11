// Generated from P.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PParser}.
 */
public interface PListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#declara}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(PParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#declara}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(PParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#declar_var}.
	 * @param ctx the parse tree
	 */
	void enterDeclar_var(PParser.Declar_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#declar_var}.
	 * @param ctx the parse tree
	 */
	void exitDeclar_var(PParser.Declar_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(PParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(PParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(PParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(PParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#define_func}.
	 * @param ctx the parse tree
	 */
	void enterDefine_func(PParser.Define_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#define_func}.
	 * @param ctx the parse tree
	 */
	void exitDefine_func(PParser.Define_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#executa}.
	 * @param ctx the parse tree
	 */
	void enterExecuta(PParser.ExecutaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#executa}.
	 * @param ctx the parse tree
	 */
	void exitExecuta(PParser.ExecutaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#comando_repita}.
	 * @param ctx the parse tree
	 */
	void enterComando_repita(PParser.Comando_repitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#comando_repita}.
	 * @param ctx the parse tree
	 */
	void exitComando_repita(PParser.Comando_repitaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_funcao(PParser.Chamada_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_funcao(PParser.Chamada_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(PParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(PParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#comando_retorna}.
	 * @param ctx the parse tree
	 */
	void enterComando_retorna(PParser.Comando_retornaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#comando_retorna}.
	 * @param ctx the parse tree
	 */
	void exitComando_retorna(PParser.Comando_retornaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#comando_imprime}.
	 * @param ctx the parse tree
	 */
	void enterComando_imprime(PParser.Comando_imprimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#comando_imprime}.
	 * @param ctx the parse tree
	 */
	void exitComando_imprime(PParser.Comando_imprimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#expr_literal}.
	 * @param ctx the parse tree
	 */
	void enterExpr_literal(PParser.Expr_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#expr_literal}.
	 * @param ctx the parse tree
	 */
	void exitExpr_literal(PParser.Expr_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#comando_se}.
	 * @param ctx the parse tree
	 */
	void enterComando_se(PParser.Comando_seContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#comando_se}.
	 * @param ctx the parse tree
	 */
	void exitComando_se(PParser.Comando_seContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#expr_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpr_logica(PParser.Expr_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#expr_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpr_logica(PParser.Expr_logicaContext ctx);
}