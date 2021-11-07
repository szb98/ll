package com.atguigu.chapter07

object Test08_Func {
  def main(args: Array[String]): Unit = {

    val array: Array[Int] = Array(1, 2, 3, 4, 5)

    val list = List(6, 7, 8, 9)

    val set = Set(4, 4, 5, 7, 8)

    //    （1）获取集合长度
    val length: Int = array.length
    println(length)

    //    （2）获取集合大小
    val size: Int = set.size
    println(size)

    //    （3）循环遍历
    for (elem <- set) {
      println(elem)
    }

    list.foreach((i: Int) => println(i * 2))

    //    （4）迭代器
    val iterator: Iterator[Int] = list.iterator

    for (elem <- iterator) {

    }

    while (iterator.hasNext) {
      val i: Int = iterator.next()
    }


    //    （5）生成字符串
    println(list.toString())
    val str: String = list.mkString("List(", ", ", ")")
    println(str)


    //    （6）是否包含
    val bool: Boolean = list.contains(5)
    println(bool)


    val list1: List[Int] = List(1, 2, 3, 4, 5, 6, 7)
    val list2: List[Int] = List(6, 7, 8, 9, 10)


    //    （1）获取集合的头
    val head: Int = list1.head
    println(head)

    //    （2）获取集合的尾（不是头的就是尾）
    val tail: List[Int] = list1.tail
    println(tail)

    //    （3）集合最后一个数据
    val last: Int = list1.last
    println(last)

    //    （4）集合初始数据（不包含最后一个）
    val init: List[Int] = list1.init
    println(init)


    //    （5）反转
    val reverse: List[Int] = list1.reverse
    println(reverse)

    //    （6）取前（后）n个元素
    val ints: List[Int] = list1.take(3)
    val ints1: List[Int] = list1.take(1)

    println(ints)

    val ints2: List[Int] = list1.takeRight(3)
    println(ints2)

    //    （7）去掉前（后）n个元素
    val ints3: List[Int] = list1.drop(3)
    println(ints3)
    val ints4: List[Int] = list1.dropRight(3)
    println(ints4)

    //    （8）并集
    val ints5: List[Int] = list1.union(list2)
    println(ints5)

    //    （9）交集
    val ints6: List[Int] = list1.intersect(list2)
    println(ints6)

    //    （10）差集
    val ints7: List[Int] = list1.diff(list2)
    println(ints7)

    //    （11）拉链
    val tuples: List[(Int, Int)] = list2.zip(list1)
    println(tuples)

    //    （12）滑窗

    println("======================")
    val iterator1: Iterator[List[Int]] = list1.sliding(3)
    for (elem <- iterator1) {
      println(elem)
    }

    println("=====================")
    val iterator2: Iterator[List[Int]] = list1.sliding(4, 2)
    for (elem <- iterator2) {
      println(elem)
    }

  }
}
