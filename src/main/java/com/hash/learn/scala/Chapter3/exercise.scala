package com.hash.learn.scala.Chapter3

import scala.util.Random

/**
  * @author Hash Zhang
  * @date 2016/7/27
  * @version 1.0.0
  */
object exercise {
  def ex1(n: Int) = {
    val a = new Array[Int](n)
    for (i <- 0 until a.length) {
      a(i) = Random.nextInt(n)
    }
  }

  def swapAdjoin(n: Array[Int]): Array[Int] = {
    var count = -1
    for (i <- n) yield {
      count += 1
      if (count % 2 == 0) {
        if (count + 1 < n.length)
          n(count + 1)
        else
          i
      } else {
        n(count - 1)
      }
    }
  }

  def ex2_3 = {
    println(swapAdjoin(Array(1, 2, 3, 4, 5)).mkString("<", ",", ">")) //输出：<2,1,4,3,5>
  }

  def classify(n: Array[Int]): Array[Int] = {
    val a = (for (i <- n if i > 0) yield i).toBuffer
    a.appendAll(for (i <- n if i <= 0) yield i)
    a.toArray
  }

  def ex4 = {
    println(classify(Array(1, 2, 3, 0, -1, 2, 3, 45, -32, -43, 2, 0)).mkString("<", ",", ">"))//输出：<1,2,3,2,3,45,2,0,-1,-32,-43,0>
  }

  def arrayAverage(n:Array[Double]):Double = {
    n.sum/n.length
  }

  def ex5 = {
     println(arrayAverage(Array(1,2,3,5.0,7.9))) //输出3.78
  }

  def ex7 = {
    println(Array(1,2,3,4,5,1,12,2,3,4,5,2,3,4,6,8).distinct.mkString("<", ",", ">"))//输出：<1,2,3,4,5,12,6,8>
  }
}
