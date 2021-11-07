package com.atguigu.chapter05

object Test05_AnonymityFunc {
  def main(args: Array[String]): Unit = {
    // 基础的匿名函数
    val function: String => String = (name: String) => name + "gege"


    //    （1）参数的类型可以省略，会根据形参进行自动的推导
    val func1: String => String = (name) => name + "gege"


    //    （2）类型省略之后，发现只有一个参数，则圆括号可以省略；
    //    其他情况：没有参数和参数超过1的永远不能省略圆括号。
    val func2: String => String = name => name + "gege"

    val func3: () => Unit = () => println("hello")

    val func4: (String, Int) => String = (name, age) => {
      s"$age 岁的 $name gege"
    }

    //    （3）匿名函数如果只有一行，则大括号也可以省略
    val func5: (String, Int) => String = (name, age) => s"$age 岁的 $name gege"


    //    （4）如果参数只出现一次，参数是按照顺序的 则参数省略且后面参数可以用_代替
    val func6: (Int,String) => String =   _ + "岁的" + _

    println(func6(16,"linhai"))


    // 简化案例
    def sumAB(a:Int,b:Int) = a + b

    val function1: (Int, Int) => Int = _ + _

    function1(1 , 1)


    val function2: String => String = a => a

    println(function2("linhai"))
  }
}
