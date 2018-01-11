/**
  KoKoslan Grammar
  EIF400 II-2017
  @author loriacarlo@gmail.com
  @since 2017
*/

grammar KoKoslan;


program      : definition* ('!')* expression
;
definition   : 'let' id '=' ( expression | negation)
;
expression   : ( part_expr (',' part_expr)* ) | negation
;
part_expr    :  lambda_expr | evaluable_expr | negation | lambda_llaves
;
lambda_expr  : '\\' pattern '.' expression
;
lambda_llaves  :  '{' expression '->' expression ('|' expression '->' expression)* '}'
;
evaluable_expr    :  add_expr test_expr?			#EvalAddTest
					 | '(' add_oper ')' test_expr?  #EvalAddTestParentesis
					 | '(' condition ')' test_expr? #EvalConditionParent
					 | condition test_expr? 		#EvalConditionExpr
					 | insert_list_pat              #InsertListPat
;
add_expr          :  mult_expr (add_oper mult_expr)*
;
add_oper          : oper=('+' | '-')
;
mult_expr         :  value_expr (mult_oper value_expr)*
;
mult_oper         : oper=('*' | '/')
;
test_expr         :  '?' expression ':' expression
;
condition 	:	cont ( boolean_oper cont )*
;
negation  :   neg_oper+ condition
;
neg_oper  : '!'
;
cont  :  (lambda_expr | add_expr | list_value)
;
boolean_oper  : oper = ( '==' | '>' | '<' | '!=' | '<=' | '||' | '&&')
;
// Value Expressions
value_expr   :    '(' expression ')' 	#ParentValueExpr
                 | value_expr call_args	#callValueExpr
                 | atomic_value 		#AtomicValueExpr
				 | list_value 			#ListValueExpr
                 | case_value			#CaseValueExpr
				 | negation				#CaseNegation	
;
call_args	:	'(' list_expr? ')' ( '(' list_expr? ')' )*
;
atomic_value : id | number | bool 
;
// List expressions
list_value   :  '[' list_expr? ']'
; 
list_expr    :  expression ( ','  expression)*
;

insert_list_pat :'[' atomic_pat '|' atomic_pat ']'
;

// Case expressions
case_value   :  '{' case_expr? '}'
;
case_expr    :  lambda_expr ( ','  lambda_expr)*
;

// Patterns
pattern      :  atomic_pat | list_pat
;
atomic_pat   : id | number | bool 
;
 list_pat    : '[' list_body_pat? ']'
;
list_body_pat : pattern (',' pattern)* rest_body_pat?
;
rest_body_pat : '|' (id | list_pat)
;
id : ID
;
number : NUMBER
;
bool : TRUE | FALSE
;

left_par : LEFT_PAR
;
print  : 'print' '(' expression ')'
;
first : 'first' '(' list_value ')'
;
rest : 'rest' '(' list_value ')'
;
cons  :  'cons' '(' list_value  ( ',' list_value )* ')'
;
fail  : 'fail' '(' ')'
;

////////////////////////////////////////////////////////////////
//                    Lexer    
///////////////////////////////////////////////////////////////
NUMBER : ('-')? INTEGER ('.' INTEGER)? 
;
fragment INTEGER : [0-9]+ ;

STRING : ('"' (~'"')* '"' )
;
DOT : '.'
;
BACK_SLASH : '\\'
;
COMMA : ','
;
COLON : ':'
;
QUESTION_MARK : '?'
;
LEFT_PAR : '('
;
RIGHT_PAR : ')'
;
LEFT_CURLY : '{'
;
RIGHT_CURLY : '}'
;
LEFT_BRACKET : '['
;
RIGHT_BRACKET : ']'
;
LET : 'let'
;
NOT : '!'
;
EQ : '='
;
NEQ : '!='
;
LEQ : '<='
;
OR : '||'
;
AND : '&&'
;
TRUE : 'true'
;
FALSE : 'false'
;
MUL :   '*' 
; 
DIV :   '/' 
;
ADD :   '+' 
;
SUB :   '-' 
;
ID : [a-zA-Z][a-zA-Z_0-9]* 
;
MAYOR_QUE  :  '>'
;
MENOR_QUE  :  '<'
;
EQUALS  : '=='
;
PRINT  :  'print'
;
FIRST  :  'first'
;
REST  :  'rest'
;
CONS  :  'cons'
;
FAIL  :  'fail'
;
ARROW: '->'
;
////////////////////////////////////////////////
// Ignored tokens
SLC :   '/*'.*? '*/' -> skip
;
MLC : '//'.*?'\r'?'\n' -> skip
;         
WS  : [ \t\r\n]+ -> skip
; 