# Morphism

Morphism is a mapping between objects called __source__ and __target__ objects.

__Domain__ of function is set of possible inputs

__Codomain__ of function is set of possible outputs

__Image__ of function is set of actual outputs; subset of codomain

A function _f_ where _f(x) = y_ is __invertible__ if there exists a function _g_ where _g(y) = x_ for all y.
To be invertible, each _x_ must have exactly 1 corresponding _y_.

## Types
Morphism _f: a -> b_ is a:
* __isomorphism__ if there exists a morphism _g: b -> a_ such that _f ∘ g = 1<sub>b</sub>_ and _g ∘ f = 1<sub>a</sub>_
    * Reason 1 not to be isomorphism: elements are _collapsed_, which makes it not invertible. (ex: isEven) (i.e abstraction)
        * If morphism _doesn't_ collapse, it's __injective__ or __monic__.
    * Reason 2 not to be isomorphism: image does not fill codomain. (ex: numToStr) (i.e. modeling)
        * If morphism's image _does_ fill codomain, it's __surjective__ or __epic__
    * Morphism _is_ isomorphism if it's _injective_ and _surjective_
```graphviz
digraph {
    a -> b [label=f]
    b -> a [label=g]
    a -> a :nw[label="1a"]
    b -> b :nw[label="1b"]
    a -> a :ne[label="g ∘ f"]
    b -> b :ne[label="f ∘ g"]
}
```
* __epimorphism__ if g1 ∘ f = g2 ∘ f implies g1 = g2 for all morphisms g1, g2 : b -> x
    * _epic_ morphism, meaning image fills codomain
    * example:
        * f: numToStr
        * g1: if numStr, prepend "num", else prepend "str"
        * g2: prepnd "num"
        * g1 != g2. But g1 ∘ f = g2 ∘ f. Therefore, f is not epimorphism; it doesn't fill codomain of String type
```graphviz
digraph {
    a -> b [label="f"]

    b -> x [label="g1"]
    b -> x [label="g2"]

    a -> x [label="g1 ∘ f"]
    a -> x [label="g2 ∘ f"]

    a -> a [label="1a"]
    b -> b [label="1b"]
    x -> x [label="1x"]
}
```
* __monomorphism__ if f ∘ g1 = f ∘ g2 implies g1 = g2 for all morphisms g1, g2 : x -> a
    * _monic_ morphism, meaning morphism doesn't collapse items.
```graphviz
digraph {
    a -> b [label=f]

    x -> a [label=g1]
    x -> a [label=g2]

    x -> b [label="f ∘ g1"]
    x -> b [label="f ∘ g2"]

    x -> x [label="1x"]
    a -> a :sw[label="1a"]
    b -> b :s[label="1b"]
}
```
