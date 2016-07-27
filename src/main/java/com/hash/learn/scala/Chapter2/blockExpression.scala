package com.hash.learn.scala.Chapter2

/**
  * @author Hash Zhang
  * @date 2016/7/21
  * @version 1.0.0
  * @note {}块是有值的，值就是最后一个表达式的值;没有值的表达式（比如说赋值类型的）值为Unit
  */
object blockExpression {
  def value = {
    val a = {
      val b = 1
      b
    }
    println("a->" + a)
    var d = 0
    val c = d = 1;
    println("c -> " + c)
  }
}
