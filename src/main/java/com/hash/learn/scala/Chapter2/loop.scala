package com.hash.learn.scala.Chapter2

/**
  * @author Hash Zhang
  * @date 2016/7/21
  * @version 1.0.0
  */
object loop {
  def whileLoop: Unit = {
    var n = 10
    while (n > 0) {
      println(n)
      n -= 1
    }
  }

  def forLoop: Unit = {
    //to 为闭区间
    for (i <- 1 to 5)
      println(i)
    //until为左闭右开区间
    for (i <- 1 until 5)
      println(i)
    println("---------------------------------------------")
    //可以用字符串
    for (i <- "abcdefg")
      println(i)
  }

  def advanceForLoop: Unit = {
    //嵌套循环写在同一行
    println("---------------------------------------------")
    for (i <- 1 to 3; j <- 1 to 3)
      println("i:" + i + " j:" + j)
    //可以加条件
    println("---------------------------------------------")
    for (i <- 1 to 3; j <- 1 to 3 if i != j)
      println("i:" + i + " j:" + j)
    //可以有中间变量
    println("---------------------------------------------")
    for (i <- 1 to 10; from = i % 3; j <- 1 to from)
      println("i:" + i + " j:" + j)

    //for推导式
    println(for (i <- 1 to 10) yield i)
    println(for (i <- 1 to 10) yield i % 3)

    //推导式生成的集合类型和第一个生成器类型兼容
    //字符串
    println(for (i <- "abcdefg"; j <- 1 to 2) yield i)
    //Range类型
    println(for (j <- 1 to 2; i <- "abcdefg") yield i)
  }
}
