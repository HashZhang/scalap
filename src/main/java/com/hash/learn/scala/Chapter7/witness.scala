/**
  * @author Hash Zhang
  * @date 2016/8/4
  * @version 1.0.0
  */
package com.hash.learn.scala {
  package Chapter7 {

    object wc {
      private[learn] def description = "I Can See U!";
    }

  }

}

package com.hash {

  import com.hash.learn.scala.Chapter7.wc

  object test8 {
    def execute = {
      //wc.description 在这里不可见
    }
  }
  package learn {

    import com.hash.learn.scala.Chapter7.wc

    object test8 {
      def execute = {
        wc.description
      }
    }

  }

}
