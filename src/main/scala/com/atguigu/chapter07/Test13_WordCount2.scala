package com.atguigu.chapter07

import scala.collection.mutable.ArrayOps

object Test13_WordCount2 {
  def main(args: Array[String]): Unit = {
    val tupleList = List(("Hello Scala Spark World", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))

    // 还是使用上一个方法
    //    val strings: List[String] = tupleList.map((tuple: (String, Int)) => (tuple._1 + " ") * tuple._2)
    //    println(strings)
    //
    //    val tuples: List[(String, Int)] = strings.flatMap(_.split(" "))
    //      .groupBy(s => s)
    //      .map(tuple => (tuple._1, tuple._2.size))
    //      .toList
    //      .sortWith(_._2 > _._2)
    //      .take(3)
    //    println(tuples)

    // 步骤一: 转换为(hello,4),(scala,4)
    // List(hello,scala,spark,world)
    val tuples: List[(String, Int)] = tupleList.flatMap((tuple: (String, Int)) => {
      val strings: Array[String] = tuple._1.split(" ")
      strings.map((s: String) => (s, tuple._2))
    })

    println(tuples)


    val tuples1: List[(String, Int)] = tupleList.flatMap(tuple => tuple._1.split(" ").map((_, tuple._2)))

    // 步骤二: 将相同的单词,次数相加到一起
    val map: Map[String, List[(String, Int)]] = tuples1.groupBy((tuple: (String, Int)) => tuple._1)

    println(map)

    val map1: Map[String, List[(String, Int)]] = tuples1.groupBy(_._1)

    // 如果只改变value的类型,可以使用mapValues代替map
    // 转换value的类型,之后相加
    val stringToInt: Map[String, Int] = map1.mapValues((list: List[(String, Int)]) => {
      list.map((tuples: (String, Int)) => tuples._2).sum
    })


    val stringToInt2: Map[String, Int] = map1.mapValues(_.map(_._2).sum)

    // 使用归约的方法
    val stringToInt1: Map[String, Int] = map1.mapValues((list: List[(String, Int)]) => {
      list.foldLeft(0)((res: Int, elem: (String, Int)) => res + elem._2)
    })

    val map2: Map[String, Int] = map1.mapValues(_.foldLeft(0)(_ + _._2))

    println(stringToInt1)

    // 步骤三: 排序取top3
    val tuples2: List[(String, Int)] = map2.toList
      .sortWith(_._2 > _._2)
      .take(3)

    println(tuples2)
  }
}
