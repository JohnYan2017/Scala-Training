

object Hello{

	class Tiger(val name:String, val age:Int)
	class Animal(val name:String, val age:Int)

	implicit def AnimalToTiger(obj:Object):Tiger={
		if (obj.getClass==classOf[Animal]){
			val animal = obj.asInstanceOf[Animal]
			new Tiger(animal.name,animal.age)
		}
		else {
			null
		}
	}
	def TigerKilled(tiger: Tiger): Unit ={
		println(s"the tiger: ${tiger.name}%s is killed, age is ${tiger.age}%d")
		println(f"the tiger: ${tiger.name}%s is killed, age is ${tiger.age}%d")
	}

	def main(args: Array[String]): Unit = {
		TigerKilled(new Animal("Gaga",12))
	}
}