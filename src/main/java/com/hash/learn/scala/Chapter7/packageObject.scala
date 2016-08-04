/**
  * @author Hash Zhang
  * @date 2016/8/4
  * @version 1.0.0
  */

//由于JVM局限，包不能包含工具函数和常量，利用包对象

package com.hash.learn.scala

package object Chapter7 {
  val defaultName = "HashZhang"
}

package Chapter7 {

  object test7 {
    def execute = {
      println(defaultName)
    }
  }

}


