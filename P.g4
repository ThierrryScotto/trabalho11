/*
ALUNO : LUCAS DE SOUZA SILVA LIMA | Thierry Alberto Scotto dos Santos
MATRÍCULA: 201917450  | 201825529
TRABALHO 2: COMPILADORES
COMPILADOR DA LINGUAGEM P
 */

grammar P;

// parcer
start           : PROGRAMA DECLARA declara* DEFINE define* EXECUTA executa* FIMPROGRAMA;
declara         : declar_var;
declar_var      : ID ':' tipo;

tipo            : TEXTO 
                | REAL 
                | INTEIRO
                ;

define          : define_func;   
define_func     : ID '(' (expr (',' expr)*)? ')' '{' DECLARA declara* EXECUTA executa* '}';

executa         : comando_se
                | comando_repita
                | atribuicao
                | comando_imprime
                | comando_retorna
                ;

comando_repita  : REPITA executa* ATE expr_logica;
chamada_funcao  : ID '(' (expr (',' expr)*)? ')';
atribuicao      : ID ':=' expr;

expr            : NUMERO_REAL 
                | NUMERO_INTEIRO
                | ID
                | STRING
                | chamada_funcao
                | expr ('*' | '/') expr 
                | expr ('+' | '-') expr
                ;

comando_retorna : RETORNA (expr | expr_logica | expr_literal);
comando_imprime : IMPRIME '(' expr_literal ')' ;
expr_literal    : expr ('&' expr)*;
comando_se      : SE expr_logica ENTAO executa* (SENAO executa*)? FIMSE;
expr_logica     : expr ('<' | '<=' | '>' | '>=' | '==' | '!=') expr;


// lexer
TEXTO           : 'texto';
REAL            : 'real';
INTEIRO         : 'inteiro';
PROGRAMA        : 'programa';
DECLARA         : 'declara';
DEFINE          : 'define';
EXECUTA         : 'executa';
FIMPROGRAMA     : 'fimprograma';
RETORNA         : 'retorna';
IMPRIME         : 'imprime';
SE              : 'se';
ENTAO           : 'entao';
SENAO           : 'senao';
FIMSE           : 'fimse';
REPITA          : 'REPITA';
ATE             : 'ATE';

NUMERO_REAL     : (DIGITO+ '.' DIGITO* | DIGITO* '.' DIGITO+);
NUMERO_INTEIRO  : DIGITO+;
DIGITO          : [0-9];
ID              : LETRA ('_' | LETRA | DIGITO)*;
LETRA           : [a-zA-Z];
STRING          : '"' .*? '"';

WS              : [ \t\r\n]+  -> skip;
