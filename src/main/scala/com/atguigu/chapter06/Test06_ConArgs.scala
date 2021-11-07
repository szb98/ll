package com.atguigu.chapter06

object Test06_ConArgs {
  def main(args: Array[String]): Unit = {
    val person0 = new Person06("zhangsan", 16, "nan")

    person0.name
    person0.age
    person0.sex = "nv"
  }
}
// 主构造器参数  分为3种
class Person06(name1: String, val age: Int, var sex: String) {
  val name = name1
}