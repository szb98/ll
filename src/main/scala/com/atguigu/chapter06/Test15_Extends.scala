package com.atguigu.chapter06

object Test15_Extends {
  def main(args: Array[String]): Unit = {
    //    （1）obj.isInstanceOf[T]：判断obj是不是T类型。
    //    （2）obj.asInstanceOf[T]：将obj强转成T类型。
    //    （3）classOf获取对象的类名。
    val student1: Person15 = new Student15
    println(student1.isInstanceOf[Student15])
    if (student1.isInstanceOf[Student15]) {
      val student11: Student15 = student1.asInstanceOf[Student15]
      student11.sayHi
    }
    val value: Class[Student15] = classOf[Student15]

    // 枚举类的使用
    val green: Color.Value = Color.GREEN
    println(green)

    // 避免使用
    type asas = String
  }
}

class Person15 {

}

class Student15 extends Person15 {
  def sayHi: Unit = {
    println("hi")
  }
}

// 枚举类的使用
object Color extends Enumeration {
  val RED: Color.Value = Value(1, "red")
  val GREEN: Color.Value = Value(2, "green")
}

// 应用类的使用
object Application extends App {
  println("hello")
}