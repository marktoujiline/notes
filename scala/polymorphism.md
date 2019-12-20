# Polymorphism

## Parametric Polymorphism
What does parametric polymorphism mean?
> You can have a single implementation for multiple argument types.

```
def ignore[T](x: T) => () // throw away argument
```