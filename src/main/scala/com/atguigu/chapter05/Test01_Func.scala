package com.atguigu.chapter05

object Test01_Func {
  def main(args: Array[String]): Unit = {
    //    需求：定义一个函数，实现将传入的名称打印出来。
    def sayHi(name: String): Unit = {

      println(name)
    }

    sayHi("linhai")
    //调用类里面的函数
    val student0 = new Student01
    student0.sayHi("linhai")

    //    （1）Scala语言可以在任何的语法结构中声明任何的语法(函数)
    //    （3）Scala中函数可以嵌套定义
    def f1(name: String) = {
      def f2(age: Int): String = {
        s"$age 岁的$name"
      }

      println(f2(3))
    }

    f1("ddd")
    //    （2）函数没有重载和重写的概念；方法可以进行重载和重写
    //    def sayHi(name: String,age:Int): Unit = {
    //      println(name)
    //    }

  }
}

class Student01 {
  // 定义在类和对象中的叫做方法 其余叫做函数
  def sayHi(name: String): Unit = {
    def changename(): String = {
      name + "shuai"
    }

    println(changename())
  }

}