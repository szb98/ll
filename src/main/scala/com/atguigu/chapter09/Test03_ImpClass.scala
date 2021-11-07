package com.atguigu.chapter09

object Test03_ImpClass {
  def main(args: Array[String]): Unit = {
    val i: Int = 10.myMax(11)

    println(i)
  }


  implicit class MyRichInt03(var self:Int){
    def myMax(n:Int):Int ={
      if (self > n) self else n
    }
  }


}
