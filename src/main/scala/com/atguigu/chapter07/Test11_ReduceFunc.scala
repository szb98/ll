package com.atguigu.chapter07

object Test11_ReduceFunc {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6)
    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    val wordList: List[String] = List("hello world", "hello atguigu", "hello scala")


    // 归约
    // reduce  不带初始的归约
    // 以集合第一个元素作为初始值
    // 并且初始值类型和返回值类型同集合元素类型一致
    val i: Int = list.reduce((res: Int, elem: Int) => res + elem)
    val i1: Int = list.sum
    //println(i)

    list.reduce((res: Int, elem: Int) => {
      println(res)
      res + elem
    })

    val i2: Int = list.reduce((res: Int, elem: Int) => res - elem)
    //println(i2)
    list.reduce(_ - _)

    // 1 - (2 - (3 - (4 - (5 - 6))))
    val i3: Int = list.reduceRight(_ - _)
    //println(i3)

    // 折叠
    // fold 带初始值的归约
    // 以填写的参数作为初始值
    // 初始值和返回值的类型同集合元素类型一致
    val i4: Int = list.fold(0)(_ - _)
    //println(i4)

    // foldLeft(aggregate) 带初始值的归约
    // 以填写的参数作为初始值
    // 初始值和返回值的类型同集合元素类型可以不一致
    list.foldLeft(("sum", 0))((res:(String,Int),elem:Int) => (res._1,res._2 + elem))
    val tuple: (String, Int) = list.foldLeft(("sum", 0))((res:(String,Int),elem:Int) => (res._1,res._2 + elem))
    println(tuple)


    // 10 - (6 - (5 - (4 - (3 - (2 - 1)))))
    val i5: Int = list.foldRight(10)(_ - _)
    //println(i5)



  }
}
