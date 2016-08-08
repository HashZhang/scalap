package com.hash.learn.scala.Chapter7

/**
  * @author Hash Zhang
  * @date 2016/8/4
  * @version 1.0.0
  */
object renameAndHide {
  //将Java中的HashMap重命名，同时导入所有包下类
  import java.util.{HashMap => JavaHashMap, _}
  import scala.collection.mutable.HashMap

  def execute1 = {
    val a = HashMap(1 -> 2)
    val b = new JavaHashMap[Int, Int]()
  }

  import java.util.{HashMap => _}
  import scala.collection.mutable.HashMap

  def execute = {
    val a = HashMap(1 -> 2)
  }

  //scala程序默认隐式引入：
  //import java.lang._
  //import scala._
  //import Predef._
}
