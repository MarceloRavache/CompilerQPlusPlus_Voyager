grammar Compiler;

start : lista_definicoes EOF;

lista_definicoes
    : lista_definicoes definicao
    | definicao
    ;

definicao
    : funcao
    | estrutura
    ;

estrutura : STRUCT ID LBRACE lista_estrutura_corpo RBRACE SEMI;

lista_estrutura_corpo
    : lista_estrutura_corpo estrutura_acesso
    | estrutura_acesso
    ;

estrutura_acesso
    : PUBLIC COLON lista_estrutura_membros
    | PROTECTED COLON lista_estrutura_membros
    ;

lista_estrutura_membros
    : lista_estrutura_membros membro
    | membro
    ;

membro
    : construtor
    | variavel
    | metodo
    | STATIC variavel
    | STATIC funcao
    ;

variavel : tipo ID SEMI;

variavel_atribuicao : tipo ID ATRIB expressao SEMI;

construtor : ID LPAREN parametros_formais RPAREN bloco;

metodo : funcao_cabecalho qualificador bloco;

funcao : funcao_cabecalho bloco;

funcao_cabecalho : tipo ID LPAREN parametros_formais RPAREN;

parametros_formais
    : lista_parametros_formais
    | 
    ;

lista_parametros_formais
    : lista_parametros_formais COMMA tipo ID
    | tipo ID
    ;

tipo
    : VOID
    | qualificador INT decorador
    | qualificador CHAR decorador
    | qualificador BOOL decorador
    | qualificador tipo_nome decorador
    ;

tipo_nome
    : tipo_nome DBLCOL ID
    | ID
    ;

qualificador
    : CONST
    | 
    ;

decorador
    : AMPER
    |
    ;

bloco : LBRACE lista_declaracoes_locais lista_comandos RBRACE;

lista_comandos
    : lista_comandos comando
    | comando
    |
    ;

comando
    : bloco
    | selecao
    | repeticao
    | atribuicao
    | retorno
    | entrada
    | saida
    | expressao_comando
    | BREAK SEMI
    ;

selecao : IF LPAREN expressao RPAREN <lista_comandos> selecao_senao;

selecao_senao
    : ELSE lista_comandos
    | 
    ;

repeticao : WHILE LPAREN expressao RPAREN lista_comandos;

atribuicao : nome ATRIB expressao SEMI;

retorno : RETURN expressao_comando;

entrada : STDCIN lista_entrada_params SEMI;

lista_entrada_params
    : lista_entrada_params RSHIFT nome
    | nome
    | STDENDL
    ;

saida : STDCOUT lista_saida_params SEMI;

lista_saida_params
    : lista_saida_params LSHIFT expressao
    | expressao
    | STRL
    | STDENDL
    ;

lista_declaracoes_locais
    : variavel
    | variavel_atribuicao
    | 
    ;

expressao_comando
    : expressao SEMI
    | SEMI
    ;

expressao
    : LPAREN expressao RPAREN
    | expressao operador_binario expressao
    | operador_unario expressao
    | nome LPAREN parametros_reais RPAREN
    | nome
    | INTL
    | CHARL
    | TRUE
    | FALSE
    ;

operador_binario
    : <assoc=right> PLUS
    | <assoc=right> MINUS
    | TIMES
    | DIV
    | PLUS
    | MINUS
    | MOD
    | LT
    | LEQ
    | GT
    | GEQ
    | EQ
    | OR
    | AND
    | NEQ
    ;

operador_unario
    : <assoc=right> NOT
    | INCR
    | DECR
    | MINUS
    | NOT
    ;

nome
    : ID DBLCOL nome_lista
    | THIS ARROW nome_lista
    | nome_lista
    ;

nome_lista
    : ID DOT nome_lista
    | ID LPAREN parametros_reais RPAREN DOT nome_lista
    | ID
    ;

parametros_reais
    : lista_parametros_reais
    | 
    ;

lista_parametros_reais
    : lista_parametros_reais COMMA expressao
    | expressao
    ;

IF: 'if';
ELSE: 'else';
RETURN: 'return';
WHILE: 'while';
BREAK: 'break';

INT: 'int';
VOID: 'void';
BOOL: 'boolean';
CHAR: 'char';
STRUCT: 'struct';
CONST: 'const';
PUBLIC: 'public';
PROTECTED: 'protected';
STATIC: 'static';

COM: ( ( '//' ([a-zA-Z0-9])* '\n') | ('/*' ([a-zA-Z0-9])* '*/') ) -> skip;

PLUS : '+';
MINUS : '-';
TIMES : '*';
DIV : '/' ;
MOD : '%' ;
INCR : '++' ;
DECR : '--' ;
ATRIB : '=' ;
EQ : '==' ;
NEQ : '!=' ;
LT : '<' ;
LEQ : '<=' ;
GT :'>' ;
GEQ : '>=' ;
NOT : '!' ;
AND : '&&' ;
OR : '||' ;
DOT : '.' ;
ARROW : '->';
DBLCOL : '::' ;

LPAREN: '(' ;
RPAREN : ')';
LBRACE : '{';
RBRACE: '}';
DQUO : '"';
SQUO : '\'';

STDCIN: 'std::cin';
STDCOUT: 'std::cout';
STDENDL: 'std::endl';

INTL : ('-' | '+') | (('0') | [1-9] ([0-9])*);
CHARL : SQUO [a-zA-Z0-9] SQUO;
STRL: DQUO ([a-zA-Z0-9])* DQUO;
ID : [a-zA-Z] ( '_' | [a-zA-Z0-9])* ;

COMMA : ',';
SEMI: ';';
LSHIFT: '<<';
RSHIFT :'>>';
AMPER: '&';
COLON: ':';



DIR: '#' ([a-zA-Z0-9])*;

WHITE: (' ' | '\\t' | '\\n' | '\\0' | '"' | '\'') -> skip;

