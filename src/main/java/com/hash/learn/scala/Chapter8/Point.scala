package com.hash.learn.scala.Chapter8

/**
  * @author Hash Zhang
  * @date 2016/8/8
  * @version 1.0.0
  */
class Point(val x: Double, val y: Double) {
  override def toString = {
    "[" + x + "," + y + "]"
  }
}

class LabeledPoint(val label: String, override val x: Double, override val y: Double) extends Point(x: Double, y: Double) {
  override def toString = {
    "[" + label + "(" + x + "," + y + ")" + "]"
  }
}
