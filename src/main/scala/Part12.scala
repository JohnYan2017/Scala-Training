package quickstudy
/**
  * Created by OP035308 on 2017/10/19.
  */
object Part12 {

  def main(args: Array[String]): Unit = {

    // 作为值的函数
//    import scala.math._
//    val num = 3.14
//    val fun = ceil _ // _ 意味着你确实指提这个函数,需不是忘了给参数
//
//    println(fun(num)) //直接调用
//    Array(3.14,1.42,2.0).map(fun).foreach(x=>print(x+" ")) //传递函数

   // 匿名函数
    //(x: Double)=> 3* x
     // val triple = (x:Double) => 3* x
      def triple(x:Double) = 3* x

      Array(3.14,1.42,2.0).map((x:Double)=> 3* x)


  }

}
