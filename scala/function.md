# Functions

## val Function
* Limited to 22 parameters because converted to scala.Function0, Function1, ..., Function22.
* Because of scala.Function0, has access to `andThen`, `compose`, `toString`.
* Can use case expressions, see [pattern-matching](./pattern-match.md)
* Can enter directly in REPL
* Object with apply method

### Java Implementation
```
// scala
class ValFunc() {
    val hi = () => "hello"
}

// java
public class ValFunc {
  private final Function0<String> hi = ValFunc::$anonfun$hi$1;
  
  public Function0<String> hi() { return this.hi; }
}
```

Creating a val function manually:
```
// named function
class Add2 extends Function1[Int, Int] {
    def apply(a: Int) = a + 2
}
val add2 = new Add2

// anonymous function
val add2 = new Function1[Int, Int] {
    def apply(a: Int) = a + 2
}

// equivalent to:
val add2 = (a: Int) => a + 2
```

Can get generics with FunctionX traits, but not with val:
```
class SumLengths[A, B] extends Function2[A, B, Int] {
    def apply(a: A, b: B): Int = 
        a.toString.length + b.toString.length
}
```

## def Function
* Method that must be inside class or object
* Can think of as method
* Has access to `this`
* Has access to other members in class
* Supports Generics


### Java Implementation
```
// scala
class DefFunc() {
    def hi() = "hello"
}

// java
public class DefFunc {
  public String hi() { return "hello"; }
}
```

### Coercing Generic Function
Can coerce a parameterized method into function:
```
class A {
    def lengthOfThing[A] = (a: A) => a.toString.charAt(0)
}

val intLength = (new A()).lengthOfThing[Int]
```

### Eta Expansion
Converting method into function.
```
def a = 5
val f = a _ // f: function returning 5
val g = a // g: 5

def b(a: Int) = a
val h = b // missing argument list for method b in object, 
// Unapplied methods are only converted to functions when a function type is expected.
You can make this conversion explicit by writing `b _` or `b(_)` instead of `b`
val h = b _ // explicit eta expansion
val i: Int => Int = b // implicit eta expansion via types
```
NOTE: Explicit eta expansion is being removed in Dotty. Eta expansion for multiple arguments will happen automatically.

You can pass method as function argument because of implicit eta expansion via types.

## def vs val vs lazy val for assigning variables
Def variables are re-evaluated every time they are accessed.

Val variables are evaluated once and reused.

Lazy val variables are evluated only when/if they are accessed.
```
// essentially all the same
def a = 5
val a = 5
lazy val a = 5

// very different
def a = complexComputation() // evaluated every time accessed
val a = complexComputation() // evaluated once when line reached
lazy val a = complexComputation() // evaluated once when accessed first time
```


# References
https://alvinalexander.com/scala/fp-book-diffs-val-def-scala-functions
