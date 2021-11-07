package com.atguigu.chapter07

object Test17_ParList {
  def main(args: Array[String]): Unit = {
    (1 to 100).foreach(i => println(i+Thread.currentThread().getName))
    //使用并行集合
    ((1 to 100)).par.foreach(i => println(i+Thread.currentThread().getName))
  }
}
