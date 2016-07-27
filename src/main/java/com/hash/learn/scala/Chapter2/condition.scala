package com.hash.learn.scala.Chapter2

/**
  * @author Hash Zhang
  * @date 2016/7/21
  * @version 1.0.0
  * @note 条件表表达式有值，值就是各个分支，缺少分支为Unit，完整分支为所有分支类型
  */
object condition {
  def conditionExpression: Unit = {
    val cond = 1
    val a =
      if (cond == 1)
        true
      else
        false
    println(a)
  }

  def conditionType: Unit = {
    val cond = 1
    var a = //Unit类型
      if (cond == 0)
        1
    //上面的相当于
    a =
      if (cond == 0)
        1
      else
        ()
    val b = //Any类型
      if (cond == 2)
        1
      else
        "hello"
    println("a -> " + a)
    println("b -> " + b)
  }
}
