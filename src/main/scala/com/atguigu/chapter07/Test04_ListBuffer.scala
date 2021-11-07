package com.atguigu.chapter07

import scala.collection.mutable.ListBuffer

object Test04_ListBuffer {
  def main(args: Array[String]): Unit = {
    // 可变的list
    // 创建集合
    val buffer: ListBuffer[Int] = new ListBuffer[Int]
    val buffer1: ListBuffer[Int] = ListBuffer(1, 2, 3, 4, 5)

    //方法和arrayBuffer相同

    buffer.append(1)
    println(buffer)

    buffer.insert(1, 100)

    buffer(0) = 100

    buffer.remove(0)
    buffer.appendAll(ListBuffer(3, 4, 5, 6))
    println(buffer)
  }
}
