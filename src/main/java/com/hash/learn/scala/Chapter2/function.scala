package com.hash.learn.scala.Chapter2

/**
  * @author Hash Zhang
  * @date 2016/7/21
  * @version 1.0.0
  */
object function {
  def parameter: Unit = {
    //带名参数
    def decorate(left: String = "[", middle: String, right: String = "]") = left + middle + right
    println(decorate(middle = "asd"))
    //匿名参数
    def decorate2(middle: String, left: String = "[", right: String = "]") = left + middle + right
    println(decorate2("asd"))
    //变长参数(输入为Seq)
    def sum(args: Int*) = {
      var sum = 0
      for (i <- args) {
        sum += i
      }
      sum
    }

    println(sum(1, 9, 9, 9))
    //Range to Seq
    println(sum(1 to 9: _*))
  }

}
