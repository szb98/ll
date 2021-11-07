package com.atguigu.chapter07

object Test07_Tuple {
  def main(args: Array[String]): Unit = {
    val tuple = new Tuple2[String,Int]("Hello",2)
    val tuple1: (String, Int) = ("world",3)

    //遍历tupleyuansu
    val value: String = tuple1._1
    val value1: Int = tuple1._2

    println(value+"\t"+value1)

    //元组和map的关系
    val map: Map[String, Int] = Map(("hello",3))
    for (elem <- map) {
      val key: String = elem._1
      val value2: Int = elem._2
    }
  }
}
