# Types and Functions

## Category of Types
Types and functions form a category.
* Objects: types
* Morphisms: functions

Not all morphisms in this category compose. They must line up tip to tip.

Types can be thought of as a set of values.
* Boolean: {true, false} (finite)
* Char: {'a', 'b', '_', ...} (infinite)

Every type is extended with \_|\_ (bottom) to represent the possibility of non-termination.

Every runtime error is treated as bottom type.

```
val f: Boolean => Boolean = x => ???
```
??? is value with type `Any`, but represents bottom explicitly.

Can also write:
```
val f: Boolean => Boolean = ???
```
because bottom is also member of `Boolean => Boolean` since that type implicitly contains bottom.

Because of bottom, this category is called <b>Hask</b>, but for practical purposes, is same as <b>Set</b>.

## Category of Sets
Denoted as <b>Set</b>
* Objects: sets
* Morphisms: total functions

Can inspect the objects.
* Empty set has no elements
* Can have set with one item
* Funtion maps element of one set to another
* Functions can map 2 elements to 1, but not 1 to 2 elements
* Identity function maps set to itself

Difference between Types and Set categories?
> Morphisms in Types execute code and may not terminate

## Semantics
Operational semantics
> Describe language oeprations through idealized interpreter

Denotational semantics
> Describe language operations with mathematical model

Can use proofs to prove behavior of program (as opposed to tests)

How can denotaional semantics model computational effects like writing to file or network requests?
> Monads

## Purity
Mathematical functions map values. Programming functions can have effects which result in different reuslts each time. Ones that don't are called <i>pure</i>.

## Types as Sets
What is the equivalent of an empty set in types?
> Bottom type is the type that has no values. Nothing in Scala

What happens when function returns bottom (empty set)?
> Function cannot return because it has no possible value to return

What happens when function takes bottom as argument?
> Function cannot be called because there is no value to call it with. Therefore, it can return anything.

> def absurd[A]: Nothing => A

What is the Curry-Howard isomorphism (equivalence)?
> Formal logic is equivalent to programs.

What happens when function accepts only one possible value?
> Function takes a Singleton dummy argument, expressed as () or _. Not the same as taking "nothing" because such a function can't be called.

```
val f44: Unit => BigInt = _ => 44 // need type annotation

// equivalent to:
val f44 = () => 44

f44()
```

Can replace element in set (object) with function that return that element (morphism)

Functions from Unit => A are in one-to-one correspondence with the elements of set A. Meaning, for every element in set, there is a function from Unit to that element.
```
type A = Int
() => 1
() => 2
() => 3
...
```

What about function that only can return one value?
> void function, where Unit is Singleton value

For every A, there is a single function that returns Unit
```
type A = Int
val fInt: Int => Unit = x => ()
```

This function is parametrically polymorphic since the implementation is the same regardless of the type.
```
def unit[A](x: A) = ()
```

What does a 2 element type look like?
> Boolean {true, false}
```
// Bool enum
sealed trait Bool
case object True extends Bool
case object False extends Bool
```

What are functions that return Boolean called?
> predicates