package com.hash.learn.scala.Chapter2

/**
  * @author Hash Zhang
  * @date 2016/7/21
  * @version 1.0.0
  */
object exercise {
  def ex1(para: Int): Int = {
    if (para > 0)
      1
    else if (para < 0)
      -1
    else
      0
  }

  def ex4: Unit = {
    for (i <- -10 to -1)
      println(-i)
  }

  def countdown(n: Int) = {
    if (n > 0)
      for (i <- -n to 0)
        println(-i)
    else
      for (i <- n to 0)
        println(i)
  }

  def recursivePow(x:Double,n:Int):Double = {
    if(n < 0)
      1 / recursivePow(x,-n)
    else if (n == 0)
      1
    else
      x * recursivePow(x,n-1)
  }

  def execute: Unit = {
    println("ex1(-9) ->" + ex1(-9))
    println("ex1(9) ->" + ex1(9))
    println("ex1(0) ->" + ex1(0))
    println("---------------------------------------------")
    ex4
    println("---------------------------------------------")
    countdown(9)
    println("---------------------------------------------")
    countdown(-9)
    println("recursivePow(9.0,2) -> "+recursivePow(9.0,2))
    println("recursivePow(9.0,-2) -> "+recursivePow(9.0,-2))
  }
}
