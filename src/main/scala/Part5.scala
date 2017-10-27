package quickstudy
/**
  * Created by OP035308 on 2017/9/8.
  */
object Part5 {
  def main(args: Array[String]): Unit = {
//    var myCounter = new Counter
//    myCounter.increment()
//    println(myCounter.current)

//    val fred = new Person
//    fred.age=30
//    fred.age=20
//    println(fred.age)

//    val p1 = new Person2
//    val p2 = new Person2("Fred")
//    val p3 = new Person2("Fred",42)

    //val time1 = new Time(12,11)
    //println(time1.before(new Time(13,10)))
  }
}

class Counter{
  private var value=0
  def increment(){value+=1}
  //def current()=value
  def current = value
  def isLess(other:Counter)=value<other.value

}

class Person{
  private var privateAge =0
  //Setter and gettter
  def age=privateAge
  def age_=(newValue:Int){
    if(newValue>privateAge) privateAge=newValue;
  }
}

class Person2{
  private var name=""
  private var age =0

  def this(name:String){
    this()
    this.name=name
  }
  def this(name:String,age:Int){
    this(name)
    this.age=age
  }
}

//2
class BankAccount{
  val balance:Int=0
  def deposit = {}
  def withdraw ={}
}
//3
class Time(val hrs:Int,val min:Int){
  val hours:Int=hrs
  val minutes:Int =min
  def before(other:Time):Boolean={
    if (hours>other.hours) false
    else if(hours==other.hours && minutes>other.minutes) false
    else true
  }
}