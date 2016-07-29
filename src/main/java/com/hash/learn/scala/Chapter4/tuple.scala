package com.hash.learn.scala.Chapter4

/**
  * @author Hash Zhang
  * @date 2016/7/29.
  * @version 1.0.0
  */
object tuple {
  def test = {
    val tuple1 = (1, 2, 3, 9.0, "hello")
    val element1 = tuple1._1
    println(element1)

    val (_, second, third, _, _) = tuple1
    println(second)
    println(third)

  }
}
