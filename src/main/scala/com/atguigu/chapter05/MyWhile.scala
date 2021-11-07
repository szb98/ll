package com.atguigu.chapter05

object MyWhile {
  def main(args: Array[String]): Unit = {
    // 系统的while
    var i = 0
    while (i < 10) ({
      println(i)
      i += 1
    })


    i = 0

    // 自定义while循环
    def myWhile(b: => Boolean)(op: => Unit): Unit = {
      if (b) {
        op
        myWhile(b)(op)
      }
    }

    myWhile(i < 10)({
      println(i)
      i += 1
    })
  }
}
