package Introduce

/*
Workshop Plan
Here is what we will do:
 1. Learn a bit of Scala syntax and write some simple Scala programs
 2. Learn some important concepts like: closures, higher order functions,purity,lazy
    vs strict evaluation, currying, tail calls/TCO, immutability, persistent data structures,
    type inference etc
 3. Understand the essence of the "Functional Programming" paradigm through Scala

 Some background info
 1. Scala = "Scalable Language" - a language which grows with the demands of its users!
 2. Designed by Prof.Martin Odersky at EPFL
 3. Combines Object Oriented and Functional Programming with a powerful static type system
    and expressive syntax
 4. Complies to Java byte code and runs on the JVM
 5. Upsurge in adoption since 2010 - Twitter / Foursquare /Guardian newspaper/LinkedLn are
    some high profile users


Create a text file say hello.scala with the following line in it:
println("hello, world")
Type "scala hello.scala" at the command prompt to run the code!

The Scala REPL
scala> 2*3
res0: Int = 6
scala> val a = 10
a: Int = 10
scala> val b = a + 1
b: Int = 11
scala> a = a + 1
<console>:8: error: reassignment to val
a = a + 1
^
 */
object basic {

  def main(args: Array[String]): Unit = {
    //  def add(a:Int, b:Int):Int = a+b;
    //    val m:Int = add(1,2);
    //    println(m)

    /*
Function Definition
Note the use of the type declaration "Int".Scala is a "statically typed" language. We define "add" to be
a funtion which accepts two parameters of type Int and returns a value of type Int.
Similarly, "m" is defined as a variable of type Int
 */
    //      def fun(a:Int):Int = {
    //      a +1
    //      a-2
    //      a*3
    //    }
    //        val p:Int = fun(10)
    //        println(p)

    /* Note, There is no explicit "return" statement! The value of the last expression
  in the body is automatically returned
   */

    /* Type Inference

 def add(a:Int, b:Int) = a + b
 val m = add(1, 2)
 println(m)
  As example, We have NOT specified the return type of the function or the type
  of the variable "m". Scala "infers" that!

def add(a, b) = a + b
val m = add(1, 2)
println(m)

This does not work! Scala does NOT infer type of function
parameters, unlike languages like Haskell/ML. Scala is said to do
local, "flow-based" type inference while Haskell/ML do
Hindley-Milner type inference

   */
    // Expression Oriented Programming

    //  val i = 3
    //val p = if (i > 0) -1 else -2
    //val q = if (true) "hello" else "world"
    //println(p)
    //println(q)

    //Unlike languages like C/Java, almost everything in Scala is an
    //"expression", ie, something which returns a value! Rather than
    //programming with "statements", we program with "expressions"

    //      def errorMsg(errorCode: Int) = errorCode match {
    //        case 1 => "File not found"
    //        case 2 => "Permission denied"
    //        case 3 => "Invalid operation"
    //      }
    //      println(errorMsg(2))
    /* Case automatically "returns" the value of the expression corresponding to
the matching pattern
 */

    //Recursion
    //    def sum(n:Int):Int =
    //      if (n==0) 0 else n + sum(n-1)
    //    val m = sum(10)
    //    println(m)

    /* Try calling the function "sum" with a large number(say 100000) as
    parameter! You get a stack overflow!
     */

    //Tail Calls and TCO
    //    def sum(n:Int, acc:Int):Int=
    //      if(n==0) acc else sum(n-1,acc+n)
    //    val r = sum(100000,0)
    //    println(r)
    /* This is a "tail-recursive" version of the previous function - the Scala compiler
    converts the tail call to loop, thereby avoiding stack overflow!
    尾递归就是从最后开始计算，每递归一次就算出相应的结果。而线形递归是直到递归到一个确定的值后，
    又从这个具体值向后计算。所以线形递归肯定费事。
    对于尾递归而言，执行到递归调用的时候，前面的所有临时状态都没有用处了，所以栈空间只需要一份；
    不止是局部变量，参数和返回值也只有一份；所以即使无限递归也不会溢出
(sum 4)
(4 + sum 3)
(4 + (3 + sum 2))
(4 + (3 + (2 + sum 1)))
(4 + (3 + (2 + (1 + sum 0))))
(4 + (3 + (2 + (1 + 0))))
(4 + (3 + (2 + 1)))
(4 + (3 + 3))
(4 + 6)
(10)
------------------------------
(sum 4 0)
(sum 3 4)
(sum 2 7)
(sum 1 9)
(sum 0 10)
(10)
     */

    // Higher order functions

    //        def identity(x: Int) = x
    //        def sqr(x: Int) = x * x
    //        def cube(x: Int) = x * x * x
    //        def sum(f: Int=>Int, a: Int, b: Int): Int =
    //          if (a == b) f(a) else f(a) + sum(f, a + 1, b)
    //        println(sum(identity, 1, 10))
    //        println(sum(sqr, 1, 10))
    //        println(sum(cube, 1, 10))

    /* "sum" is now a "higher order" function! It's first parameter is a function
    which maps an Int to an Int

    The type "Int" represents a simple Interger value. The type Int=>
    Int represents a function which accepts an Int and returns an Int
     */

    //Anonymous functions 匿名函数
    //    def sum(f:Int=>Int,a: Int, b: Int): Int =
    //      if (a==b) f(a) else f(a) + sum(f,a+1,b)
    //    println(sum(x=>x,1,10))
    //    println(sum(x=>x*x,1,10))
    //    println(sum(x=>x*x*x,1,10))

    /* We can create "anonymous" functions on-the-fly! x=> x*x is a
    function which takes an "x" and returns x*x
     */

    // Methods on collections: Map/Filter/Reduce
    //    val a = List(1,2,3,4,5,6,7)
    //    val b = a.map(x=>x*x)
    //    val c = a.filter(x=>x<5)
    //    val d = a.reduce((x,y)=>x+y)
    //    println(b)
    //    println(c)
    //    println(d)

    /* Map applies a function on all elements of a sequence.Filter selects a set of
    values from a sequence based on the boolean value returned by a function passed
    as its parameter - both functions return a new sequnce. Reduce combines the elements
    of a sequence into a single element.
     */

    // More methods on collections
    //    def even(x:Int)=(x%2)==0
    //    val a = List(1,2,3,4,5,6,7)
    //    val b = List(2,4,6,5,10,11,13,12)
    //    println(a.forall(even))
    //    println(a.exists(even))
    //    println(b.takeWhile(even))
    //    println(a.partition(even))

    //Block structure /Scope
    //    def fun(x:Int) ={
    //      val y =1
    //      val r={
    //        val y =2
    //        x+y
    //      }
    //      println(r)
    //      println(x+y)
    //    }
    //    fun(10)

    // The "y" in the inner scope shadows the "y" in the outer scope

    //Nested functions /functions returning functions 嵌套函数
    //fun returns a function of typ Int => Int
    //    def fun():Int => Int = {
    //      def sqr(x:Int):Int = x*x
    //      sqr
    //    }
    //    val f = fun()
    //    println(f(10))

    /* def fun():Int=>Int says "fun is a function which does not take
    any argument and returns a function which maps an Int to an Int
    Note that it possible to have "nested" function definitions
     */

    // Lexical Closure
//        def fun1():Int => Int = {
//          val y =1
//          def add(x:Int)= x+y
//          add
//        }
//        def fun2() ={
//          val y =2
//          val f = fun1()
//          // what does it print? 11 or 12
//          println(f(10))
//        }
//        fun2()

    //Lexical Closure with anonymous functions
    //    def fun1(y:Int):Int=>Int =
    //      x => x+y
    //    def fun2()={
    //      val f = fun1(10)
    //      println(f(2))
    //    }
    //    fun2()

    //Simple closure examples
    //    def sqr(x: Int) = x*x
    //    def cube(x: Int) = x*x*x
    //    def compose(f: Int=>Int, g: Int=>Int): Int=>Int =
    //      x => f(g(x))
    //    val f = compose(sqr, cube)
    //    println(f(2))
    //    val a = List(1,2,3,4)
    //    println(a.map(f))
    //    println(a.map(cube).map(sqr))

    //    def removeLowScores(a: List[Int], threshold: Int): List[Int] =
    //      a.filter(score => score >= threshold)
    //    val a = List(95, 87, 20, 45, 35, 66, 10, 15)
    //    println(removeLowScores(a, 30))

    // Curring 柯里化函数
    /*
    In mathematics and computer science, currying is the technique of
transforming a function that takes multiple arguments (or a tuple
of arguments) in such a way that it can be called as a chain of
functions, each with a single argument. It was originated by Moses
Schonfinkel and later re-discovered by Haskell Curry.
     */
    //    def addA(x: Int, y: Int): Int =
    //    x + y
    //    def addB(x: Int):Int=>Int =
    //      y => x + y
    //    val a = addA(10, 20)
    //    val b = addB(10)(20)
    //    println(a)
    //    println(b)


    //    def addA(x: Int, y: Int, z: Int) = x + y + z
    //    def addB(x: Int): Int => (Int => Int) =
    //      y => (z => x + y + z)
    //    val a = addA(1, 2, 3)
    //    val b = addB(1)(2)(3)
    //    println(a)
    //    println(b)

    //It is now easy to see how the idea can be generalized to N argument functions!

    //Some List operations
    //    val a = List(1,2,3)
    //    val b = Nil
    //    val c = List()
    //    val d = 0::a
    //    val e = 0::b
    //    println(b)
    //    println(c)
    //    println(d)
    //    println(e)

    /*
    Nil and List() are both "empty" lists
    a::b returns a new list with "a" as the first item (the "head")
    and remaining part b (called the "tail")
     */

    // Pattern Matching
    //    def fun(a: List[Int])= a match{
    //      case List(0,p,q)=> p+q
    //      case _ => -1
    //    }
    //    println(fun(List(0,10,20)))
    //    print(fun(List(0,1,2,3)))
    //    println(fun(List(1,10,20)))

    /*
    Pattern matching helps you "pull-apart" complex datastructures
and analyse their components in an elegant way. In the above
case, the function will return the sum of the second and third
elements for any three element List of integers starting with a 0 -
the value -1 is returned for any other list
     */

    //    def fun(a: List[Int]) = a match {
    //      case List(0, p, q) => p + q
    //      case List() => -1
    //    }

    //    def length(a: List[Int]): Int = a match {
    //      case Nil => 0
    //      case h :: t => 1 + length(t)
    //    }
    //
    //    println(length(List()))
    //    println(length(List(10, 20, 30, 40)))

    /*
    A simple recursive routine for computing length of a list. If list is
empty, length is 0, otherwise, it is 1 + length of remaining part of
the list.
If we have a List(1,2,3) and if we match it with a "case h::t", "h"
will be bound to 1 and "t" will be bound to the "tail" of the list,
ie, List(2,3)
     */

    // Building our own data types with case classes
    //    case class Circle(r:Int)
    //    case class Rectangle(h:Int, w:Int)
    //    val a = Circle(10)
    //    println(a.r)
    //    val b = Rectangle(5,7)
    //    println(b.h)

    /* Defining an algebraic data type
    Problem:
    How do we define a function "area" which will compute the area of a
    rectangle as well as circle?

    def area(c: Circle) = 3.14 * c.r * c.r
val a = Circle(10)
println(area(a))
val b = Rectangle(10, 20)
//println(area(b)) -- does not work!

    We need some way to tell the Scala type system that "Circle" and "Rectangle" are related
    We do this using what is called an "abstract class"
    Note how a variable of type "Shape" can now hold either a Circle or a Rectangle
     */
    //    sealed abstract class Shape
    //    case class Circle(r:Int) extends Shape
    //    case class Rectangle(h:Int, w:Int) extends Shape
    //
    ////    val a:Shape = Circle(10)
    ////    val b:Shape = Rectangle(10,20)
    //
    //    def area(a: Shape) = a match {
    //      case Circle(r) => 3.14 * r * r
    //      case Rectangle(h, w) => h * w*0.1
    //    }
    //    println(area(Circle(10)))
    //    println(area(Rectangle(10, 20)))

    // A simple binary tree
    //    sealed abstract class Tree
    //    case class Node(value:Int,
    //                    left: Tree,
    //                    right:Tree) extends Tree
    //    case class Leaf(value:Int) extends Tree
    //    val a = Node(20, Leaf(10),Leaf(30))
    //    val b = Node(40, Leaf(37),Leaf(50))
    //    val c=  Node(35,a,b)
    //    println(c)
    //
    //    def sumTree(t:Tree):Int = t match{
    //      case Leaf(value)=> value
    //      case Node(value,left,right)=> value+
    //        sumTree(left)+
    //        sumTree(right)
    //    }
    //    println(sumTree(Node(10,Leaf(5),Leaf(20))))


    // Immutability 不可变特性, Python lists are "mutable,具体看ppt
    //    val a = List(20, 30, 40, 50)
    //    val b = 10 :: a
    //    println(a) // still List(20, 30, 40, 50)
    //    println(b) // List(10, 20, 30, 40, 50)
    //    val c = a ++ List(60)
    //    println(c) // List(20, 30, 40, 50, 60)
    //    println(a) // still List(20, 30, 40, 50)
    /*
    Good Scala style encourgaes use immutable versions of data structures like Lists.
    Mutable versions are also available though their use is suggested only when
    immutbale version may not be suitable because of reasons like efficiency
    Head and Tail!!
     */

    // Non-strict evaluation
    //    def fun1() = {
    //      println("fun1")
    //      10
    //    }
    //    def fun2() = {
    //      println("fun2")
    //      20
    //    }
    //    def myIf(cond: Boolean, thenPart: Int, elsePart: Int) =
    //      if (cond) thenPart else elsePart
    //    println(myIf((1 < 2), fun1(), fun2()))

    /*
    The behaviour of "if" is "non-strict": In the expression "if
(cond) e1 else e2", if "cond" is true e2 is NOT EVALUATED.
Also, if "cond" is false, e1 is NOT EVALUATED.
By default, the behaviour of function calls in Scala is "strict":
In the expression "fun(e1, e2, ..., en), ALL the expressions e1,
e2 ... en are evaluated before the function is called.
There is a way by which we can make the evaluation of
function parameters non-strict. If we define a functions as
"def fun(e1: => Int)", the expression passed as a
parameter to "fun" is evaluated ONLY when its value is
needed in the body of the function. This is the "call-by-name"
method of parameter passing, which is a "non-strict" strategy.
     */
    //    def fun1() = {
    //      println("fun1")
    //      10
    //    }
    //    def fun2() = {
    //      println("fun2")
    //      20
    //    }
    //    def myIf(cond: Boolean, thenPart: => Int,
    //             elsePart: => Int) =
    //      if (cond) thenPart else elsePart
    //    println(myIf((1 < 2), fun1(), fun2()))


    //    def hello() = {
    //      println("hello")
    //      10
    //   }
    //    def fun(x: => Int) = {
    //      x + x
    //    }
    //    val t = fun(hello())
    //    println(t)
    /*
    How many times is the message "hello" printed? Is there some
way to prevent unnecessary repeated evaluations?
     */

    //    lazy val a = hello()
    //    println(a + a)
    /*
Unlike a "call-by-name" parameter, a lazy val is evaluated only
once and the value is stored! This is called "lazy" or "call by
need" evaluation.
     */
  }
}
