# JavaScript Syntax Rules
## NOTE: Not meant to be formal
```
* := 0 or more
+ := 1 or more
<>:= grammar expression
| := or

// PRIMITIVES
NUM  := 1 | 2 | 3.6 | -1.222 | ...
CHAR := a | 3 | _ | ...
LET  := a | b | c | d ...
STR  := "CHAR*" | 'CHAR*' | `CHAR*`
BOOL := true | false
NULL := null
UND  := undefined
VAR  := LET+
ARR  := [EXPR,*]

// ASSIGN
ASSIGN         := const | let | var
CONST_ASSIGN   := const VAR = EXPR
LET_ASSIGN     := let VAR | let VAR = EXPR
VAR_ASSIGN     := var VAR | var VAR = EXPR
EXIST_ASSIGN   := VAR = EXPR
ARR_DES_ASSIGN := ASSIGN [VAR,*] = ARR_EXPR
                | ASSIGN [VAR,*, ...VAR] = ARR_EXPR
OBJ_DES_ASSIGN := ASSIGN {VAR,*} = OBJ_EXPR
                | ASSIGN {VAR,*, ...VAR} = OBJ_EXPR
```
