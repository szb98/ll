package com.atguigu.chapter08

object Test06_PartitionFunc {
  def main(args: Array[String]): Unit = {
    def main(args: Array[String]): Unit = {

      // 创建一个偏函数
      val value1: PartialFunction[List[Int], Option[Int]] = new PartialFunction[List[Int], Option[Int]] {
        // 偏函数能够匹配上的类型 true表示能匹配上,false表示不能匹配
        override def isDefinedAt(x: List[Int]) = x match {
          case x :: y :: _ => true
          case _ => false
        }

        // 能够匹配上的情况下,返回值是什么
        override def apply(v1: List[Int]) =
          v1 match {
            case x :: y :: _ => Some(y)
          }
      }


      // 使用匿名函数创建偏函数
      // 偏函数 省略了match关键字.直接写匹配
      val value: PartialFunction[List[Int], Option[Int]] = {
        case x :: y :: _ => Some(y)
      }

      //    将该List(1,2,3,4,5,6,"test")中的Int类型的元素加一，并去掉字符串。


      val list = List(1, 2, 3, 4, 5, 6, "test")
      val list1: List[Any] = list.filter(any => any match {
        case s: String => false
        case i: Int => true
        case _ => true
      })
      println(list1)

      val list2: List[Any] = list1.map(any => any match {
        case i: Int => i + 1
        case any: Any => any
      })

      println(list2)

      val list3: List[AnyVal] = list.map(any => any match {
        case i: Int => i + 1
        case s: String =>
      })
      println(list3)


      val ints: List[AnyVal] = list.collect({
        case i: Int => i + 1
      })

      println(ints)
  }
}}
