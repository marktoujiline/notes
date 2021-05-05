# Products

To identify object, you have to describe surrounding morphisms.

## Initial Object
> object that has one and only one morphism going to any object in the cateogry.
Definition gurantees uniqueness <i>up to isomorphism</i>.

In ordered set, initial object is smallest number. For integers, its 0. For reals, there is none.

For Hask, initial object is Void. From Void, there is a morphism to any type (absurd), but only one arrow. There are also no arrows going into Void.

## Terminal Object
> object that has and only one morphism coming in from any object in the category.
Definition gurantees uniqueness <i>up to isomorphism</i>.

In ordered set, terminal object is greatest number.

For Hask, terminal object is Unit. There is only one function for morphism from each type to the Unit type.

## Duality
You can create a new category from an existing category by reversing all the arrows and redefining composition.

Initial object is the temrminal object in the opposite category.

## Isomorphism
> objects look the same as far as we can tell; same shape

Every part of one object corresponds to some part of another object in a one to one mapping.

Objects are isomorphic if there is a morphism from A to B and from B to A.

An isomorphism is the inverse of a morphism.

```
f compose g == identity _
g compose f == identity _
```

2 initial objects are isomorphic.

Take initial objects i1 and i2.

Since i1 is initial, there must be unique morphism f from i1 to i2.

Since i2 is initial, there must be unique morphism g from i2 to i1.

Composition of those two morphisms is identity.

Therefore, f and g are inverses of each other and i1 and i2 are isomorphic.

Initial object is unique up to unique isomorphism. Important property of all universal constructions.

## Products
> Universal construction where a product of two objects 𝑎 and 𝑏 is the object 𝑐 equipped with two projections such that for any other object 𝑐′ equipped with two projections there is a unique morphism 𝑚 from 𝑐′ to 𝑐 that factorizes those projections.

