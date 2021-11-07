package com.atguigu.chapter07

object Test12_WordCount {
  def main(args: Array[String]): Unit = {
    val stringList = List("Hello Scala Hbase kafka", "Hello Scala Hbase", "Hello Scala", "Hello")
    // 步骤一 : 针对长字符串,切分为单个单词并且扁平化
    // 使用map进行转换
    val list: List[List[String]] = stringList.map((s: String) => s.split(" ").toList)

    println(list)

    // 再使用flatten进行扁平化
    val flatten: List[String] = list.flatten
    println(flatten)

    // 使用flatMap代替map加flatten
    stringList.flatMap((s: String) => s.split(" "))
    val strings: List[String] = stringList.flatMap(_.split(" "))

    // 步骤二: 将相同的单词聚集为一组
    val map: Map[String, List[String]] = strings.groupBy((s: String) => s)

    val map1 = strings.groupBy(s => s)
    println(map)


    // 步骤三: 将分组之后的结果转换为(单词,次数)的形式
    val map2: Map[String, Int] = map1.map((tuple: (String, List[String])) => (tuple._1, tuple._2.size))
    println(map2)

    val stringToInt: Map[String, Int] = map1.map(tuple => (tuple._1, tuple._2.size))


    // 步骤四: 排序取top3
    val list1: List[(String, Int)] = stringToInt.toList

    val tuples: List[(String, Int)] = list1.sortWith((left: (String, Int), right: (String, Int)) => left._2 > right._2)
    println(tuples)

    val tuples1: List[(String, Int)] = list1.sortWith(_._2 > _._2)

    val result: List[(String, Int)] = tuples1.take(3)
    println(result)


    // 熟练写法
    val tuples2: List[(String, Int)] = stringList.flatMap(_.split(" "))
      .groupBy(s => s)
      .map(tuple => (tuple._1, tuple._2.size))
      .toList
      .sortWith(_._2 > _._2)
      .take(3)

    println(tuples2)
  }
}
