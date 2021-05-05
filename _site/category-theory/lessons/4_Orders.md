# Orders

## Sets
__Relation__: subset of Cartesian product of two sets

__Reflexive__: every element is related to itself. Ex: {a, b, c} R {(a, a), (b, b), (c, c)}

__Transitive__: if a R b, and b R c implies a R c. Ex: {a, b, c} R {(a, b), (b, c), (a, c)}

__Antisymetric__: for any ordered pair (x,y) in R, the ordered pair (y,x) must NOT be in R, unless x = y.

__Preorder__: relation that is reflexive and transitive
   * Category with at most 1 arrow from any object a to b (thin)
      * Can contain cycles
   * Preorder, but not partial order: {a, b} where R is Cartesian product. (a, b) and (b, a) are in relation, but a != b

__Partial order__: relation that is reflexive, transitive, and antisymmetric.
   * If a <= b and b >= a, then a = b
   * Category with at most 1 arrow from any object a to b (thin)
      * Cannot contain cycles

__Total order__: any 2 objects are in a relation with each other

# References 
* https://medium.com/@WindUpDurb/on-partial-ordering-total-ordering-and-the-topological-sort-9f9c0d0d812f