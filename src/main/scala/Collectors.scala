/**
  * Created by OP035308 on 2017/10/27.
  集合操作,
  所有集合都扩展自Iterable特质
  序列,集,映射
  head and tail
  +,+:,:+,++,-,--
  所有集合都有一个带有Apply方法的伴生对象
  */
object Collectors {

  def main(args: Array[String]): Unit = {
//    Iterable(1,2,3)
//    Set(1,2,3,4,5)
//    Map(1->"a",2->"b")

    //可变和不可这集合

    //列表
//    val digits = List(4,2)
//    //digits.head is 4, digital.tail is List(2), 再进一步, digits.tail.tail is Nil
//    9::List(4,2)
//    9::4::2::Nil
//
//    def sum(lst : List[Int]):Int =
//      if (lst == Nil) 0 else lst.head + sum(lst.tail)
//    //你也可以用模式匹配
//    def sum1(lst:List[Int]): Int = lst match{
//      case Nil =>0
//      case h::t => h + sum1(t)
//    }
//
//  List(9,4,2).sum //实际上scala类中已有sum方法了


    // 可变列表, 注意你不是给head 和 tail赋值, 这里cur用起来象是迭代器,实际它的类型是LinkedList
//    val lst = scala.collection.mutable.LinkedList(1,-2,7,-9)
//    var cur = lst
//    while(cur !=Nil){
//      if ( cur.elem <0) cur.elem =0
//      cur = cur.next
//    }

    //集,集不保留元素插入顺序,以哈希集实现
//    Set(2,0,1)+1
//    for(set <- Set(1,2,3,4,5,6)){
//      println(set)
//    }
//
//    val weekdays = scala.collection.mutable.LinkedHashSet("Mo","Tu","We","Th","Fr")


    // 联合(union) ++, 差异(diff) --
//    val primes = Set(2,3,5,7)
//    val digitals = Set(1,7,2,9)
//    println(primes ++ digitals)
//    println(digitals & primes)
//    println(digitals--primes)

    //+:, ++ 集合相加, --移除多个元素
//    Vector(1,2,3) :+ 5
//    1+: Vector(1,2,3)
//    Set(1,2,3)-2


    // Iterable 特质
    //查看PPT和Study的sample


    //
   //println( "-3+4".collect{case '+' =>1; case '-' => -1})

  }

}
