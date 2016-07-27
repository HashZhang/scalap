package com.hash.learn.scala.Chapter2
//默认的过期，需要导入scala.io.StdIn._
import scala.io.StdIn._

/**
  * @author Hash Zhang
  * @date 2016/7/21
  * @version 1.0.0
  */
object console {
  def input: Unit ={
    val name = readLine("Please input your name:")
    println(name)
  }
}
