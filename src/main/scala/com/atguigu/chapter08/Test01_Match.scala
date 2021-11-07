package com.atguigu.chapter08

object Test01_Match {
  def main(args: Array[String]): Unit = {
    // 基础用法
    val a = 10
    val b = 20
    val c: Char = '''

    val i: AnyVal = c match {
      case '+' => println("hello")
        a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ =>
    }
    println(i)


    // 模式守卫
    // 取绝对值
    def func1(i: Int): Int = {
      i match {
        //匹配的条件允许出现重复的部分,匹配的时候以前后顺序进行匹配
        case j: Int if j >= 0 => j
        case j: Int if j < 0 => -j
        //        case j: Int if j == 0 => -j
        case _ => 0
      }
    }

    println(func1(-1))
    println(func1(1))
    println(func1(0))

  }
}
