package com.atguigu.chapter04

import scala.util.control.Breaks

object Test04_break {
  def main(args: Array[String]): Unit = {

    try {
      for (i <- 1 to 10) {
        if (i == 5) {
          throw new RuntimeException()
        }
        println(i)
      }
    } catch {
      case e: RuntimeException => println("zzz")
    }
    //scala当中封装好的循环中断
     Breaks.breakable(
       for(i<- 1 to 10){
         if (i==5){
           Breaks.break()
         }
         println(i)
       }
     )
  }
}
