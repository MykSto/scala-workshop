//Testing.scala
import com.atomicscala.AtomicTest._

val value1 = 20
val value2 = 10
value1 is value2

val value3 = 10
val value4 = 10
value3 is value4

val value5 = "10"
value2 is value5 //value5 is value2 [error], order matters!!!


def squareArea(x:Int): Int = {
  x * x
}

def rectangleArea(x:Int, y:Int): Int = { 
  x * x 
}

def trapezoidArea(x:Int, y:Int, h:Int): Double = {
  h/2 * (x + y)
}

squareArea(1) is 1
squareArea(2) is 4
squareArea(5) is 25
rectangleArea(2, 2) is 4
rectangleArea(5, 4) is 20
trapezoidArea(2, 2, 4) is 8
trapezoidArea(3, 4, 1) is 3.5