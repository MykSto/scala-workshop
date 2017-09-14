//Fields.scala
import com.atomicscala.AtomicTest._

class Cup2 {
	var _percentFull = 0
	val max = 100
	val min = 0
	/*def add(increase: Int): Int = {
		percentFull += increase
		if(percentFull > max){
			percentFull = max
		} else if(percentFull <= min){
			percentFull = min
		}
		percentFull
	}*/
	def set(value: Int): Unit = _percentFull = value
	def get = _percentFull
	
}

val cup = new Cup2
// val c = cup.add(50)
// println(c)

// cup.add(50) is 50
// cup.add(70) is 100

// cup.add(45) is 45
// cup.add(-15) is 30
// cup.add(-50) is -20

// cup.add(45) is 45
// cup.add(-55) is 0
// cup.add(10) is 10
// cup.add(-9) is 1
// cup.add(-2) is 0

/*
cup.percentFull = 56 // Only one can be set outside the class
cup.percentFull is 99
*/

/* Getters and Setters */
cup.set(56)
cup.get is 56