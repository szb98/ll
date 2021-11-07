package com.atguigu.chapter05

object Test04_FuncSimple {
  def main(args: Array[String]): Unit = {

    def sayHi(name: String): String = {
      return s"hi $name"
    }

    //    （1）return可以省略，Scala会使用函数体的最后一行代码作为返回值
    def sayHi1(name: String): String = {
      var s: String = s"hi $name"
      s
    }


    //    （2）如果函数体只有一行代码，可以省略花括号
    def sayHi2(name: String): String = s"hi $name"


    //    （3）返回值类型如果能够推断出来，那么可以省略（:和返回值类型一起省略）
    def sayHi3(name: String) = s"hi $name"


    //    （4）如果有return，则不能省略返回值类型，必须指定
    def sayHi4(name: String): String = return s"hi $name"


    //    （5）如果函数明确声明unit，那么即使函数体中使用return关键字也不起作用
    def sayHi5(name: String): Unit = {
      return "hello"
      s"hi $name"
    }

    val linhai: Unit = sayHi5("linhai")


    //    （6）Scala如果期望是无返回值类型，可以省略等号
    def sayHi6(name: String) {
      s"hi $name"
    }


    //    （7）如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加
    def sayHi7(): String = "hi"

    println(sayHi7())

    //    （8）如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
    def sayHi8: String = "hi"

    println(sayHi8)

    //    （9）如果不关心名称，只关心逻辑处理，那么函数名（def）可以省略
    def sayHi9(name: String) = s"hi $name"
    (name: String) => s"hi $name"
    val function: String => String = (name: String) => s"hi $name"


  }
}
