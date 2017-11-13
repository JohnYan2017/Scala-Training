package Projects

/**
  * Created by OP035308 on 2017/11/5.
  * 找出朋友的朋友,并进行优先及推荐
  * 用到IO, 循环遍历,高阶函数, 集合操作
  */

import scala.io.Source

object Friends {
  def main(args: Array[String]): Unit = {
    // 读取源数据文件
    val source = Source.fromFile("D:\\Project\\IdeaProjects\\Training\\src\\main\\scala\\Projects\\friend.txt")
    val lines = source.getLines()
    // 数据处理
    val lines_step1 = lines.map(x => fun_Map(x)).flatMap(_.split(',')).map((_, 1)).filter(_._1 != "")
    //    lines_step1.foreach(println)
    val lines_step2 = lines_step1.toList.groupBy(_._1)
    //    lines_step2.foreach(println)
    val lines_step3 = lines_step2.map(x => (x._1, x._2.length))
    //    lines_step3.foreach(println)
    //    val lines_step4 = lines_step3.toList.sortBy(_._2)
    val lines_step4 = lines_step3.toList.sortWith((a, b) => (a._2 > b._2))
    //    lines_step4.foreach(println)
    val lines_step5 = lines_step4.map(x => {
      val temp = x._1.split(" ");
      (temp(0), temp(1) + '*' + x._2)
    })
    //    lines_step5.foreach(println)
    val lines_step6 = lines_step5.groupBy(_._1)
    //        lines_step6.foreach(println)
    val lines_step7 = lines_step6.map { x => (x._1, fun_Map_Seperate(x._2)) }
    lines_step7.foreach(println)

    println(lines_step1.getClass().getName)
    println(lines_step2.getClass().getName)
    println(lines_step3.getClass().getName)
    println(lines_step4.getClass().getName)
    //想想如何把总数也计算出来?
    //val lines_step8 = lines_step6.map(x=>{val temp =fun_Map_Seperate_Count(x._2);(x._1,temp._1,temp._2)}).toList.sortWith((a,b)=>a._3>b._3)
    //    lines_step8.foreach(println)
  }


  def fun_Map(line: String): String = {
    val line_Sp = line.split(' ')
    // val line_Sq_Tails = line_Sp.tails
    var result_line = ""
    for (i <- 1 until (line_Sp.length)) {
      for (j <- i + 1 until (line_Sp.length))
        result_line += (line_Sp(i) + " " + line_Sp(j) + "," + line_Sp(j) + " " + line_Sp(i) + ",")
    }
    result_line
  }

  def fun_Map_Seperate(list_Tag: List[(String, String)]): String = {
    var result_String = ""
    for (item <- list_Tag) {
      result_String += "," + item._2
    }
    result_String.tail
  }

  def fun_Map_Seperate_Count(list_Tag: List[(String, String)]): (String, Int) = {
    var result_String = ""
    for (item <- list_Tag) {
      result_String += "," + item._2
    }
    // 用*分隔会有问题,（1）split表达式，其实就是一个正则表达式。*  ^ |
    // 等符号在正则表达式中属于一种有特殊含义的字符，如果使用此种字符作为分隔符，必须使用转义符即\\加以转义。
    (result_String.tail, result_String.tail.split(",").map(x => (((x.split("\\*")) (1)).toInt)).reduce(_ + _))
  }
}