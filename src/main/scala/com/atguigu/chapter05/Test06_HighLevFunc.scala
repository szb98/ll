package com.atguigu.chapter05

object Test06_HighLevFunc {
  def main(args: Array[String]): Unit = {

    //    1）函数可以作为值进行传递
    def sayHi(name: String) = name + "gege"

    val str: String = sayHi("linhai")

    val func = sayHi _

    println(func("shasha"))

    // 如果函数的类型可以推断, 此时不需要使用空格+_来表示函数自身
    val func1: String => String = sayHi


    //    2）函数可以作为参数进行传递
    def sumAB(a: Int, b: Int): Int = a + b

    def funcXY(x: Int, y: Int, func1: (Int, Int) => (Int)) = func1(x, y)

    val i: Int = funcXY(10, 20, sumAB _)
    println(i)


    val i1: Int = funcXY(10, 20, (x: Int, y: Int) => x * 2 + 8 * y)
    println(i1)

    val i2: Int = funcXY(10, 20, _ * 2 + 8 * _)
    println(i2)


    //    3）函数可以作为函数返回值返回
    def sayHi1(name: String) = {
      def func1(age: Int): String = {
        s"欢迎$age 岁的$name 大爷来玩"
      }

      func1 _
    }

    val function: Int => String = sayHi1("linhai")

    val str1: String = function(10)

    println(str1)

    println(sayHi1("juzi")(18))



    // 化简
    def sayHi2(name: String): Int => String = "欢迎" +  _ + "岁的" + s"$name 大爷来玩"



  }
}
