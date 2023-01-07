grammar SS2;

program: '(' 'letrec'  '(' ('[' LABEL '(' 'lambda' '(' ')' tail ')' ']')* ')' tail ')';

tail: '(' triv ')'
    | '(' 'begin' effect* tail ')'
    ;

effect: '(' 'set!' var triv ')'
      | '(' 'set!' var '(' op=('+' | '-' | '*' | 'logand' | 'logor' | 'sra') triv triv ')' ')'
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

LABEL: [a-zA-Z\-$?!]* '$' INT;
NUMBER: '-'? INT;
INT: '0' | [1-9][0-9]*;
REG: 'rcx' | 'rdx' | 'rbx'| 'rbp'| 'rsi'| 'rdi' | 'r8'| 'r9'
    | 'r10' | 'r11'| 'r12'| 'r13'| 'r14'| 'r15';
FVAR: 'fv' INT;

