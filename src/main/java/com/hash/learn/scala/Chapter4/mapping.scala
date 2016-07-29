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
    println(scores.mkString("<", ",", ">"))
    //val bobScore = scores("Bob") //找不到抛异常
    val aliceScore = scores("Alice")
    val bobScore = scores.getOrElse("Bob", 6)
    println(aliceScore)
    println(bobScore)

    scores("Alice") = 9
    println(scores("Alice"))

    scores += ("Bob" -> 7)
    println(scores.mkString("<", ",", ">"))

    scores -= "Bob"
    println(scores.mkString("<", ",", ">"))
  }

  def traverseMap = {
    val mapping = Map("Alice" -> 10, "aaa" -> 9, "bbb" -> 5)
    val a = for ((k, v) <- mapping) yield k + ":" + v
    println(a)
    val b = for (k <- mapping.keys) yield k
    println(b)
    val c = for (v <- mapping.values) yield v
    println(c)
  }

  def sortedMap = {
    //scala本身只有不可变排序Map（树形Map）
    val mapping = SortedMap("Alice" -> 10, "aaa" -> 9, "bbb" -> 5)
    println(mapping.mkString("<", ",", ">"))
  }

}
