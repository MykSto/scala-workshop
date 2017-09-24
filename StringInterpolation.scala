//StringInterpolation.scala
import com.atomicscala.AtomicTest._

// GardenGnome.scala

class GardenGnome(val height:Double, val weight:Double, val happy:Boolean) {
 //println("Inside primary constructor")
 var painted = true
 	def magic(level:Int):String = {
 		s"Poof! $level"
 	} 
 	def this(height:Double) {
 		this(height, 100.0, true)
 	}
 	def this(name:String) = {
 		this(15.0)
 		painted is true
 	}
	def show() = {
		//s"$height $weight $happy $painted"
		s"height: $height weight: $weight $happy $painted"
	}
	// def show(level: Int):String = {
	// 	//s"${magic(level)} $happy $painted"

	// }
}


/* EXERCISE 1 */
//delete " " in show() when s""
// val gnome = new GardenGnome(20.0, 110.0, false)
// gnome.show() is "20.0 110.0 false true"
// val bob = new GardenGnome("Bob")
// bob.show() is "15.0 100.0 true true"

/* EXERCISE 2 */

// val gnome =
// new GardenGnome(20.0, 50.0, false)
// gnome.show(87) is "Poof! 87 false true"
// val bob = new GardenGnome("Bob")
// bob.show(25) is "Poof! 25 true true"

/* EXERCISE 3 */

val gnome = new GardenGnome(20.0, 110.0, false)
gnome.show() is "height: 20.0 " +
"weight: 110.0 false true"
val bob = new GardenGnome("Bob")
bob.show() is
"height: 15.0 weight: 100.0 true true"
