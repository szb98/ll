package com.atguigu.chapter05

object Test09_ControlAbs {
  def main(args: Array[String]): Unit = {
    // 值调用
    def sayHi(name: String) = {
      println("值调用")
      println(name)
      println(name)
    }


    //    sayHi("linhai")

    sayHi({
      println("hello")
      "linhai"
    })
    println("===============")

    // 名调用
    def sayHi1(name: => String) = {
      println("名调用")
      println(name)
      println(name)
    }

    sayHi1("linhai")

    sayHi1({
      println("hello")
      "linhai"
    })
  }
}
