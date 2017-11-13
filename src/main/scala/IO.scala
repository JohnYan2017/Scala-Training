package quickstudy
/**
  * Created by OP035308 on 2017/9/15.
  */
import java.io.FileInputStream
import scala.io.Source

object IO {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("D:\\Project\\IdeaProjects\\Training\\src\\main\\scala\\myfile.txt","UTF-8")
//    val lineIterator = source.getLines()
//    for (l<- lineIterator) println(l)
//    val lines = source.getLines().toArray
//    for (l<- lines) println(l)
//    val contents = source.mkString
//    println(contents)

    // Source 就是Iterator[Char]
//    for(c<-source) println(c)
//    val iter = source.buffered
//    while (iter.hasNext) {
//      if(iter.head!=' ' && iter.head!='\n') println(iter.head)
//      iter.next()
//
//    }
//    val tokens = source.mkString.split("\\S+")
//    val numbers = for(w<- tokens) yield w.toDouble
//    //val numbers = tokens.map(_.toDouble)

//    print("How old are you? ")
//    val age =readInt()
//    source.close()


    // Read From URL and others
//    val source1 = Source.fromURL("http://www.baidu.com","UTF-8")
//    val source2 = Source.fromString("Hello, World!")
//    val source3 = Source.stdin
//    val line1s = source1.getLines()
//    line1s.foreach(println)

//    //Read Byte files
//    val file = new File(filename)
//    val in = new FileInputStream(file)
//    val bytes = new Array[Byte](file.length.toInt)
//    in.read(bytes)
//    in.close()

    // Write to text file
//    import java.io.PrintWriter
//    val out = new PrintWriter("")

  }
}
