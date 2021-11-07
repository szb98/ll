package com.atguigu.chapter02

object Test05_type {
  def main(args: Array[String]): Unit = {
    //整数类型
    val b:Byte=111
    // 数值声明的时候不能超过类型的范围
    //val b1: Byte=128   error
    var s: Short = 10

    val i: Int = 10

    val l: Long = 100L

    // 不可以将大范围的数值赋值给小范围的值
    //s=l

    //报错是因为不兼容
    val b2 : Byte=1+1
    println(b2)

    //报错 类型不对
    // val i1:Int=1
//    val b3:Byte =1+i1
//    println(b3)


    // 浮点数 默认是double类型
    val f:Float=3.14f
    val d:Double=2.11f
    val d1:Double=2.11
    // char类型
    //    （1）字符常量是用单引号 ' ' 括起来的单个字符。
    val c:Char='a'
    val c1:Char=100
    println(c,c1)
    //注意：这里涉及自动类型提升，其实编译器可以自定判断是否超出范围，
    //不过idea提示报错
//    val c3:Char=c+1
//    println(c3)
    // 因为byte是由符号的数,不能赋值给char
    //val c2:Char=b   error
    //    （2）\t ：一个制表位，实现对齐的功能
    val c2: Char = '\t'
    println(c2 + 0)

    //    （3）\n ：换行符
    val c3: Char = '\n'
    println(c3 + 0)

    //    （4）\\ ：表示\
    val c4: Char = '\\'
    println(c4 + 0)

    //    （5）\" ：表示"
    val c5: Char = '\"'
    println(c5 + 0)
    // boolean类型
    val bo: Boolean = true
    val bo1: Boolean = false


    // 空值类型介绍
    //（1）Unit类型用来标识过程，也就是没有明确返回值的函数。
    val i1:Unit= {
      println("jjjjj")
      10
    }
    val unit: Unit = {println("hi")}
    println(unit)

    //    （2）Null类只有一个实例对象，Null类似于Java中的null引用。
    //    Null可以赋值给任意引用类型（AnyRef），但是不能赋值给值类型（AnyVal）
    val s1:String =null
    //基本数据类型不能使用null值表示
//    val i2:Int=null
//    println(i2)
    //    （3）Nothing，可以作为没有正常返回值的方法的返回类型，
    //    非常直观的告诉你这个方法不会正常返回，而且由于Nothing是其他任意类型的子类，
    //    他还能跟要求返回值的方法兼容。
    //val unit1:Nothing = throw new NullPointerException()

  }
}
