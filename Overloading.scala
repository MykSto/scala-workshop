//Overloading.scala
// Overloading.scala
import com.atomicscala.AtomicTest._

/*class Overloading1 {
def f(n:Int):Int = { 88 }
def f(n:Int):Int = { n + 2 }
}

class Overloading2 {
 def f(n:Int):Int = { 99 }
 def f(n:Int):Int = { n + 3 }
 }

val mo1 = new Overloading1
val mo2 = new Overloading2
mo1.f() is 88
mo1.f(11) is 13
mo2.f() is 99
mo2.f(11) is 14*/
//method is defined twice when argument list is the same in both identical methods. 
class Overloading{
	def add():Int = { 0 }
	def add(q: Int):Int = { q }
	def add(g: Int, l: Int):Int = { g + l }
	def add(c: Int, x: Int, z: Int):Int = { c + x + z }
	def add(a: Int, b: Int, c: Int, d: Int):Int = { a + b + c + d }
}

val f = new Overloading

f.add() is 0
f.add(q=1) is 1 //explicit return type works as well as inferenced
f.add(1, 2) is 3
f.add(1, 2, 3) is 6
f.add(1, 2, 3, 4) is 10

