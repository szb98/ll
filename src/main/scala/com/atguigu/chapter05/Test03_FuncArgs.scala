package com.atguigu.chapter05

object Test03_FuncArgs {
  def main(args: Array[String]): Unit = {
    def sayHi(name: String): Unit = {
      println(s"hi $name")
    }

    //    （1）可变参数
    def sayHi1(name: String*): Unit = {
      println(s"hi $name")
    }

    sayHi("linhai")
    sayHi1("linhai")
    sayHi1()
    sayHi1("linhai", "juzi")

    //    （2）如果参数列表中存在多个参数，那么可变参数一般放置在最后
    def sayHi2(age: Int, name: String*): Unit = {
      println(s"$age 岁的 $name")
    }

    //    （3）参数默认值，一般将有默认值的参数放置在参数列表的后面
    def sayHi3(name: String = "zhangsan"): Unit = {
      println(s"hi $name")
    }

    sayHi3("linhai")
    sayHi3()


    def sayHi4(name: String = "zhangsan", age: Int): Unit = {
      println(s"$age 岁的 $name")
    }

    sayHi4("linhai", 10)


    //    （4）带名参数

    sayHi4(age = 10)

  }
}
