package com.atguigu.chapter05

object Test08_rec {
  def main(args: Array[String]): Unit = {
    // 阶乘

    // 不使用递归
    def func1(n: Int): Int = {
      var res = 1
      for (i <- 1 to n) {
        res *= i
      }
      res
    }

    println(func1(5))


    // 使用递归
    // 递归算法
    // 1) 方法调用自身
    // 2) 方法必须要有跳出的逻辑
    // 3) 方法调用自身时，传递的参数应该有规律
    // 4) scala中的递归必须声明函数返回值类型

    def func2(n: Int): Int = {
      if (n == 1) 1 else func2(n - 1) * n
    }

    println(func2(5))


    def func3(n: Int): Int = {
      def func(n1: Int, res: Int): Int =
        if (n1 == 1) res else func(n1 - 1, res * n1)

      func(n,1)
    }

    println(func3(5))
  }
}
