package com.hash.learn.scala.Chapter2

/**
  * @author Hash Zhang
  * @date 2016/7/21
  * @version 1.0.0
  */
object exception {
  def handleException: Unit = {
    //scala没有受检异常
    //throw表达式类型为Nothing
    println("---------------------------------------------")
    val cond = 1
    try {
      val a =
        if (cond == 0)
          true
        else if (cond < 0)
          throw new IllegalArgumentException("cond is less than 0!")
        else
          throw new Exception("cond is larger than 0!")
    } catch {
      case e1: IllegalArgumentException => e1.printStackTrace()
      case e2: Exception => e2.printStackTrace()
    } finally {
      println("finally block!")
    }
    //对于条件分支，如果一个分支返回throw表达式，那么它的类型就是其他分支的类型

  }
}
