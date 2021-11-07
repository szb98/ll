package com.atguigu.chapter06

object Test05_Con {
  def main(args: Array[String]): Unit = {
    val linhai = new Person05("linhai", 88)
  }
}
// scala中的主构造器在类的声明之中
class Person05() {
  println("hello 主构造器")
  var name: String = _
  var age: Int = _

  // 辅助构造器
  def this(name: String) {
    // 辅助构造器的第一行必须直接或者间接的调用主构造器
    //    println("he")
    this()
    println("辅助构造器1")
    this.name = name
  }

  def this(name: String, age: Int) {
    this(name)
    println("辅助构造器2")
    this.age = age
  }



}