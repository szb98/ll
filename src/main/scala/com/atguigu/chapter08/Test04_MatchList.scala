package com.atguigu.chapter08

object Test04_MatchList {
  // 定义一个匹配集合的函数
  def func1(x: Any) = {
    x match {
      case l: List[Int] => println("集合")
      case a: Array[Int] => println("数组")
    }
  }

  func1(Array(1, 2, 3))
  func1(List(1, 2, 3))

  // 匹配数组的泛型
  def func2(x: Any) = {
    x match {
      case l: Array[Int] => println("int类型的数组")
      case a: Array[Double] => println("double类型的数组")
      case s: Array[String] => println("string类型的数组")
      case _ => println("其他类型")
    }
  }

  func2(Array(1, 2, 3))
  func2(Array(1.0, 2.0, 3))
  func2(Array("aa", "b"))


  // 不能匹配list的泛型  泛型擦除
  def func3(x: Any) = {
    x match {
      // 将前面两个元素单独拿出来,最后的几个作为last
      //        case first:: second :: last => println(first + "-" + second + "-" + last)
      case a: List[Double] => println("double类型的List")
      case s: List[String] => println("string类型的List")
      case l: List[Int] => println("int类型的list")
      case _ => println("其他类型")
    }
  }


  func3(List(1, 2, 3))
  func3(List(1.0, 2, 3))
  func3(List("a", "b"))

  for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1), Array("hello", 90))) {
    arr match {
      case Array(0) => println("一个元素为0的数组")
      case Array(1, _, 2) => println("以1开头,以2结尾")
      case Array(1, _*) => println("以1开头的数组")
      case _ =>
    }
  }

}
