object IsDeadCode7 {
  trait A { def toStringUnapplied: () => String}
  class B {self => class Inner extends A { override def toStringUnapplied = self.toString _}}
  class C extends B { override def toString = "B" /* is this dead code? */ }
  
  def mainn(a: Array[String]): Unit = {
  
    def foo(a: A) = a.toStringUnapplied
    
    val c: B = new C;
    val inner = new (c.Inner)
    println(foo(inner)())
  }
}