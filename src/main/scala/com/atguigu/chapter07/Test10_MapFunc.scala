package com.atguigu.chapter07

object Test10_MapFunc {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    val wordList: List[String] = List("hello world", "hello atguigu", "hello scala")

    // foreach 的返回值固定是unit 通常用来打印元素
    val unit: Unit = list.foreach((i: Int) => i * 2)

    //    （1）过滤
    //    遍历一个集合并从中获取满足指定条件的元素组成一个新的集合
    val list1: List[Int] = list.filter((i: Int) => i > 5)

    val ints: List[Int] = list.filter(_ > 5)
    println(list1)


    //    （2）转化/映射（map）
    //    将集合中的每一个元素映射到某一个函数
    // 将int值映射成("我是",int)
    val tuples: List[(String, Int)] = list.map((i: Int) => ("我是", i))

    val tuples1: List[(String, Int)] = list.map(("我是", _))
    println(tuples1)


    //    （3）扁平化  只能用于集合套集合的形式
    val flatten: List[Int] = nestedList.flatten
    println(flatten)

    val flatten1: List[Char] = wordList.flatten
    println(flatten1)

    //    （4）扁平化+映射 注：flatMap相当于先进行map操作，在进行flatten操作
    //    集合中的每个元素的子元素映射到某个函数并返回新集合

    val list2: List[List[String]] = wordList.map((s: String) => {
      val strings: Array[String] = s.split(" ")
      strings.toList
    })
    println(list2)

    val flatten2: List[String] = list2.flatten
    println(flatten2)

    val strings1: List[String] = wordList.flatMap((s: String) => {
      s.split(" ")
    })

    val strings: List[String] = wordList.flatMap(_.split(" "))

    println(strings)



    //    （5）分组(group)
    //    按照指定的规则对集合的元素进行分组
    val charToStrings: Map[String, List[String]] = strings.groupBy((s: String) => s)

    println(charToStrings)


    // 对元素奇偶数分组
    val booleanToInts: Map[Boolean, List[Int]] = list.groupBy((i: Int) => i % 2 == 0)
    println(booleanToInts)
    val intToInts: Map[Int, List[Int]] = list.groupBy((i: Int) => i % 2)
    println(intToInts)
  }
}
