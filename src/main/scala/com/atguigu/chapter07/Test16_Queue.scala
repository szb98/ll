package com.atguigu.chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

object Test16_Queue {
  def main(args: Array[String]): Unit = {
    val queue: Queue[Int] = Queue(1, 2, 3, 4)

    // 方法介绍
    val queue1: Queue[Int] = queue.enqueue(5)
    println(queue1)

    val dequeue: (Int, Queue[Int]) = queue1.dequeue
    println(queue1)
    println(dequeue)


    // 创建可变队列
    val queue2: mutable.Queue[Int] = mutable.Queue(1, 2, 3, 4)

    // 方法介绍
    queue2.enqueue(5)
    println(queue2)

    val i: Int = queue2.dequeue()
    println(i)
    println(queue2)

  }
}
