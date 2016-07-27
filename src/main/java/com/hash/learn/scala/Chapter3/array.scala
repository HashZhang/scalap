package com.hash.learn.scala.Chapter3

import scala.collection.mutable.ArrayBuffer

/**
  * @author Hash Zhang
  * @date 2016/7/26
  * @version 1.0.0
  */
object array {
  def fixLen = {
    val s = Array("Hello", 1)
    //用()而不是[]
    println("s(0) -> " + s(0)) //输出s(0) -> Hello
  }

  def varLen = {
    val b = ArrayBuffer[Int]()
    // += 末尾增加元素或者元祖
    b += 1
    b +=(2, 3)
    println(b) //输出ArrayBuffer(1, 2, 3)
    // ++= 末未添加人以及和
    b ++= Array(4, 5, 6)
    println(b) //输出ArrayBuffer(1, 2, 3, 4, 5, 6)
    //trimEnd，去掉末尾的n个元素
    b.trimEnd(1)
    println(b) //输出ArrayBuffer(1, 2, 3, 4, 5)
    //末尾添加最高效，插入和移除涉及到平移，效率会差一些
    b.insert(2, 22)
    //插入多个
    b.insert(2, 222, 2222, 22222)
    println(b) //输出ArrayBuffer(1, 2, 222, 2222, 22222, 22, 3, 4, 5)
    //移除第二个元素
    b.remove(2)
    println(b) //输出ArrayBuffer(1, 2, 2222, 22222, 22, 3, 4, 5)
    //移除从第二个开始，3个元素
    b.remove(2, 3)
    println(b) //输出ArrayBuffer(1, 2, 3, 4, 5)
    println(b.toArray) //输出[I@755d828f
    println(b.toArray.toBuffer) //输出ArrayBuffer(1, 2, 3, 4, 5)
  }

  def traverseArray = {
    println("----------------跨2步长---------------------")
    for (i <- 0 until(10, 2))
      print(i) //输出02468
    println("\n----------------逆转----------------------")
    for (i <- (0 until(10, 2)).reverse)
      print(i) //输出86420
    println("\n----------------遍历数组--------------------")
    val a = Array(1, 2, 3, "abc")
    for (i <- a)
      print(i) //输出123abc
    println("\n------------------------------------------")
  }

  def transferArray = {
    val arr1 = Array(1, 2, 3, 4, 5, 6)
    val result1 = for (i <- arr1) yield i * 10
    println(result1) //输出[I@39b0595c

    val arr2 = ArrayBuffer[Int]()
    arr2 +=(1, 2, 3, 4, 5, 6)
    val result2 = for (i <- arr2) yield i
    println(result2) //输出ArrayBuffer(1, 2, 3, 4, 5, 6)
    println("------------------------------------------")
    val result3 = for (i <- arr2 if i % 2 == 0) yield i * 10
    val result4 = arr2.filter(_ % 2 == 0).map(_ * 10)
    println(result3) //输出ArrayBuffer(20, 40, 60)
    println(result4) //输出ArrayBuffer(20, 40, 60)
    //去掉第一个负数以外的负数
    val a = ArrayBuffer(1, 2, 3, 4, -5, 8, -1, 7, -2)
    var first = true
    val result5 = for (i <- a if i > 0 || first) yield {
      if (i < 0)
        first = false
      i
    }
    println(result5) //输出ArrayBuffer(1, 2, 3, 4, -5, 8, 7)
  }

  def algorithm = {
    println(Array(1, 2, 10).sum) //输出：13
    //数组类型不能是any，否则无法比较
    println(Array("Mary", "had", "a", "little", "lamp").max) //输出：little

    val a = ArrayBuffer(324, 123.2, 123, 23, 4, 12, 7)
    println(a.sorted.reverse) //输出：ArrayBuffer(324.0, 123.2, 123.0, 23.0, 12.0, 7.0, 4.0)
    val b = a.toArray
    scala.util.Sorting.quickSort(b)
    println(b.mkString("<", ",", ">")) //输出：<4.0,7.0,12.0,23.0,123.0,123.2,324.0>
  }

  def others = {
    val a = ArrayBuffer[Int](1, 2, 3)
    a.append(4, 5, 6)
    println(a.mkString("<", ",", ">")) //输出<1,2,3,4,5,6>
    println(a.count(_ > 2)) //输出：4
    def f(x: Int) = {
      if (x > 2)
        true
      else
        false
    }
    println(a.count(f)) //输出：4

    //+= -= 返回this，所以我们可以用链式
    a +=(1, 2, 3) -= 1 -= 5 //-= 去掉第一个为1和为5的元素
    println(a) //输出：ArrayBuffer(2, 3, 4, 6, 1, 2, 3)
  }

  def multiDimenArray = {
    val matrix1 = Array.ofDim[Int](3, 4) //二维数组
    val matrix2 = Array.ofDim[Int](3, 4, 5) //三维数组
    matrix1(1)(2) = 1
    matrix2(1)(2)(3) = 1

    println(matrix1.mkString("<", ",", ">")) //输出：（数组地址）<[I@a54a40c,[I@3ade1520,[I@4a3d0611>
    println(matrix2.mkString("<", ",", ">")) //输出：<[[I@6c596c2a,[[I@62cc70f8,[[I@5c0cdc74>


    val triangle = new Array[Array[Int]](10)
    for (i <- 0 until triangle.length) {
      triangle(i) = new Array[Int](i)
    }
  }
}
