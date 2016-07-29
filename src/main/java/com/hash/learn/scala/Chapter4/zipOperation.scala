package com.hash.learn.scala.Chapter4

/**
  * @author Hash Zhang
  * @date 2016/7/29.
  * @version 1.0.0
  */
object zipOperation {
  def test = {
    val key = Array("zhx", "dick", "hash")
    val value = Array(1, 2, 3)
    val keyvalue = key.zip(value)
    val map = keyvalue.toMap

    println(map.mkString("<", ",", ">"))
  }
}
