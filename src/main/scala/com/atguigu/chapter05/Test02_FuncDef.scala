package com.atguigu.chapter05

object Test02_FuncDef {
  def main(args: Array[String]): Unit = {
    //    （1）函数1：无参，无返回值
    def sayHi(): Unit = {
      println("hi ")
    }

    sayHi()

    //    （2）函数2：无参，有返回值
    def sayHi1(): String = {
      "hi"
    }

    val str: String = sayHi1()
    println(str)


    //    （3）函数3：有参，无返回值
    def sayHi2(name: String): Unit = {
      println(s"hi $name")
    }

    sayHi2("linhai")

    //    （4）函数4：有参，有返回值
    def sayHi3(name: String): String = {
      s"hi $name"
    }

    val str1: String = sayHi3("juzi")
    println(str1)


    //    （5）函数5：多参，无返回值
    def sayHi4(name: String, age: Int): Unit = {
      println(s"$age 岁的 $name")
    }

    sayHi4("linhai", 78)

    //    （6）函数6：多参，有返回值
    def sayHi5(name: String, age: Int): String = {
      s"$age 岁的$name"
    }

    println(sayHi5("linhai", 30))

  }
}
