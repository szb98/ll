package com.atguigu.chapter06

object Test10_Apply {
  def main(args: Array[String]): Unit = {
    //    val person1 = new Person10

    val person1: Person10 = Person10.getPerson10()

    // 伴生对象的apply方法
    val person12: Person10 = Person10()

    // 伴生类的apply方法
    person12()

  }
}

class Person10 private(){
  def apply(): Unit = {
    println("hello")
  }
}

object Person10{

  def getPerson10():Person10 = {
    new Person10
  }


  def apply(): Person10 = {

    println("apply")
    new Person10()
  }
}