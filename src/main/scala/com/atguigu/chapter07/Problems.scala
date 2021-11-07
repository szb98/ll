package com.atguigu.chapter07

import scala.collection.mutable

object Problems {
  def main(args: Array[String]): Unit = {
    // 需求: 归约两个map
    val map1: mutable.Map[String, Int] = mutable.Map(("hello", 2), ("atguigu", 1))
    val map2: mutable.Map[String, Int] = mutable.Map(("hello", 2), ("scala", 1))

    map2.foldLeft(map1)((res: mutable.Map[String, Int], elem: (String, Int)) => {
      res(elem._1) = elem._2 + res.getOrElse(elem._1, 0)
      res
    })


    //    for (elem <- map2) {
    //      // 在map1当中不存在这个元素
    //      if (map1.get(elem._1).isEmpty){
    //        map1.put(elem._1,elem._2)
    //      } else {
    //        // 在map1 当中存在这个元素
    //        map1(elem._1) = elem._2 + map1.get(elem._1).get
    //      }
    //    }
    //
    //    println(map1)
  }
}
