package quickstudy
/**
  * Created by OP035308 on 2017/9/8.
  */
class ExPart extends Part8{
  def this(iName:String){
    this()
    name=iName
  }
  override def toString = super.toString+"hhhhhh"
}


class Part8 {
 private var pName:String =""
  def name =pName
  def name_=(iName:String){pName=iName}
  def this(iName:String){this();pName=iName}
  override def toString = getClass.getName+"[name="+name+"]"
}

object Part8 {
  def apply(name: String)={
   val abc = new Part8()
    abc.pName=name
    abc
  }
}

object test{
  def main(args: Array[String]): Unit = {
    //var abc = Part8("abc")
    var abc = new ExPart("abc")  //用不了Apply的方法
    println(abc.toString)
  }
}