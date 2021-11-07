package com.atguigu.chapter09

object Test01_Exception {
  def main(args: Array[String]): Unit = {
    // 异常处理
    try{
      //      val i:Byte = 128

      val value: Nothing = throw new RuntimeException
      10 / 0
    }catch {
      case e:RuntimeException =>
      case e:Exception => println("除数不能为0")
    }finally {
      println("finally")
    }

    //    f11()

  }

  @throws
  def f11()={
    "abc".toInt
  }
}
