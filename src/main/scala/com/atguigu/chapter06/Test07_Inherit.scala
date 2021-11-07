package com.atguigu.chapter06

object Test07_Inherit {
  def main(args: Array[String]): Unit = {
    //    val student0 = new Student07
    //
    //    println(student0.age)
    //    println(student0.name)
    //    student0.sayHi()


    println("=================")
    val lisi = new Student07("lisi", 11)


  }
}

class Person07() {
  println("父类的主构造器")

  // 属性
  val name: String = "person"
  var age: Int = 16

  // 方法
  def sayHi() = {
    println("hi person")
  }

  def this(age: Int) {
    this()
    println("父类的辅助构造器")
    this.age = age
  }

}

class Student07(age: Int) extends Person07(age: Int) {
  println("子类的主构造器")
  var name1 = "student"

  def this(name: String, age: Int) {
    this(age)
    println("子类的辅助构造器")
    this.name1 = name
  }
}