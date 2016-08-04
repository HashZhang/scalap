package com.hash.learn.scala.Chapter6

/**
  * @author Hash Zhang
  * @date 2016/8/4
  * @version 1.0.0
  */
object apply {

  class Account private(val id: Int, private var balance: Double) {
    def deposit(value: Double) = {
      balance += value
      balance
    }

    def withdraw(value: Double) = {
      balance -= value
      balance
    }

    def currentBalance = balance
  }

  object Account {
    var Id = 0

    def getId = {
      Id += 1
      Id
    }

    /**
      * 定义apply方法，在外部可以调用
      * val a = Account(99)
      * println(a.id)//输出：1
      * println(a.currentBalance)//输出：99.0
      * @param balance
      * @return
      */
    def apply(balance: Double) = {
      new Account(getId, balance)
    }
  }

}
