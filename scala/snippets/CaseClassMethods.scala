
object CaseClassMethods {
    // curried
    case class A(b: String, c: String)
    val b = A.curried("hi")
    val c = b("bye")

    // tupled
    val d = A.tupled;
    d("Hi", "Bye")
}
