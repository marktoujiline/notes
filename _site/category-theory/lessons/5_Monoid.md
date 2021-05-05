# Monoid

Category with one object. _Hom<sub>c</sub>(a)_ is all morphisms in category.

Two properties:
* Unit: 0 (addition), 1 (multiplication), "" (string concat)
    * Identity morphism
* Combine: Combine two elements of object into another element of object
    * Associative: (1 + 5) + 6 == 1 + (5 + 6)
    * Identity: 1 + 0 == 1

Monoid's hom-set always defines a set with binary operator. Two morphisms can be composed to produce a new morphism which will also be in hom-set.

```
trait Monoid[M] {
    def combine(m1: M, m2: M): M def empty: M
}

object Monoid {
    implicit val stringMonoid: Monoid[String] = new Monoid[String] {
        def combine(m1: String, m2: String): String = m1 + m2
        def empty: String = ""
    }
}
```