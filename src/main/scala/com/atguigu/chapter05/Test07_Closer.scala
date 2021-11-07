package com.atguigu.chapter05

object Test07_Closer {
  def main(args: Array[String]): Unit = {
    // 实现两个数相加的函数
    def sumAB(a:Int,b:Int):Int = a + b

    // 使用的时候,适用性太差
    // 确定固定的参数,适用性提升
    def sumByFour(b:Int):Int = 4 + b


    // 泛用性太差
    // 需要重写定义函数使用
    def sumByFive(b:Int):Int = 5 + b

    // 使用闭包平衡泛用性和适用性
    def sumByA(a:Int) = {
      def sumAB(b:Int):Int = {
        a + b
      }

      sumAB _
    }

    val sumByFour1 = sumByA(4)
    val sumByFive1 = sumByA(5)

  }
}
