package com.atguigu.chapter06

object Test08_AbsClass {
  def main(args: Array[String]): Unit = {
    val student0 = new Student08

    student0.sayHi()

    println(student0.age1)

    student0.sayHi1()


    val person0: Person08 = new Person08 {
      override val name: String = "匿名子类"
      override var age: Int = _

      // 无法调用
      def sayHello():Unit = {
        println("hello")
      }

      override def sayHi(): Unit = {
        println("hi 匿名子类")
      }
    }

  }
}
// 抽象类
abstract class Person08{

  // 抽象的属性
  val name: String
  var age: Int

  // 非抽象的属性
  val name1: String = "person"
  var age1:Int = 10

  // 抽象的方法
  def sayHi():Unit
  // 非抽象的方法
  def sayHi1():Unit = {
    println("hi")
  }
}

// 写一个子类去继承抽象类
class Student08 extends Person08{

  // 抽象的属性都可以重写  override可以省略
  val name: String = "student"
  var age: Int = _

  // 重写非抽象的属性 val的属性可以重写.var的属性不能重写,如果需要修改,直接赋值即可
  override val name1 = "student"

  override def sayHi(): Unit = {
    age1 = 18
    println("hi student")
  }


  // 重写非抽象的方法
  override def sayHi1(): Unit = {
    println("hi student")
  }
}
