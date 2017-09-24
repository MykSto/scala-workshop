//AuxiliaryConstructors.scala
import com.atomicscala.AtomicTest._
class ClothesWasher(val model:String, val capacity:Double) {
	def this(model: String) = {
		this(model, 2)
	}
	def this(capacity: Double) = {
		this("Unknown", capacity)
	}
	def this() = {
		this("No model", 5)
	}
	def wash(bleach: Int, fabric: Int):String = {
		"Wash used " + bleach + " bleach and " + fabric + " fabric softener"
	}
	def wash() = {
		"Simple wash"
	}
}

class ClothesWasher2(val model:String, val capacity:Double) {
	
}

// val washer1 = new ClothesWasher
// washer1.capacity is 5D
// washer1.model is "No model"

// val washer2 = new ClothesWasher("AllInOne")
// washer2.capacity is 2D
// washer2.model is "AllInOne"

// val washer3 = new ClothesWasher(3.6)
// washer3.capacity is 3.6
// washer3.model is "Unknown"

/*EXERCISE 2 */

// val washer4 = new ClothesWasher2 (capacity=5D, model="No model")
// washer4.capacity is 5D
// washer4.model is "No model"

// val washer5 = new ClothesWasher2(capacity=2d, model="AllInOne")
// washer5.capacity is 2D
// washer5.model is "AllInOne"

// val washer6 = new ClothesWasher2(capacity=3.6, model="Unknown")
// washer6.capacity is 3.6
// washer6.model is "Unknown"

/* EXERCISE3 */
val washer = new ClothesWasher("LG 100", 3.6)
washer.wash(2, 1) is
"Wash used 2 bleach and 1 fabric softener"
washer.wash() is "Simple wash"
