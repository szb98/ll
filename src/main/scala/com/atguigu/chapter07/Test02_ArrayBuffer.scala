package com.atguigu.chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    // 可变数组
    val arrayBuffer: ArrayBuffer[Int] = new ArrayBuffer[Int]()

    // 使用伴生对象的apply方法创建可变数组
    val buffer: ArrayBuffer[Any] = ArrayBuffer(1, 2, 3, 4, 5, "ff")

    val arrayBuffer1: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5)
    // 遍历可变数组
    arrayBuffer1.foreach(println)
    // 底层调用的还是toString方法
    println(arrayBuffer1.toString())

    // 增加元素
    arrayBuffer1.append(6)
    println(arrayBuffer1)

    arrayBuffer1 += 7
    println(arrayBuffer1)

    arrayBuffer1.prepend(0)
    println(arrayBuffer1)

    -1 +=: arrayBuffer1
    println(arrayBuffer1)

    arrayBuffer1.appendAll(ArrayBuffer(8, 9, 10, 11))
    println(arrayBuffer1)

    arrayBuffer1 ++= ArrayBuffer(7, 8, 9)

    arrayBuffer1.insert(1, 100)
    println(arrayBuffer1)

    // 修改元素
    arrayBuffer1(0) = 200
    arrayBuffer1.update(2, 300)
    println(arrayBuffer1)

    // 删除元素
    arrayBuffer1.remove(0)
    println(arrayBuffer1)
    arrayBuffer1.remove(0, 2)
    println(arrayBuffer1)

    //可变数组和不可变数组的转换
    // 可变数组和不可变数组的转换
    val ints: Array[Int] = Array(1, 2, 3, 4)
    val ints1: ArrayBuffer[Int] = ArrayBuffer(5, 6, 7, 8)

    //不可变转换为可变
    val buffer1: mutable.Buffer[Int] = ints.toBuffer
    buffer1.append(5)
    println(buffer1)

    //可变转换为不可变
    val array: Array[Int] = ints1.toArray

    //多维数组
    val array1: Array[Array[Int]] = Array.ofDim[Int](3,4)
    array1(1)(1)=100
    array1(2)(1)=300
    //遍历
    for (array <- array1) {
      for (elem <- array) {
        print(elem+"\t")
      }
      println()
    }

  }
}
