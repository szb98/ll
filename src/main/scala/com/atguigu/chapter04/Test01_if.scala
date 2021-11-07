package com.atguigu.chapter04

import scala.io.StdIn

object Test01_if {
  def main(args: Array[String]): Unit = {
    // if条件判断
    //    需求：输入人的年龄，如果该同志的年龄小于18岁，则输出“童年”
    println("请输入您的年龄:")

    val age: Int = StdIn.readInt()

    if (age < 18) {
      println("童年")
    }

    //    需求：输入年龄，如果年龄小于18岁，则输出“童年”。否则，输出“成年”。
    if (age < 18) {
      println("童年")
    } else {
      println("成年")
    }

    //    （1）需求1：需求：输入年龄，如果年龄小于18岁，则输出“童年”。
    //    如果年龄大于等于18且小于等于60，则输出“中年”，否则，输出“老年”。
    if (age < 18) {
      println("童年")
    } else if (age <= 60) {
      println("中年")
    } else {
      println("老年")
    }

    //    （2）需求2：Scala中if else表达式其实是有返回值的，
    //    具体返回值取决于满足条件的代码体的最后一行内容。
    val unit: Unit = if (age < 18) {
      println("童年")
    } else if (age <= 60) {
      println("中年")
    } else {
      println("老年")
    }

    val value: Any = if (age < 18) {
      println("童年")
      "童年"
    } else if (age <= 60) {
      println("中年")
    } else {
      println("老年")
    }

    //    （4）需求4：Java中的三元运算符可以用if else实现
    val str: String = if (age < 18) "童年" else "成年"

    if (age < 18) {
      println("童年")
      "童年"
    }
    // 如果有多行代码省略掉{} 表示{}只包含一行的代码
    else
      println("成年")


    //    需求：如果输入的年龄小于18，返回“童年”。如果输入的年龄大于等于18，
    //    需要再判断：如果年龄大于等于18且小于60，返回“中年”；如果其他，返回“老年”。
    val str1: String = if (age < 18) {
      "童年"
    } else {
      if (age < 60) {
        "中年"
      } else {
        "老年"
      }
    }
  }
}
