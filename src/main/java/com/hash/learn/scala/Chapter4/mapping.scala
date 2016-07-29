package com.hash.learn.scala.Chapter4

import scala.collection.SortedMap

/**
  * @author Hash Zhang
  * @date 2016/7/29
  * @version 1.0.0
  */
object mapping {
  def constructMap = {
    //构造一个不可变Map[String Int]
    val scores = Map("Alice" -> 10, "aaa" -> 9, "bbb" -> 5)
    //构造一个可变Map[String,Int]
    val mscores1 = scala.collection.mutable.Map("Alice" -> 10, "aaa" -> 9, "bbb" -> 5)

    val mscores2 = scala.collection.mutable.Map(("Alice", 10), ("aaa", 9), ("bbb", 8))
  }

  def curdMap = {
    val scores = scala.collection.mutable.Map("Alice" -> 10, "aaa" -> 9, "bbb" -> 5)
    println(scores.mkString("<", ",", ">"))//输出：<bbb -> 5,aaa -> 9,Alice -> 10>
    //val bobScore = scores("Bob") //找不到抛异常
    val aliceScore = scores("Alice")
    val bobScore = scores.getOrElse("Bob", 6)
    println(aliceScore)//输出：10
    println(bobScore)//输出：6

    scores("Alice") = 9
    println(scores("Alice"))//输出：9

    scores += ("Bob" -> 7)
    println(scores.mkString("<", ",", ">"))//输出：<bbb -> 5,Bob -> 7,aaa -> 9,Alice -> 9>

    scores -= "Bob"
    println(scores.mkString("<", ",", ">"))//输出：<bbb -> 5,aaa -> 9,Alice -> 9>
  }

  def traverseMap = {
    val mapping = Map("Alice" -> 10, "aaa" -> 9, "bbb" -> 5)
    val a = for ((k, v) <- mapping) yield k + ":" + v
    println(a)//输出：List(Alice:10, aaa:9, bbb:5)
    val b = for (k <- mapping.keys) yield k
    println(b)//输出：Set(Alice, aaa, bbb)
    val c = for (v <- mapping.values) yield v
    println(c)//输出：List(10, 9, 5)
  }

  def sortedMap = {
    //scala本身只有不可变排序Map（树形Map）
    val mapping = SortedMap("Alice" -> 10, "aaa" -> 9, "bbb" -> 5)
    println(mapping.mkString("<", ",", ">"))//输出：<Alice -> 10,aaa -> 9,bbb -> 5>
  }

}
