class IsDeadCode {
  trait A {/* has a `def toString: String` inherited from scala.AnyRef */}
  class B extends A { override def toString = "B"}
  class C extends A { override def toString = "C" /* is this dead code? */ }
  
  def mainnn(a: Array[String]): Unit = {
  
    def foo(a: A) = a.toString // does it call .toString on all the A’s?
    val b: B = new B;
    val c: C = new C;
    foo ( b )
  }
}