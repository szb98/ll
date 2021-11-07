package com.atguigu.chapter07

import scala.collection.immutable.HashSet
import scala.collection.mutable

object Test05_Set {
  def main(args: Array[String]): Unit = {
    // set
    // 创建一个set
    val set: Set[Int] = Set(1, 2, 3, 4, 5)

    //判断创建的set类型
    println(set.isInstanceOf[HashSet[Int]])

    // set特性 无序 去重
    val set1: Set[Int] = Set(6, 2, 8, 5, 3, 9)
    println(set1)

    val set2: Set[Int] = Set(1, 1, 2, 1, 2, 4, 9, 8)
    println(set2)

    // 增加元素
    val set3: Set[Int] = set1 + 10
    println(set3)

    val set4: Set[Int] = set1 - 8
    println(set4)

    // 可变set
    val set5: mutable.Set[Int] = mutable.Set(1, 23, 4, 4, 5, 6, 7)

    //增加元素
    set5.add(9)
    println(set5)

    //删除元素
    set5.remove(4)
    println(set5)
  }
}
