package main.scala

//object HelloWorld {
//
//  def main(args: Array[String]) {
//    println("Hello World")
//  }
//}





//class Outer{
//  class Inner{
//    private def f(){println("f")}
//    class InnerMost{
//      f() // 正确
//    }
//  }
//  (new Inner).f() //错误
//}



//package p{
//  class Super{
//    protected def f() {println("f")}
//  }
//  class Sub extends Super{
//    f()
//  }
//  class Other{
//    (new Super).f() //错误
//  }
//}

//在 Scala 中，字符串的类型实际上是 Java String，它本身没有 String 类。