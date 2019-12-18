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

Facebook is a category with people as objects and friendships are morphisms between web
## 6 (CHECK)

A directed graph is a category when:
* Every item has a path to itself
* For every composable connection, there is a direct connection (composable)

