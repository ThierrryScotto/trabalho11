grammar P;

// parcer
start           : PROGRAMA DECLARA declara* DEFINE define* EXECUTA executa FIMPROGRAMA;
declara         : declar_var;
declar_var      : ID ':' tipo ';';
tipo            : TEXTO | REAL | INTEIRO;
define          : define_func;   
define_func     : ID '(' (ID (',' ID)*)? ')' '{' declara* EXECUTA executa* '}';
chamada_funcao  : ID '(' (expr (',' expr)*)? ')';

atribuicao      : ID ':=' expr ';' ;
comando_retorna : RETORNA (expr | expr_logica | expr_literal) ';' ;
comando_imprime : IMPRIME '(' expr_literal ')' ';' ;
expr_literal    : expr ('&' expr)*;
comando_se      : SE expr_logica ENTAO executa* (SENAO executa*)? FIMSE;
expr_logica     : expr ('<' | '<=' | '>' | '>=' | '==' | '!=') expr;

expr            : NUMERO_INTEIRO 
                | NUMERO_REAL 
                | ID
                | chamada_funcao
                | expr ('*' | '/') expr 
                | expr ('+' | '-') expr
                ;

executa         : comando_se
                | atribuicao
                | comando_imprime
                | comando_retorna
                ;

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

NUMERO_INTEIRO  : DIGITO+;
NUMERO_REAL     : (DIGITO+ '.' DIGITO* | DIGITO* '.' DIGITO+);
DIGITO          : [0-9];
ID              : (LETRA | '_')+ (LETRA | DIGITO)*;
LETRA           : [a-zA-Z];

WS              : [ \t\r\n]+  -> skip;
