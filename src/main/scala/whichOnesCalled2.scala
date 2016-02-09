object IsDeadCode2 {
  trait A { /* override def toString = "A" */}
  trait B extends A { override def toString = "B" /* is this dead code? */}
  trait C extends A { override def toString = "C" /* is this dead code? */}
  
  def mainnn(a: Array[String]): Unit = {
  
    def foo(a: A) = a.toString // does it call .toString on all the A’s?
    val b: B = new B with C{};
    println(foo(b))
  }
}