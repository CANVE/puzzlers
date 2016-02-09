object IsDeadCode3 {
  trait A { type I; val s: I; override def toString = s.toString}
  class B extends A { type I = Int; val s = 0;}
  class E { override def toString = ??? /* is this dead code? */}
  
  def mainnn(a: Array[String]): Unit = {
  
    def foo(a: A) = a.toString // does it call .toString on all the A’s?
    val b: B = new B;
    val e: E = new E;
    println(foo(b))
  }
}