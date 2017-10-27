class Tiger(name:String, age:Int);
class Animal(name:String,age:Int);

implicit def AnimalToTiger(obj:Object):Tiger={
if (obj.getClass==classOf[Animal]){
  val animal = obj.asInstanceOf[Animal];
  new Tiger(animal.name,animal.age);

}
}
