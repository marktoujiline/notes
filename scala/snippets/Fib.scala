object Fib {
    val fib: Int => Int = {
        case 0 => 0
        case 1 => 1
        case n => fib(n - 1) + fib(n - 2)
    }
}

