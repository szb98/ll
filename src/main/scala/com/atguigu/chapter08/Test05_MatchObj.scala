package com.atguigu.chapter08

object Test05_MatchObj {
  def main(args: Array[String]): Unit = {
    val zhangsan = Student05("zhangsan", 10)
    println(zhangsan == Student05("zhangsan", 10))

    zhangsan match {
      case Student05("zhangsan", 10) => println("找到zhangsan了")
    }

    //    zhangsan.name = "lisi"
  }
}
// 自定义类实现对象的模式匹配
//class Student05 (val name:String,var age:Int){}
//
//object Student05{
//
//  def apply(name: String, age: Int): Student05 = new Student05(name, age)
//
//  def unapply(arg: Student05): Option[(String, Int)] = {
//    if (arg == null) None else new Some[(String, Int)](arg.name,arg.age)
//  }
//}

// 使用样例类  样例类中所有的参数默认都是val常量
case class Student05(name: String, age: Int)
