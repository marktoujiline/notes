# Pattern Match

## Case Expressions
Can create a pattern match expression without match or an argument by placing list of case statements inside curly braces:

```
val f: (Any) => String = {
    case i: Int => "Int"
    case d: Double => "Double"
    case _ => "Other"
}
```
It implicitly creates an anonymous function that takes an argument and applies the pattern match to it. In this case, the val needs to have a type defined for this to work.
```
val f = {
    case i: Int => "Int"
    case d: Double => "Double"
    case _ => "Other"
}
// missing parameter type for expanded function.
// Argument types of anonymous function must be fully known.
```