package AKKA


import scala.actors.Actor
/*
Actor之间相互收发消息
 */
case class Message(content:String, sender:Actor)

class YasakaActor extends  Actor{
  def act{
    var flag = true
    while (flag){
      receive{
        case Message(content,sender) => {println("yasaka received: " + content);  
                                              sender ! 100000}
        case response: Int => {flag = false; println("Yasaka is dead");}
      }
    }
  }
}

class GagaActor(val yasakaActor: YasakaActor)extends Actor{
  def act{
    yasakaActor ! Message("Hello, yasaka, I'm gaga. Are you free now?", this)

    var flag = true
    while (flag){
      receive{
        case response:String => println("gaga received: "+ response)
        case response:Int => {flag=false; println("Gaga is dead, try to kill yas"); yasakaActor ! 100}
      }
    }
  }
}

object Message {
  def main(args: Array[String]) {
    val yasakaActor = new YasakaActor
    val gagaActor = new GagaActor(yasakaActor)
    yasakaActor.start()
    gagaActor.start()
  }
}
