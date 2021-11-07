package com.atguigu.chapter06

object Test09_Polymorphic {
  def main(args: Array[String]): Unit = {
    val stu: Per = new Stu
    println(stu.name)
    stu.say

  }
}
class Per{
  val name:String="person"
  var age:Int=10
  def say:Unit={
    println("hi")
  }
}

class Stu extends Per{
  override val name :String="student"

  override def say: Unit = {
    println("hello ")
  }
}
