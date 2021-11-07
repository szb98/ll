package com.atguigu.chapter07

import scala.collection.mutable.ArrayOps

object zz {
  def main(args: Array[String]): Unit = {
    val tupleList = List(("Hello Scala Spark World", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))

    val tuples1: List[(String, Int)] = tupleList.flatMap(tuple => tuple._1.split(" ").map((_, tuple._2)))
    val map1: Map[String, List[(String, Int)]] = tuples1.groupBy(_._1)
    val stringToInt2: Map[String, Int] = map1.mapValues(_.map(_._2).sum)
    val tuples2: List[(String, Int)] = stringToInt2.toList
      .sortWith(_._2 > _._2)
      .take(3)
  }
}
