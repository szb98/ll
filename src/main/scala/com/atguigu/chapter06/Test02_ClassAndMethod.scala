package com.atguigu.chapter06

import scala.beans.BeanProperty

object Test02_ClassAndMethod {
  def main(args: Array[String]): Unit = {
    val person0 = new Person02

    person0.getAge1
    person0.setAge1(1)


  }
}

// 如果不写权限修饰,默认是public
class Person02{
  // scala当中使用 val 和var来区分属性的读写权限
  val name:String = "zhangsan"

  // 使用下划线表示默认值
  var age: Int = _

  @BeanProperty
  var age1:Int = 0

  // 注释只针对单条属性生效
  @BeanProperty
  var name1:String = _

}


// 在同一个文件当中 可以定义多个类
class Student02{

}