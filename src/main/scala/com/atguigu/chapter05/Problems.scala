package com.atguigu.chapter05

object Problems {
  def main(args: Array[String]): Unit = {
    // 需求一: 定义一个函数 输入的参数有三个,分别是(int,char,str)
    // 如果输入的参数是(0,'0',"") 返回false , 否则返回true
    def function1(i: Int, c: Char, s: String): Boolean = {
      if (i == 0 && c == '0' && s == "") false else true
    }


    def function2(i: Int, c: Char, s: String): Boolean = {
      //      !(i == 0 && c == '0' && s == "")
      i != 0 || c != '0' || s != ""
    }


    def function3(i: Int, c: Char, s: String) = i != 0 || c != '0' || s != ""



    // 需求二: 定义一个函数,(int)(char)(str)
    // 如果输入的参数是(0)('0')(""),返回false,否则返回true

    def func1(i: Int) = {
      def func2(c: Char) = {
        def func3(s: String): Boolean = {
          i != 0 || c != '0' || s != ""
        }

        func3 _
      }

      func2 _
    }

    println(func1(0)('0')(""))
    println(func1(1)('0')(""))
    println(func1(0)('1')(""))
    println(func1(0)('0')("1"))


    def func0(i: Int): Char => String => Boolean =
      c => _ != "" || c != '0' || i != 0


    def func10(i: Int): Char => String => Boolean =
      c => s => i != 0 || c != '0' || s != ""



    // 柯里化函数
    def currying(i:Int)(c:Char)(s:String) =
      i != 0 || c != '0' || s != ""

    println(currying(0)('0')(""))
    println(currying(1)('0')(""))
    println(currying(0)('1')(""))
    println(currying(0)('0')("1"))


    val function: Char => String => Boolean = currying(10)
    val function4: String => Boolean = function('1')
    val bool: Boolean = function4("1")



  }
}
