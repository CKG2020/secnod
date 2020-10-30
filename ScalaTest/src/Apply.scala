class Currency(val value: Double, val unit: String) {

}

//apply方法
//通常，在一个类的半生对象中定义apply方法，在生成这个类的对象时，就省去了new关键字。
//
//unapply方法
//可以认为unapply方法是apply方法的反向操作，apply方法接受构造参数变成对象，而unapply方法接受一个对象，从中提取值。
//而unapply方法一般用于模式匹配

object Currency{

  def apply(value: Double, unit: String): Currency = new Currency(value, unit)

  def unapply(currency: Currency): Option[(Double, String)] = {
    if (currency == null){
      None
    }
    else{
      Some(currency.value, currency.unit)
    }
  }

  def main(args: Array[String]): Unit = {

    val currency = Currency(30.2, "EUR")

    currency match {
      case Currency(amount, "EUR") => println("$" + amount)
      case _ => println("No match.")
    }
  }
}