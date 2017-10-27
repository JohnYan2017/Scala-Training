package quickstudy
/**
  * Created by OP035308 on 2017/10/19.
  */
object Part11 {
  def main(args: Array[String]): Unit = {

    //更多的标识符
//     val √ = scala.math.sqrt _
//     val `val` = 42
//     println(√(2))

    //中置操作符
    /*
    1 to 10
    1.to 10
    1 -> 10
    1.->10
    class Fraction(n: Int, d: Int){
    def *(other:Fraction) = new Fraction(num*other.num, den*other.den)
    }
     */

    // 一元操作符
    /*
    1 toString
    1.toString()
    -a  转化为名为unary_操作符, 如-a, 和a.unary_- 一样
     */

    //赋值操作符
    // a+=b 等同于a = a+b

    /*
    结合性, Scala中所有操作符都是左结合, 除了 以冒号:结尾的, 和赋值操作符
    如 1 :: 2 :: Nil  的意思是 1 :: (2::Nil)
    右结合的二无操作符是其第二个参数的方法, 如:
    2::Nil 的意思是 Nil.::(2)
     */

    /*
    apply 和 update方法
    val scores = new scala.collection.mutable.HashMap(String, Int)
    scores("Bob") =100 //调用scores.update("Bob",100)
    val bobScore = scores("Bob") //调用scores.apply("Bob")

    apply 方法经常用在伴生对象中,
    class Fraction(n: Int, d: Int){}
    object Fraction{
       def apply(n: Int, d:Int) = new Fraction(n,d)
       }
     val result = Fraction(3,4) * Fraction(2,5)
     */

    /*
    unapply 方法
    val author = "John"
    val Name(first, last) = author //调用 Name.unapply(author)
    object Name {
       def unapply(input: String) = {
       val pos = input.indexOf(" ")
       if(pos == -1) None
       else Some(input.substring(0,pos), input.substring(pos+1)))
       }
      }

      upapplySeq 方法

      object Name {
          def unapplySeq(input:String): Option[Seq[String]] =
             if (input.trim == "") None else Some(input.trim.split("\\s+"))
             }
        author match{
           case Nme(first, last) => ...
           case Name(first, middle, last) =>...
           case Name(first, "van", "der", last) => ...
           ...
           }

     */



  }
}
