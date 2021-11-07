package com.atguigu.chapter06

object Test01_Package {
  def main(args: Array[String]): Unit = {
    println(packageName)
    sayHi()
  }
}
package com {




  object Outer {
    def main(args: Array[String]): Unit = {
      println("kkk")

      //Inner.main(args)
    }
  }
  package atguigu {

    object Inner {
      def main(args: Array[String]): Unit = {
        println("llllll")
        Outer.main(args)
        println(packageName)
      }
    }

  }

}
package object com{
  val packageName="ch"
}