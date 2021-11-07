package com.atguigu.chapter06

object Test11_singleton {
  def main(args: Array[String]): Unit = {
    val person1: Person11 = Person11()
    val person2: Person11 = Person11()

    println(person1.eq(person2))


  }
}

// 单例模式
class Person11 private(){

}

//// 饿汉模式
//object Person11{
//  private var person11:Person11 = new Person11
//
//  def apply(): Person11 = person11
//}


// 懒汉式
object Person11{
  private var person11:Person11 = _

  def apply(): Person11 = {
    if (person11 == null){
      person11 = new Person11()
      person11
    }else {
      person11
    }
  }

}