package com.hash.learn.scala.Chapter8

import scala.collection.mutable.ArrayBuffer

/**
  * @author Hash Zhang
  * @date 2016/8/5
  * @version 1.0.0
  */
abstract class Item {
  //抽象filed和method不用abstract修饰
  def price: Double

  def description: String


}

//def只能重写另一个def
//val可以重写另一个val还有def
//var只能重写另一个抽象var
class SimpleItem(val price: Double, val description: String) extends Item {
  override def toString = {
    "[" + description + ":" + price + "]"
  }
}

class Bundle extends Item {
  private val items = ArrayBuffer[Item]()

  def addItems(item: Item) = {
    items += item
    items
  }

  def price = {
    var amount = 0.0;
    for (i <- items) {
      amount += i.price
    }
    amount
  }

  def description = {
    items.mkString("")
  }
}

object Item{
  def test = {
    val item1 = new SimpleItem(9.9,"pencil")
    val item2 = new SimpleItem(99.9,"pen")
    val items = new Bundle
    items.addItems(item1)
    items.addItems(item2)
    println(items.description)
  }
}
