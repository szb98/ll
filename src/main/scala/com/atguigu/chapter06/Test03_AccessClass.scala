package com.atguigu.chapter06

object Test03_AccessClass {
  def main(args: Array[String]): Unit = {
    val person0 = new Person03
    person0.info()
  }
}


class Person03 {
  protected val name1: String = "protected"

  def info(): Unit = {
    println(Person03.name)
    println(name1)
    println(Person03.name2)

  }
}
object Person03{

  private val name:String = "private"

  val name2: String = "public"


}