package com.atguigu.chapter02

object Test06_typeCast {
  def main(args: Array[String]): Unit = {
    //（1）自动提升原则：有多种类型的数据混合运算时，
    // 系统首先自动将所有数据转换成精度大的那种数值类型，然后再进行计算。
    val d: Double = 10+20L+3.1f+3.17
    //（2）把精度大的数值类型赋值给精度小的数值类型时，
    // 就会报错，反之就会进行自动类型转换。
     val d1:Double=7f
    //报错
    //val f:Float=3.23
    //（3）（byte，short）和char之间不会相互自动转换。
    val b1:Byte=10
    //val c1:Char=b1  error
    val s1:Short=b1
    val c1:Char='a'
    //val c1:Char=s1   error
    //（4）byte，short，char他们三者可以计算，在计算时首先转换为int类型。
    val i: Int = b1+c1+s1

    //报错 无法判断
//    val b2:Byte=20
//    val b3:Byte=b1+b2
    // val b3:Byte=b1+s1



    //强制类型转换
    val short: Short = 10.toShort

    val i1: Int = (10*3.5).toInt+(10*3.6).toInt

    val i2:Int=130
    //130转换为二进制 0000 0000 1000 0010
    //方法一：1000 0000 代表的是-128  1000 0010 则为-126
    //2：负数存储的是补码 从原码到补码是先取反再加1 从补码到源码是先减一再取反
    //1000 0010 -> 1000 0001 ->1111 1110 -> -126
    println(130.toByte)


    // 字符串类型和基本数据类型的相互转换
    println(100.0.toString)
    println(100.0 + "")

       println("100.0".toInt)
  }
}
