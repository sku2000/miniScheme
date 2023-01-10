grammar SS2;

@header {
package parser;
}


program: '(' 'letrec'  '(' abstracts* ')' tail ')';

abstracts: '[' LABEL '(' 'lambda' '(' ')' tail ')' ']';

tail: '(' triv ')' # immediate
    | '(' 'begin' effect* tail ')' # sequence
    ;

effect: '(' 'set!' var triv ')' # directAssign
      | '(' 'set!' var '(' op=('+' | '-' | '*' | 'logand'
                                | 'logor' | 'sra') triv triv ')' ')' # expressionAssign
      ;

var: REG
   | FVAR
   ;

triv: var
    | NUMBER
    | LABEL
    ;



MUL: '*';
SUB: '-';
ADD: '+';
AND: 'logand';
OR: 'logor';
SRA: 'sra';

WS: ('\t' | ' ' | '\r' | '\n')+ -> channel(HIDDEN);

LABEL: [a-zA-Z\-$?!]* '$' INT;
NUMBER: '-'? INT;
INT: '0' | [1-9][0-9]*;
REG: 'rax' | 'rcx' | 'rdx' | 'rbx'| 'rbp'| 'rsi'| 'rdi' | 'r8'| 'r9'
    | 'r10' | 'r11'| 'r12'| 'r13'| 'r14'| 'r15';
FVAR: 'fv' INT;

