/**
  * @author Hash Zhang
  * @date 2016/8/4
  * @version 1.0.0
  */
package com {
  package hash {
    package learn {

      object test1 {
        def execute = {
          println("包的文件不一定要对应的文件夹下")
        }
      }

      package scala {

        object test2 {
          def execute = {
            println("同一文件可以包含多个包")
          }
        }

        object Utils {
          def execute = {
            println("作用域支持嵌套，可以访问上层名称")
          }
        }

        package Chapter7 {

          object test3 {
            def execute = {
              Utils.execute //作用域支持嵌套，可以访问上层名称
            }
          }

        }

      }

    }

  }

}

package com {
  package hash {
    package collection {

    }

    package test {



      object test4 {
        def execute = {
          //默认scala包是被载入的
          //val a = collection.mutable.ArrayBuffer(1,2,3,4) 语句有错，因为是相对路径引入包
          //任意地方可以import可以:
          import scala.collection.mutable.ArrayBuffer
          val a = ArrayBuffer(1,2,3,4)
          //也可以绝对路径
          val b = _root_.scala.collection.mutable.ArrayBuffer(1,2,3,4)

          println(a == b)
        }
      }

    }

  }

}
//串联式包语句
package com.hash.test{

  object test5 {
    def execute = {
      //这里不会出错，因为如此定义com和com.hash下的都不可见
      val a = collection.mutable.ArrayBuffer(1,2,3,4)
    }
  }
}
