package com.hash.learn.scala.Chapter1

//不是*而是_
import scala.math._
import scala.math.BigInt._
import scala.util._

/**
  * @author Hash Zhang
  * @date 2016/7/20
  * @version 1.0.0
  */
object fundamental {
  def primitiveType(): Unit = {
    //scala没有原始类型，都是对象
    println("1.toString -> " + 1.toString)
    //富类型自动转换Int->RichInt再调用to
    println("1.to(199) -> " + 1.to(199))
    println("\"Hello.intersect(\"low\")\" -> " + "Hello".intersect("low"))
    //a.方法(b)  ==  a 方法 b
    println("1.to(199) -> " + (1 to 199))
    //scala没有++或者--
  }

  def callFunction = {
    println("sqrt(2) -> " + sqrt(2))
    println("pow(2,4) -> " + pow(2, 4))
    println("min(3,Pi)" + min(3, Pi))

    println("\"jsjsjdaj\".distinct -> " + "jsjsjdaj".distinct)
  }

  def applyMethod: Unit = {
    //字符串字符定位
    println("\"hello\"(4) -> " + "hello" (4))
    println("\"hello\".apply(4) -> " + "hello".apply(4))
    //构建对象常用方法
    println("BigInt(\"12344567890\") -> " + BigInt("1234567890"))
    println("Array(1,2,3,4,5,6,7,8,9,0) -> " + Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 0))
  }

  def exercise: Unit = {
    println(pow(sqrt(3.0), 2.0))
    println("\"asdasd\" * 3 -> " + ("asdasd" * 3))
    println("10 max 2 -> " + (10 max 2))
    println("BigInt(\"2\") pow 1024 -> " + (BigInt("2") pow 1024))
    println("probablePrime(10, Random) -> " + probablePrime(10, Random))

    println("随机文件名：" + BigInt(Random.nextInt()).toString(36))

    val str = "abcdefghijklmn"
    println("str(0) -> " + str(0))
    println("str.take(0) -> " + str.take(1))
    println("str.reverse(0) -> " + str.reverse(0))
    println("str.takeRight(0) -> " + str.takeRight(1))

  }
}
