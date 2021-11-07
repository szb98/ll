package com.atguigu.chapter04

import scala.collection.immutable

object Test02_forLoop {
  def main(args: Array[String]): Unit = {

    // 基础的for循环写法
    for (i <- 1 to 10) {
      println(i)
    }

    for (i <- 1 until 10) {
      println(i)
    }


    println("=======================")
    for (i <- List(1, 2, 3, 4)) {
      println(i)
    }


    // 循环守卫
    for (i <- 1 to 10) {
      if (i % 2 == 0) {
        println(i)
      }
    }

    println("=================")
    for (i <- 1 to 10 if i % 2 == 0) {
      println(i)
    }

    // 循环步长
    for (i <- 1 to 10 by 2) {
      println(i)
    }
    println("=============")

    for (i <- 10 to 1 by -1) {
      println(i)
    }


    // 嵌套循环
    for (i <- 1 to 3) {
      for (j <- 1 to 4) {
        print(j + "\t")
      }
      println()
    }

    for (i <- 1 to 3; j <- 1 to 4) {
      print(j + "\t")
      if (j == 4) {
        println()
      }
    }


    println("=================")
    // 引入变量
    for (i <- 1 to 3) {
      var j = 3 * i + 8
      println(j + "-" + i)
    }

    for (i <- 1 to 3; j = 3 * i + 8) {
      println(j + "-" + i)
    }


    for {
      i <- 1 to 4
      j <- 1 to 4
      k = i + j
    } {
      print(k + "\t")
      if (j == 4) {
        println()
      }
    }
    // 循环返回值
    val unit: Unit = for (i <- 1 to 3) {
      i
    }
    val ints: immutable.IndexedSeq[Int] = for (i <- 1 to 3) yield {
      i
    }




    // 倒序打印
    for (i <- 1 to 10 reverse) {
      println(i)
    }


  }
}
