package com.atguigu.chapter07

object Test03_List {
  def main(args: Array[String]): Unit = {
    //    （1）List默认为不可变集合
    //    （2）创建一个List（数据有顺序，可重复）
    //    new List
    val list: List[Int] = List(1, 2, 3, 4)
    //    （3）遍历List
    list.foreach(println)
    list.foreach((i: Int) => println(i * 3))
    //    （4）List增加数据
    val list1: List[Int] = list :+ 1
    println(list1)

    val list2: List[Int] = 0 :: list1
    println(list2)

    //    （5）集合间合并：将一个整体拆成一个一个的个体，称为扁平化
    val list3: List[Any] = list :+ list1
    println(list3)

    val list4: List[Int] = list ::: list1
    println(list4)

    //    （6）取指定数据
    println(list1(1))

    //    （7）空集合Nil
    val nil: Nil.type = Nil
    println(nil)

    val list5: List[Int] = 1 :: 2 :: 3 :: 4 :: Nil
    println(list5)

  }
}
