grammar Compiler;

start : definicao* EOF;

definicao
    : funcao #Func
    | estrutura #Estru
    ;

estrutura : STRUCT ID LBRACE estrutura_acesso* RBRACE SEMI;

estrutura_acesso
    : PUBLIC COLON membro*  #PublicEstr
    | PROTECTED COLON membro*   #ProtectedEstr
    ;

membro
    : construtor    #ConstrutorFunc
    | variavel      #VariavelFunc
    | metodo        #MetodoFunc
    | STATIC variavel   #VarStatic
    | STATIC funcao     #FuncStatic
    ;

variavel : tipo ID SEMI;

variavel_atribuicao : tipo ID ATRIB expressao SEMI;

construtor : ID LPAREN parametros_formais RPAREN bloco;

metodo : funcao_cabecalho qualificador bloco;

funcao : funcao_cabecalho bloco;

funcao_cabecalho : tipo ID LPAREN lista_parametros_formais RPAREN;

parametros_formais
    : lista_parametros_formais      #FormParam
    | #FormEmpyParam
    ;

lista_parametros_formais
    : lista_parametros_formais COMMA tipo ID        #FormParamListId
    | tipo ID   #FormParamId
    ;

tipo
    : VOID #VoidExpr
    | qualificador INT decorador #IntExpr
    | qualificador CHAR decorador #CharExpr
    | qualificador BOOL decorador #BoolExpr
    | qualificador tipo_nome decorador #ObjectExpr
    ;

tipo_nome
    : tipo_nome DBLCOL ID #ChamadaMultID
    | ID #ChamadaID
    ;

qualificador
    : CONST #ConstQuali
    | #EmptyQuali
    ;

decorador
    : AMPER #AmperDecor
    | #EmptyDecor
    ;

bloco : LBRACE lista_declaracoes_locais lista_comandos RBRACE;

lista_comandos
    : lista_comandos comando #MultCommand
    | comando #Command
    | #CommandEmpty
    ;

comando
    : bloco #CommandBloco
    | selecao #CommandSelecao
    | repeticao #CommandRepeticao
    | atribuicao #CommandAtrib
    | retorno #CommandRet
    | entrada #CommandIn
    | saida #CommandOut
    | expressao_comando #CommandExpr
    | BREAK SEMI #CommandFim
    ;

selecao : IF LPAREN expressao RPAREN lista_comandos selecao_senao;

selecao_senao
    : ELSE lista_comandos #SenaoExpr
    | #SenaoVazio
    ;

repeticao : WHILE LPAREN expressao RPAREN lista_comandos;

atribuicao : nome ATRIB expressao SEMI;

retorno : RETURN expressao_comando;

entrada : STDCIN (RSHIFT parametro_entrada)+ SEMI;

parametro_entrada
    : nome #NomeParamEntrada
    | STDENDL #EndlParamEntrada
    ;

saida : STDCOUT (LSHIFT parametro_saida)+ SEMI;

parametro_saida
    : expressao #ExprParamSaida
    | STRL #StringParamSaida
    | STDENDL #EndlParamSaida
    ;

lista_declaracoes_locais
    : variavel #VariavelDecl
    | variavel_atribuicao #VariavelAtribDecl
    | #VariavelVazio
    ;

expressao_comando
    : expressao SEMI #ReturnExpr
    | SEMI #ReturnEmpty
    ;

expressao
    : LPAREN expressao RPAREN   #ParemExpr
    | expressao operador_binario expressao  #OpBinExpr
    | operador_unario expressao #OpUnExpr
    | nome LPAREN parametros_reais RPAREN   #FuncCallExpr
    | nome #NomeExpr
    | INTL #IntlExpr
    | CHARL #CharlExpr
    | TRUE #TrueExpr
    | FALSE #FalseExpr
    ;

operador_binario
    : <assoc=right> PLUS #PlusExpr
    | <assoc=right> MINUS #MinusExprBinario
    | TIMES #TimesExpr
    | DIV #DivExpr
    | MOD #ModExpr
    | LT #LtExpr
    | LEQ #LeqExpr
    | GT #GtExpr
    | GEQ #GeqExpr
    | EQ #EqExpr
    | OR #OrExpr
    | AND #AndExpr
    | NEQ #NeqExpr
    ;

operador_unario
    : <assoc=right> NOT #NotExpr
    | INCR #IncrExpr
    | DECR #DecrExpr
    | MINUS #MinusExprUnario
    ;

nome
    : ID DBLCOL nome_lista #ChamadaDeClasse
    | THIS ARROW nome_lista #ChamadaDePonteiro
    | nome_lista    #NomeList
    ;

nome_lista
    : ID DOT nome_lista #AcessoVariavel
    | ID LPAREN parametros_reais RPAREN DOT nome_lista #AcessoFunc
    | ID #AcessoFinal
    ;

parametros_reais  //resumir
    : expressao (COMMA expressao)* #ParamReaisExpr
    | #VazioExpr
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

