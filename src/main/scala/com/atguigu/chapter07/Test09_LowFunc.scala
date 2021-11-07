package com.atguigu.chapter07

object Test09_LowFunc {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 5, -3, 4, 2, -7, 6)

    //(1)求和
    val sum: Int = list.sum
    println(sum)
    //2.求乘积
    val product: Int = list.product
    //3.最大值
    val max: Int = list.max
    //最小值
    val min: Int = list.min


    //5.排序
    val sorted: List[Int] = list.sorted
    println(sorted)

    //倒转排序
    val reverse: List[Int] = list.sorted.reverse
    println(reverse)

    val ints: List[Int] = list.sorted(Ordering.Int.reverse)
    println(ints)

    //复杂数据类型的排序
    val list1 = List(("hello", 10), ("world", 3), ("scala", 8))

    //以元组的key进行排序
    val tuples: List[(String, Int)] = list1.sortBy((t:(String,Int))=>t._1)(Ordering.String.reverse)
    println(tuples)

    //yiyuanzude
    val tuples1: List[(String, Int)] = list1.sortBy((t:(String,Int))=>t._2)(Ordering.Int.reverse)
    val tuples2: List[(String, Int)] = list1.sortBy(_._2)(Ordering.Int.reverse)
    println(tuples1)


    val tuples3: List[(String, Int)] = list1.sortWith((left:(String,Int),right:(String,Int))=>left._2>right._2)
    println(tuples3)


    val tuples4: List[(String, Int)] = list1.sortWith(_._2>_._2)
    println(tuples4)
  }
}
