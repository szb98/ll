package com.atguigu.chapter09

object Test02_Imp {
  def main(args: Array[String]): Unit = {
    // 定义一个隐式函数将int转换为MyRichInt
    implicit def changeInt(n:Int):MyRichInt = {
      new MyRichInt(n)
    }

    val i = 10

    val i1: Int = i.myMax(20)
    println(i1)

    i.max(11)

    // 隐式参数
    implicit val zhansgan = "lisi"
    def sayHi(implicit name:String = "zhangsan") = {
      println(s"hi $name")
    }

    sayHi("linhai")
    sayHi()
    sayHi

    List(1,2,3,4).sorted




  }
}


class MyRichInt(num: Int) {
  var self: Int = num

  def myMax(i: Int): Int = {
    if (self > i) self else i
  }
}