//ParameterizedTypes.scala
// ParameterizedReturnTypes.scala
import com.atomicscala.AtomicTest._

// Return type is inferred:
def inferred(c1:Char, c2:Char, c3:Char)={
 	Vector(c1, c2, c3)
   	}
	// Explicit return type:
def explicit(c1:Double, c2:Double, c3:Double):
	Vector[Double] = { 
			Vector(c1, c2, c3)
 	}
 	def explicitList(c4:Vector[Double]):List[Double] = {
 		c4.toList //cool func
 	}
 	def explicitSet(arg: Vector[Double]):Set[Double] = {
 		arg.toSet
 	}
 	


/* EXERCISE 1 */

explicit(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)

/* EXERSICE 2 */
explicitList(Vector(10.0, 20.0)) is
List(10.0, 20.0)
explicitList(Vector(1, 2, 3)) is
List(1.0, 2.0, 3.0)

/* EXERCISE 3 */
explicitSet(Vector(10.0, 20.0, 10.0)) is
Set(10.0, 20.0)
explicitSet(Vector(1, 2, 3, 2, 3, 4)) is
Set(1.0, 2.0, 3.0, 4.0)

/* EXERCISE 4 */

def historicalData(temp: Vector[Int]): String = {
	var sunny = 0
	var mostlySunny = 0
	var mostlyCloudy = 0

	for( a <- temp) {
	a match {
	  case 100 => sunny += 1
      case 80 => mostlySunny += 1
      case 20 => mostlyCloudy += 1 
	}
}
	return ("Sunny=" + sunny + ", Mostly Sunny=" + mostlySunny + ", Mostly Cloudy=" + mostlyCloudy)
}

val weather = Vector(100, 80, 20, 100, 20)
historicalData(weather) is
"Sunny=2, Mostly Sunny=1, Mostly Cloudy=2"