package com.hash.learn.scala.Chapter6

import com.hash.learn.scala.Chapter6.apply.Account

/**
  * @author Hash Zhang
  * @date 2016/8/3
  * @version 1.0.0
  */
object CMain {
  def main(args: Array[String]) {
    println("************************************************************")
    println("************************Chapter 6***************************")
    println("************************************************************")
    val a = Account(99)
    println(a.id)
    println(a.currentBalance)
  }
}
