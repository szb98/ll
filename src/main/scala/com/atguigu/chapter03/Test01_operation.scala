package com.atguigu.chapter03

object Test01_operation {
  def main(args: Array[String]): Unit = {
    // 算术运算符
    println(10 / 3.0)


    // ==和equals的区别
    val s = "aaa"
    val s1 = "aaa"
    println(s == s1)
    println(s.equals(s1))

    val s2 = new String("aaa")
    val s3 = new String("aaa")
    println(s2.==(s3))
    println(s2.equals(s3))

    println(s2.eq(s3))

    val student0 = new Student01()
    val student1 = new Student01()

    println(student0 == student1)
    println(student0.equals(student1))


    // 写一个方法 判断字符串非空
    def isNull(s: String): Boolean = {
      if (s == null) {
        return false
      } else if("".equals(s.trim)){
        return false
      }else{
        return true
      }
    }

    def isNull1(s: String): Boolean = {
      s != null && !("".equals(s.trim))
    }

    println(isNull1(""))
  }
}
class Student01 {

}