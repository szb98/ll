package com.atguigu.chapter09

object Test03 {
  def main(args: Array[String]): Unit = {


    var father = new MyList[Father]
    var son = new MyList[Son]
    List(1,2,3,4).sorted

    //    father = son
    //    son = father
  }
}

// T 的写法两个类没有父子关系
// +T 的写法表示协变,随着泛型的父子关系发送父子关系
// -T 的写法表示逆变,随着泛型的父子关系反向发送父子关系

class MyList[-T]{

}

class Father{

}

class Son extends Father{

}
