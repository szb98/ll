package com.atguigu.chapter07

object Test01_Array {
  def main(args: Array[String]): Unit = {
    // 不可变数组
    // 创建不可变数组
    val array = new Array[Int](10)
    val array1: Array[Int] = Array(1, 2, 3, 4, 5)

    // 遍历查看元素
    for (i <- array) {
      println(i)
    }
    for (i <- array1) {
      println(i)
    }

    //使用迭代器
    val iterator: Iterator[Int] = array1.iterator
    while (iterator.hasNext) {
      val i: Int = iterator.next()
      println(i)
    }

    // scala特有的打印方法
    array1.foreach((i: Int) => println(i))
    // 在函数当中使用参数的话,不能将匿名函数化简为_
    //    array1.foreach(println(_ + 1))
    // 以后都是用这个方法打印集合
    array1.foreach(println)

    //修改array里面的元素
    array(0) = 1
    array(9) = 90
    array.update(1, 20)
    println(array1(1))

    array.foreach(println)
    val str: String = array.mkString("[", ",", "]")
    println(str)

    // 添加元素
    val array2: Array[Int] = array1 :+ 1
    array1.foreach(println)
    array2.foreach(println)


  }
}
