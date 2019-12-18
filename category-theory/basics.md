# Basics

> category

abstract entity consisting of objects and arrows

> object

abstract entity represented by point

> arrow (morphism)

represented by arrow from 1 object to another

> composition

if there is an arrow A -> B and B -> C, then there is an arrow A -> C.

> composition properties

1. Associative
    * (A -> B) -> C = A -> (B -> C) = A -> B -> C
2. Every object has arrow going to itself
    * idA (identity on A)
        * `def identity[A](a: A): A = a`
    * f o idA = f
        * `f compose identity[A] == f`
    * idB o f = f
        * `identity[B] _ compose f == f`
    
> why need id?

Useful as argument to or return from hiegher order function.

> what can you know about object?

How it relates to other objects.