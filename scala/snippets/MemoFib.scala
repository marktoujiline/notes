case class Memo[A,B](f: A => B) extends (A => B) {
    private val cache = scala.collection.mutable.Map.empty[A, B]
    def apply(x: A) = cache getOrElseUpdate (x, f(x))
}

object MemoFib {
    val fib: Memo[Int, BigInt] = Memo {
        case 0 => 0
        case 1 => 1
        case n => fib(n - 1) + fib(n - 2)
    }
}
