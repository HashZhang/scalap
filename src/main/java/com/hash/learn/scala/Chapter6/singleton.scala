package com.hash.learn.scala.Chapter6

/**
  * @author Hash Zhang
  * @date 2016/8/3
  * @version 1.0.0
  */
object singleton {

  /**
    * 利用单例object：
    * 作为存放工具函数或者常量
    * 高效共享单个不可变实例
    * 单例模式协调
    */
  object ID {
    private var lastNumber = 0;

    def newUniqueId = {
      lastNumber += 1
      lastNumber
    }
  }
}
