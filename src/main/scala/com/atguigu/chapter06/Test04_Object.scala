package com.atguigu.chapter06

object Test04_Object {
  def main(args: Array[String]): Unit = {
    //    （1）val修饰对象，不能改变对象的引用（即：内存地址），可以改变对象属性的值。
    val person0 = new Person04


    // 常量无法修改地址值
    //    person0 = new Person04

    // 类中的属性值能否修改取决于 类在定义的时候对属性是val还是var
    //    person0.name = "lisi"
    person0.age = 17
    //    （2）var修饰对象，可以修改对象的引用和修改对象的属性值
    var person1 = new Person04
    // 变量声明可以修改地址值
    person1 = new Person04
    // 即使是变量也无法修改类中定义的val值
    //    person1.name = "lisi"

    //    （3）自动推导变量类型不能多态，所以多态需要显示声明
    val student0 = new Student04
    student0.sayHi

    val student01: Person04 = new Student04
    //    student01.sayHi
  }
}
class Person04 {
  val name = "zhangsan"
  var age = 16
}

class Student04 extends Person04 {
  def sayHi = {
    println("hello")
  }
}