# Case Class

Pre-2.11, case classes were limited to 22 parameters.
Post-2.11, implicit limit of ~100 before you get stack overflow

## Java Implementation
```
// scala
case class CaseClass(name: String, age: Int)

// java 
public class CaseClass implements Product, Serializable {
  private final String name;
  private final int age;

  // apply, unapply methods
  // scala.Product methods
  // field getters
  // copy methods
}
```