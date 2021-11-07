package com.atguigu.chapter02

import scala.io.StdIn

object test04StdIn {
  def main(args: Array[String]): Unit = {
    println("input name :")
    val str: String = StdIn.readLine()
    println("input age :")
    val i: Int = StdIn.readInt()
    println(s"欢迎${i}岁的${str}来吃shit")
  }
}
