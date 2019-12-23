# 1.4
## 1 

```
scala> def identity[A](a: A): A = a
identity: [A](a: A)A
```

## 2

```
scala> def compose[A, B, C](f: A => B, g: B => C): A => C = (a: A) => g(f(a))
compose: [A, B, C](f: A => B, g: B => C)A => C
```

## 3

```
// Define three composable functions
scala> def stringToNumber(s: String): Int = 5
stringToNumber: (s: String)Int

scala> def numberToBoolean(n: Int): Boolean = false
numberToBoolean: (n: Int)Boolean

scala> def booleanToList(b: Boolean): List[Int] = List.empty
booleanToList: (b: Boolean)List[Int]

// Test associativity
scala> compose(compose(stringToNumber, numberToBoolean), booleanToList)("") == compose(stringToNumber, compose(numberToBoolean, booleanToList))("")
res0: Boolean = true

// Test identity

// f o idA == f 
scala> compose(stringToNumber, identity[Int])("") == stringToNumber("")
res2: Boolean = true

// idB o f == f
scala> compose(identity[String], stringToNumber)("") == stringToNumber("")
res4: Boolean = true
```

## 4

The world wide web is a category. Computers can be viewed as objects and network connections as morphisms. 

Links can be viewed as morphisms between webpages (objects)

## 5

Facebook friendships are not categories. If A is frineds with B and B is friends with C, A is not friends with C.
## 6 (CHECK)

A directed graph is a category when:
* Every item has a path to itself
* If there is a path between A and B, then there is a direct path from A to B.

# 2.7
## 1
```
def memoize[K, V](f: K => V): K => V = {
  val cache = collection.mutable.Map.empty[K, V]

  k =>
    cache.getOrElse(k, {
      cache update(k, f(k))
      cache(k)
    })
}
```


## 2
```
val r = scala.util.Random

val memoNextInt = memoize(r.nextInt)
memoNextInt(100) // expression will always give same answer
```
It does not work, since the function no longer behaves expectedly.

## 3
```
?
```

## 4 
The only pure function is a. The rest stop working correctly when memoized.

## 5
Bool has a set of 2 items, {true, false}.
There are 27 combinations of functions that cam map from Bool to Bool.
Since Bottom is an implicit type on that function, you have to consider it as well.
There are some functions that cannot be implemented. The only functions that can not return a bottom are ones that always return true or false, so 2.

```
T -> T   T -> T   T -> T
F -> T   F -> F   F -> B
B -> B   B -> B   B -> B

T -> F   T -> F   T -> F
F -> T   F -> F   F -> B
B -> B   B -> B   B -> B

T -> B   T -> B   T -> B
F -> T   F -> F   F -> B
B -> B   B -> B   B -> B

T -> T            T -> F
F -> T            F -> F
B -> T            B -> F
```

```
val first = (b: Boolean) => true
val second = (b: Boolean) => !b
val third = (b: Boolean) => if (b) true else ???
val fourth = (b: Boolean) => b
val fifth = (b: Boolean) => false
val sixth = (b: Boolean) => if (b) false else ???
val seventh = (b: Boolean) => if (!b) true else ???
val eighth = (b: Boolean) => if (!b) false else ???
val ninth = (b: Boolean) => ???
val tenth = true
val eleventh = false
```

## 6

Input
       Void     Unit     Bool
Void   absurd   absurd   absurd
Unit    err     sideEff  predicate
Bool    err     sideEff  predicate
# References
https://stackoverflow.com/questions/18716804/27-different-bool-to-bool-values-in-haskell
