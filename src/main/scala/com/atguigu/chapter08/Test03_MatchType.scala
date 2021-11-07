package com.atguigu.chapter08

object Test03_MatchType {
  def main(args: Array[String]): Unit = {
    // 定义一个匹配类型的函数
    def func1(x: Any) = {
      x match {
        case i: Int => println("整数")
        case c: Char => println("字符")
        case s: String => println("字符串")
        case _ => println("其他类型")
      }
    }

    val n: Any = "pp"
    func1(n)
  }
}
