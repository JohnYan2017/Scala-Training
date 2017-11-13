package quickstudy
/**
  * Created by OP035308 on 2017/10/19.
  */
object Hight_Oder_Function {

  def main(args: Array[String]): Unit = {

    // 作为值的函数
//    import scala.math._
//    val num = 3.14
//    val fun = ceil _ // _ 意味着你确实指提这个函数,而不是忘了给参数
//
//    println(fun(num)) //直接调用
//    Array(3.14,1.42,2.0).map(fun).foreach(x=>print(x+" ")) //传递函数

   // 匿名函数
    //(x: Double)=> 3* x
     // val triple = (x:Double) => 3* x
//      def triple(x:Double) = 3* x
//
//      Array(3.14,1.42,2.0).map((x:Double)=> 3* x)
//    Array(3.14,1.42,2.0) map {(x:Double)=>3*x}

   //带函数参数的函数
// def valueAtOneQuarter(f:(Double)=>Double)=f(0.25)
//    import scala.math.{sqrt,ceil}
//    valueAtOneQuarter(ceil)
//    valueAtOneQuarter(sqrt _)

    // 参数(类型)推断
//    valueAtOneQuarter((x:Double)=>3*x)
//    valueAtOneQuarter((x)=>3*x)
//    valueAtOneQuarter(x=>3*x)
//    valueAtOneQuarter(3 * _) //终极版本,将某值乘3的函数
    /*
    val fun = 3* _ ?
    val fun = 3* {_: Double}
    val fun:(Double)=>Double = 3* _
     */

    // 一些有用的高阶函数
//    (1 to 9).map("*"*_).foreach(println _) //打印一个三角形
//    (1 to 9).filter(_%2==0)
//    (1 to 9).reduceLeft(_*_)
//    "Mary has a little lamb".split(" ").sortWith(_.length<_.length)

    //闭包
//    def mulBy(factor:Double)=(x:Double)=>factor * x
//    val triple = mulBy(3)
//    val half = mulBy(0.5)
//    println(triple(14)+" "+ half(14))
    /* factor 从运行时的栈上被弹出
    每个返回的函数都有自已的factor设置.
    闭包由代码和代码用到的任何,这此函数实际上是以类的对象方式实现, 该类有一个实例变量factor和一个
    包含函数体的apply方法
     */

    //柯里化
//    def mul(x:Int, y:Int)=x*y
//    def mulOneAtATime(x:Int)=(y:Int)=>x*y
//    mulOneAtATime(6)(7)
//
//    def mulOneAtATime(x:Int)(y:Int)=x*y
//

//    val a = Array("Hello","World")
//    val b = Array("hello","world")
//    a.corresponds(b)(_.equalsIgnoreCase(_)) //CTL + B

    //控制抽象


  }

}
