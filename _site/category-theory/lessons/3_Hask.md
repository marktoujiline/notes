# Category of Types (Haskell)

To be a category, you need:
* Objects: types
* Morphisms: functions
* Composition: Functions _f_ from type A to B and _g_ from type B to C can be composed by creating a new function accepting A and returning C.
* Associative: For functions f: A -> B, g: B -> C, h: C -> D,  `h(compose(g, f)(x))` is same as `compose(h, g)(f(x))`
* Identity: function returning argument

## Set View
* Empty Set <=> Void (Nothing in scala)
* Singleton <=> Unit
* 2 Elem Set <=> Bool

Void: type with no elements
   * Function that takes void cannot be called.
   Therefore can return anything (absurd)
   * Function that returns void cannot be implemented.

Unit: type with a single arbitrary element
   * Function that takes "no" arguments really takes single argument Unit
      * Equivalent to picking item from set
   * Function that returns unit really returns single value
      * Equivalent to throwing away argument

Programming functions can have runtime error, called bottom `_|_`. Think of `???` in Scala. 
Every type is extended with bottom.

Values in set Bool: {true, false, ???}


