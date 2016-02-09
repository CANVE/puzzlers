object IsDeadCode9 { 
  trait A
  class B {self => class Inner extends A { override def toString = self.toString}}
  class C[T](val f: T) extends B { override def toString = f.toString}
  
  class E {override def toString = "E" /* is this dead code? */ }
  
  def main(a: Array[String]): Unit = {
  
    def foo(a: A) = a.toString // does it call .toString on all the A’s?
    val e: E = new E
    val b: B = new C(1);
    val inner = new (b.Inner)
    println(foo(inner))
  }
}