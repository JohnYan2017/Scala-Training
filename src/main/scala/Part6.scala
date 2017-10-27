package quickstudy
/**
  * Created by OP035308 on 2017/9/8.
  */
object Part6 {
  def main(args: Array[String]): Unit = {
  val c1=myClass("Hi") //调用的object的Apply方法
    println(c1.myName) //getter方法
    c1.myName="newHi" //调用setter方法
    println(c1.myName)
  }
}

class myClass(name:String){
  var className = name
  def myName = className
  def myName_=(newValue:String){className=newValue}//setter的方法
}
//伴生对象
object myClass{
  def apply(name:String)={
    new myClass(name)
  }
}