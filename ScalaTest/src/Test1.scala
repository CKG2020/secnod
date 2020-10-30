  class Test1 {
  self=>
//  val x=1
//  //当是String类型的变量的时候 必须是抽象的类
//  var y:String
//      var abc :String=_

    private[this] var _age:Int=_
    def age:Int=_age
    def age_=(i:Int)={

      if(i>100){
        self._age=10
      }
      else {
        self._age=i
      }
    }

    def :::+(c:Test1)={
      self._age+c.age
    }




}

class  xxx extends  Test1{
//  override  val x=2
//  override var y: String = "xxxxxx"
}


object  TTT{

  def main(args: Array[String]): Unit = {
//    val xxx = new xxx()
//    val x = xxx.x
//    val y = xxx.y
//    println(x)
//    println(y)

    val test = new Test1





  }

}
