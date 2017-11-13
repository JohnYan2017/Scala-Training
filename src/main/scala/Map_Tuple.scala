package quickstudy
import java.io.File
import java.util
import java.util.Scanner

import scala.collection.immutable.SortedMap

/**
  * Created by OP035308 on 2017/9/8.
  * 关于映射与元组的使用
  */
object Map_Tuple {
  def main(args: Array[String]): Unit = {
     val filePath ="D:\\Project\\IdeaProjects\\Training\\src\\main\\scala\\"
//    val scores =Map("Alice"->10,"Bob"->3,"Cindy"->8)
//    不可这的MAP,如果需要改变
//    val scores = scala.collection.mutable.Map("Alice"->10,"Bob"->3,"Cindy"->8)
//    这样的映射也可以
//    val scores =Map(("Alice",10),("Bob",3),("Cindy",8))
//
//    val bobsScore =scores("Bob")
//    val bobsScore = if(scores.contains("Bob")) scores("Bob") else 0
//    快捷写法
//    val bobsScore = scores.getOrElse("Bob",0)
//    print(bobsScore)

//4.3 更新映射的值
//    scores("Bob")=10
//    scores("Fred")=7
//    scores+=("Bob"->10,"Fred"->7)
//    scores-="Alice"
//    val newScores = scores+("Bob"->10,"Fred"->7)
    //scores =scores +("Bob"->10,"Fred"->7)
    //scores = scores -"Alice"

//4.4 迭代映射
    //for((k,v)<- scores) println("Key is "+k +" Value is "+v)
//     println(scores.keySet)
//    println(scores.values)
//    for(v<-scores.values) println(v)
//    for((k,v)<-scores) yield(v,k)

//4.5 已排序映射
//    val scoress = scala.collection.immutable.SortedMap("Alice"->10,"Fred"->7,"Bob"->
//    3,"Cindy"->8)
//    val months = scala.collection.mutable.LinkedHashMap("Jan"->1,"Feb"->2,"Mar"->3)
//    println(scoress)
//    println(months)
//4.6 与Java的互操作
    import scala.collection.JavaConversions.mapAsScalaMap
 //   val scores:scala.collection.mutable.Map[String,Int]=
 //     new java.util.TreeMap[String,Int]

//    import scala.collection.JavaConversions.mapAsJavaMap
//    import java.awt.font.TextAttribute._  //临时用
//    val attrs = Map(FAMILY->"Serif",SIZE->12)
//    val font = new java.awt.Font(attrs)

// 4.7 元组(tuple)
    val t = (1,3.14,"Fred")
    val second = t._2  //注意元组是从1开始,数组或字符串从0开始
    val second2 = t _2
    val (first,scond3,third)=t
    val (first1,second4,_)=t
   print( "New York".partition(_.isUpper)) //输出对偶("NY","ew ork")

//4.8 拉链操作
//    val symbols =Array("<","-",">")
//    val counts=Array(2,10,2)
//    val pairs=symbols.zip(counts)
//    println(pairs)
//    for ((s,n)<-pairs) Console.print(s*n)
//    val mapPairs = pairs.toMap
    //keys.zip(values).toMap 可以使用拉链操作将K,V组合成一个映射

// Practice
    //1
//    val myMap=Map("bd"->10.0,"zj"->98.0,"yc"->26.0)
//    var newMyMap = myMap
//    for((k,v)<-myMap) newMyMap+=(k ->v*0.9)
//    println(newMyMap)
   //2
//    val in= new Scanner(new File(filePath+"myfile.txt"))
    //var myWord:Map[String,Int] = Map()
    //4 按排序的方式
//    var myWord:scala.collection.immutable.SortedMap[String,Int]=SortedMap()
//    5使用TreeMap
//    var myWord:scala.collection.mutable.Map[String,Int]=new util.TreeMap[String,Int]
//    var word:String=""
//    var value:Int = 0
//    while (in.hasNext()){
//      word =in.next()
//      value = myWord.getOrElse(word,0)
//      myWord+=(word->(value+1))
//    }
//    println(myWord)
   //3

//   6
//    import scala.collection.mutable.LinkedHashMap
//    import java.util.Calendar._
//    val myDay=LinkedHashMap(MONDAY->"Monday",THURSDAY->"Thursday")
//
//   8
//      def minmax(values:Array[Int]) ={
//      (values.max,values.min)
//    }
//    println(minmax(Array(1,3,4,5,2)))
//   9
//    def Iteqgt(values:Array[Int],v:Int) ={
//  (values.count(_ > v),values.count(_==v),values.count(_<v))
//     }
//    println(Iteqgt(Array(1,2,3,4,5,3,6),3))

//    10
//    println("Hello".zip("World"))



  }

}
