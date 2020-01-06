# Category

A __category__ is a labeled directed graph (digraph) with some properties. Nodes are __objects__, edges are __morphisms__.

__ob(C)__: set of all objects in category C

__hom(C)__: set of all morphisms in category C

__f: a -> b__: morphism _f_ with __source object__ _a_ and __target object__ _b_

__hom<sub>C</sub>(a, b)__: set of all morphisms between objects _a_ and _b_ in category _C_

__∘__ : binary operation called _composition_ such that for any three objects _a, b, c_, we have ∘ : _hom(b, c) x hom(a, b) -> hom(a, c)_

> Relation is subset of cartesian product of two sets

> TODO: What does -> hom(a, c) mean?

Composition must have the following properties:
1. Associativity: If _f: a -> b, g: b -> c_, and _h: c -> d_, then h ∘ (g ∘ f) = (h ∘ g) ∘ f
1. Identity: For every object _x_, there exists a morphism _1<sub>x</sub>: x -> x_ such that for every morphism _f: a -> b_, we have _1<sub>b</sub> ∘ f = f = f ∘ 1<sub>a</sub>_.

To define a category, you must specify what composition is in that category.