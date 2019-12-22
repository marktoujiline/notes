# Functions

## val Function
* Limited to 22 parameters because converted to scala.Function0, Function1, ..., Function22.
* Because of scala.Function0, has access to `antThen`, `compose`, `toString`.
* Can use case expressions, see [pattern-matching](./pattern-match.md)
* Can enter directly in REPL

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

# References
https://alvinalexander.com/scala/fp-book-diffs-val-def-scala-functions
