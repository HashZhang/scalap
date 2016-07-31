package com.hash.learn.scala.Chapter5

/**
  * @author Hash Zhang
  * @date 2016/7/31
  * @version 1.0.0
  */
object Exercise {

  class Counter(private var value: Int = 0) {
    def increment() = {
      if (value == Int.MaxValue)
        value = 0
      else
        value += 1
    }

    def current = value
  }

  def ex01 = {
    val counter = new Counter(Int.MaxValue)
    counter.increment()
    println(counter.current)//输出：0
  }

  class BankAccount(private var balance: Double) {
    def currentBalance = balance

    def deposit(value: Double) = {
      balance += value
    }

    def withdraw(value: Double) = {
      balance -= value
    }
  }

  def ex02 = {
    val bankAccount = new BankAccount(100000)
    bankAccount.deposit(99)
    bankAccount.withdraw(88)
    println(bankAccount.currentBalance)//输出：100011.0
  }

  class Time(private val hours: Int, private val minutes: Int) {
    if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59)
      throw new IllegalArgumentException()

    def before(other: Time): Boolean = {
      (hours > other.hours) || ((hours == other.hours) && (minutes > other.minutes))
    }

    def description = "[" + hours + ":" + minutes + "]"
  }

  def ex03 = {
    val time = new Time(13, 59)
    val time2 = new Time(13, 25)
    val time3 = new Time(14, 25)

    println(time.description + time2.description + time.before(time2))//输出：[13:59][13:25]true
    println(time.description + time3.description + time.before(time3))//输出：[13:59][14:25]false
  }
}
