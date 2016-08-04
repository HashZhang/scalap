package com.hash.learn.scala.Chapter6

/**
  * @author Hash Zhang
  * @date 2016/8/3
  * @version 1.0.0
  */
object associate {
  /**
    * 伴生对象
    * 针对又有静态方法，又有实例方法的
    */
  object Account {
    private var lastNumber = 0;

    def newUniqueId = {
      lastNumber += 1
      lastNumber
    }
  }

  class Account {
    var balance = 0.0

    def deposit(value:Double) = {
      balance += value
      balance
    }

    def withdraw(value:Double) = {
      balance -= value
      balance
    }
  }
}
