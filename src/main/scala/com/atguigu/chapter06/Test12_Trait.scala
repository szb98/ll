package com.atguigu.chapter06

object Test12_Trait {
  def main(args: Array[String]): Unit = {
    val student1 = new Student12
    println(student1.age)
    println(student1.name)
    println(student1.name1)
    println(student1.age1)
    student1.sayHi()
    student1.sayHi1()

    println(student1.name1)

    //    （3）所有的Java接口都可以当做Scala特质使用
    //    （4）动态混入：可灵活的扩展类的功能
    //    （4.1）动态混入：创建对象时混入trait，而无需使类混入该trait
    val student11 = new Student12 with Old {
      override def info(): Unit = {
        println("信息")
      }
    }

    student11.info()

    val student12 = new Student12
    //    student12.info

    //    （4.2）如果混入的trait中有未实现的方法，则需要实现


  }
}

// 声明特质
abstract class Person12 {
  // 属性
  val name: String
  var age: Int

  val name1: String = "person"
  var age1: Int = 12

  // 方法
  def sayHi(): Unit

  def sayHi1(): Unit = println("hi")

}

trait Young {
  var age: Int

  // 如果继承的父类和特质中有相同的属性
  val name1: String = "young"
}

trait Old {
  var age: Int

  def info(): Unit
}


// 使用特质  单个特质使用extends
//class Student12 extends Young{
//  override var age: Int = 11
//}


//class Student12 extends Young with Old{
//  override var age: Int = 10
//}

class Student12 extends Person12 with Young with Serializable {
  override val name: String = "student"

  // 如果父类和特质中有相同的属性和方法  子类中必须重写  不然编译报错
  override val name1: String = "student"

  override def sayHi(): Unit = {
    println("hi student")
  }

  override var age: Int = 10
}
