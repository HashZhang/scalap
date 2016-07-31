package com.hash.learn.scala.Chapter5

/**
  * @author Hash Zhang
  * @date 2016/7/30
  * @version 1.0.0
  */
class Counter {
  //field必须初始化，为了知道类型
  //会自动生成private的getter还有private的setter
  //setter和getter并不是getValue()和setValue()这样，而是value(),value_=()这样
  private var value = 0

  def increment() = {
    value += 1
  }

  def current() = value

  //类私有field可以访问
  def largerThan(a: Counter): Boolean = {
    value > a.value
  }

  //对象私有field别的对象无法访问
  private[this] var name = "test"

  def setName(name: String) = {
    this.name = name
  }

  //会自动生成public的getter和setter
  var times = 0
  //会自动生成public的getter
  val alloc = "hash"

}

object Counter1 {
  val counter = new Counter
  def testClass = {
    //习惯上取值器不加括号
    println(counter.current)//输出：0
    //习惯上改值器加括号
    counter.increment()
    println(counter.current)//输出：1

    val counter2 = new Counter
    println(counter.largerThan(counter2))//输出：true
  }
}
