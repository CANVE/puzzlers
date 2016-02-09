object IsDeadCode8 {
  class A { override def toString = "A"; def foo = "a"}
  class B { override def toString = "B"; def foo = "b"}
  
  def mainnn(a: Array[String]): Unit = {
  
    def foo[A](a: A) = a.toString
    
    val a: A = new A;
    val b: B = new B;
    foo(a)
  }
}