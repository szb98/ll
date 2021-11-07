package com.atguigu.chapter05

object Test10_Lazy {
  def main(args: Array[String]): Unit = {
    def sumAB(a:Int,b:Int):Int={
      println("sumAB")
      a+b
    }
    lazy val n=sumAB(1,1)
    println("==========")
    println(n)
  }
}
