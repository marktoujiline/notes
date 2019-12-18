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

// FUNCTIONS (ES6 Arrow)
FUNC_ARG       := VAR | (VAR*)
RET_STATE      := return EXPR
FUNC_RET       := EXPR | {STATE*; RET_STATE}
FUNC           := FUNC_ARG => FUNC_RET

// STATEMENETS
STATE     := CONST_ASSIGN
           | LET_ASSIGN
           | VAR_ASSIGN
           | EXIST_ASSIGN
           | ARR_DES_ASSIGN
           | OBJ_DES_ASSIGN
           | RET_STATE
           | EXPR

// OBJECTS
KEY_VALUE         := VAR: EXPR,
OBJ_SPREAD        := ...OBJ_EXPR
OBJ_SPREAD_OPT    := KEY_VALUE | OBJ_SPREAD
OBJ_EXPR          := {OBJ_SPREAD_OPT*}

// EXPRESSIONS
PRIMITIVES     := NUM 
                | STR 
                | BOOL 
                | VAR 
                | FUNC


```

