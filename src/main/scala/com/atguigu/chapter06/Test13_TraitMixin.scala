package com.atguigu.chapter06

object Test13_TraitMixin {
  def main(args: Array[String]): Unit = {
    val person1: Person13 = new Person13
    println(person1.sayHi)
  }
}
trait Age13{
  val name = "age"
  def sayHi: String =  "age"
}
trait Young13 extends Age13{
  override val name = "young"

  override def sayHi: String = "young " + super.sayHi
}
trait Old13 extends Age13{
  override def sayHi: String = "old " + super.sayHi
}

class Person13 extends Young13 with Old13 {
  override def sayHi: String = "person " +  super.sayHi

}