package com.atguigu.chapter02

object Test02_val {
  def main(args: Array[String]): Unit = {
    val a: Int = 10
    var b: Int = 20
    //    a = 11  error
    b = 21
    println(b)

    //    （1）声明变量时，类型可以省略，编译器自动推导，即类型推导。。。。。
    var b1 = 33


    //    （2）类型确定后，就不能修改，说明Scala是强数据类型语言。
    //    b = "hello" error


    //    （3）变量声明时，必须要有初始值
    //    val a1: Int


    //    （4）在声明/定义一个变量时，可以使用var或者val来修饰，var修饰的变量可改变，val修饰的变量不可改。
    val student0 = new Student02()
    var student1 = new Student02()

    //    （5）var修饰的对象引用可以改变，val修饰的对象则不可改变，但对象的状态（值）却是可以改变的。（比如：自定义对象、数组、集合等等）
    //    student0 = new Student02() error

    student1 = new Student02()

    // 引用数据类型的属性能否修改和变量声明无关,只和属性的常量变量声明有关
    student0.name = "zhangsan"
    //    student0.age = 16 error

    //    student1.age = 16 error


  }

}

class Student02 {
  // 在类的属性当中才能使用默认值, 必须是变量
  var name: String = _
  val age: Int = 18
}
