package com.hash.learn.scala.Chapter8

/**
  * @author Hash Zhang
  * @date 2016/8/5
  * @version 1.0.0
  */
//覆盖父类的field或者方法一定要加override
class BankAccount(val initialBalance: Double) {
  private var balance = initialBalance

  def deposit(value: Double) = {
    balance += value
    balance
  }

  def withdraw(value: Double) = {
    balance -= value
    balance
  }
}

class CheckingAccount(override val initialBalance: Double) extends BankAccount(initialBalance) {
  private var balance = initialBalance

  override def deposit(value: Double) = {
    balance -= 1
    balance += value
    balance
  }

  override def withdraw(value: Double) = {
    balance -= 1
    balance -= value
    balance
  }
}

class SavingAccount(override val initialBalance: Double) extends BankAccount(initialBalance) {
  private var balance = initialBalance

  private var freeProcess = 3

  private val monthlyInterestRate = 0.01

  private def checkFreeProcess = {
    if (freeProcess > 0) {
      freeProcess -= 1
      false
    } else {
      true
    }
  }

  private def earnMonthlyInterest = {
    freeProcess = 3
    balance += balance * monthlyInterestRate
    balance
  }

  override def deposit(value: Double) = {
    if (checkFreeProcess)
      balance -= 1
    balance += value
    balance
  }

  override def withdraw(value: Double) = {
    if (checkFreeProcess)
      balance -= 1
    balance -= value
    balance
  }
}