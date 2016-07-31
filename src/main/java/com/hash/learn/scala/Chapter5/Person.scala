package com.hash.learn.scala.Chapter5

/**
  * @author Hash Zhang
  * @date 2016/7/31
  * @version 1.0.0
  */
//main constructor
class Person(val name: String, var age: Int, var salary: Int) {
  //主构造器会执行所有语句
  println("Main constructor is called!")

  //多态构造器
  def this(name: String, age: Int) {
    this(name, age, 0)
  }

  def description = "Name: " + name + ", Age: " + age + ", Salary: " + salary
}

object Person1 {
  def test = {
    val person = new Person("zhxhash", 24, 20000)//输出：Main constructor is called!
    println(person.description)//输出：Name: zhxhash, Age: 24, Salary: 20000

    val person2 = new Person("zhxdick", 15)//输出：Main constructor is called!
    println(person2.description)//输出：Name: zhxdick, Age: 15, Salary: 0
  }
}
