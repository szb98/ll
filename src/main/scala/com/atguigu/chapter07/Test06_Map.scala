package com.atguigu.chapter07

import scala.collection.mutable

object Test06_Map {
  def main(args: Array[String]): Unit = {
    //不可变map
    val map: Map[String, Int] = Map("hello" -> 1, "world" -> 2)
    val map1: Map[String, Int] = Map(("hello", 1), ("world", 2), ("atguigu", 3))

    //打印map
    println(map)

    for (elem <- map) {
      println(elem)
    }

    val keys: Iterable[String] = map.keys
    for (elem <- keys) {
      println(elem)
    }

    val values: Iterable[Int] = map.values
    for (elem <- values) {
      println(elem)
    }

    println(map1)

    for (elem <- map1) {
      val key: String = elem._1
      val value: Int = elem._2
    }

    //查找数据
    val maybeInt: Option[Int] = map1.get("atguigu")
    val maybeInt1: Option[Int] = map1.get("atguigu1")

    println(maybeInt)
    println(maybeInt1)

    //初始的get方法
    if (!map1.get("atguigu").isEmpty) {
      val value: Int = map1.get("atguigu").get
      println(value)
    }

    //第一层优化方法
    val i: Int = map1.get("atguigu1").getOrElse(1)
    println(i)

    //第二层优化
    val i1: Int = map1.getOrElse("atguigu2", 10)
    println(i1)

    // 可变map
    val map2: mutable.Map[String, Int] = mutable.Map(("hello", 1), ("world", 2), ("atguigu", 3))
    val maybeInt2: Option[Int] = map2.put("hello", 2)
    println(maybeInt2)
    println(map2)

    val maybeInt3: Option[Int] = map2.remove("world")
    println(maybeInt3)
    println(map2)

  }
}
