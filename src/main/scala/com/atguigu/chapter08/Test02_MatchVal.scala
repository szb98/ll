package com.atguigu.chapter08

object Test02_MatchVal {
  def main(args: Array[String]): Unit = {
    // 定义一个匹配常量的函数
    def func1(x: Any) = {
      x match {
        case 10 => println("整数")
        case '1' => println("字符")
        case "xx" => println("字符串")
        case _ => println("其他类型")
      }
    }

    func1('1')
    func1(10)
    func1("xx")

    // 匹配常量的情况下,不能匹配其他的参数
    func1(11)
  }
}
