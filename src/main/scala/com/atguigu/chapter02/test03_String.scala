package com.atguigu.chapter02


object test03_String {
  def main(args: Array[String]): Unit = {
    System.out.println("hello")

    //    （1）字符串，通过+号连接   也可以使用* 进行反复拼接
    println("scala")

    println("scala" + "scala")

    println("scala" * 100)


    //    （2）printf用法：字符串，通过%传值。
    printf("%d岁的%s出去玩啦\n",18,"weige")

    printf("%.2f岁的%s出去玩啦\n",18.1111,"weige")

    //    （3）字符串模板（插值字符串）：通过$获取变量值

    val name: String = "awei"
    val age: Int = 18

    println(s"${age}岁的${name}来玩")

    println(s"${age + 20}岁的${name + "gege"}去玩")

    println("==============")

    println("我\n是\n一首\n诗")

    "我" +
      "是" +
      "一首" +
      "诗"

    println(
      """我
        |是
        |一首
        |诗
        |""".stripMargin)




  }


}
