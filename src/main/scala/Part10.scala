package quickstudy
/**
  * Created by OP035308 on 2017/10/19.
  * 特质,不允许多重继承
  * 只能有一个超类,但可以有多个特质
  *
  */
object Part10 {
  def main(args: Array[String]): Unit = {
// 当做接口使用的特质
//    trait Logger{
//  def log(msg:String) //这是一个抽象方法
//}
//    class ConsoleLogger extends Logger {
//      def log(msg:String){println(msg)} //不需要重写
//    }

    //带具体实现的特质
//    trait ConsoleLogger{ def log(msg:String){println(msg)}
//      class Account{var balance = 10}
//      class SavingAccount extends Account with ConsoleLogger{
//        def withdraw(amount: Double): Unit ={
//          if (amount > balance) log("Insufficient funds") else balance -= amount
//        }
//
//      }
//    }



  }


}
