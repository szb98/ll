package com.atguigu.chapter06

object Test14_SelfType {
  def main(args: Array[String]): Unit = {

  }
}
trait Age14{

}
trait Young14{
  //特质自身类型
  _:Age14 =>
}

class Person14 extends Young14 with Age14{

}
