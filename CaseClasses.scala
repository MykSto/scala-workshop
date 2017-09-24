//CaseClasses.scala
import com.atomicscala.AtomicTest._
/* EXERCISE 1 */
case class Person(val first:String, val last:String, val email:String) {
	
}
val p = Person("Jane", "Smile",
"jane@smile.com")
p.first is "Jane"
p.last is "Smile"
p.email is "jane@smile.com"

/* EXERCISE 2 */

val people = Vector(
Person("Jane","Smile","jane@smile.com"),
Person("Ron","House","ron@house.com"),
Person("Sally","Dove","sally@dove.com"))
people(0) is
"Person(Jane,Smile,jane@smile.com)"
people(1) is
"Person(Ron,House,ron@house.com)"
people(2) is
"Person(Sally,Dove,sally@dove.com)"

/* EXERCISE 3 */
case class Dog(val name: String, val breed:String){
	
}
val dogs = Vector(Dog("Fido", "Golden Lab"),
                  Dog("Ruff", "Alaskan Malamute"),
                  Dog("Fifi", "Miniature Poodle"))
dogs(0) is "Dog(Fido,Golden Lab)"
dogs(1) is "Dog(Ruff,Alaskan Malamute)"
dogs(2) is "Dog(Fifi,Miniature Poodle)"

/* EXERCISE 4 */

case class Dimensions(val height:Int, var width:Int) {
	
}
val c = new Dimensions(5,7)
c.height is 5
//c.height = 10 // i mean what the, answer: comment //
//c.height is 10
c.width = 19
c.width is 19

/* EXERCISE 6 */

class SimpleTime ( val hours: Int = 0, val minutes:Int = 0 /* using this auxiliary = 0*/) { 
	def this(hours:Int) = {
    this(hours, 0)
  	}
	def subtract(time:SimpleTime):SimpleTime = {
    val h = hours - time.hours
    val m = minutes - time.minutes
    if(h < 0) {
      new SimpleTime(0, 0)
    } else if(m >= 0) {
      new SimpleTime(h, m)
    } else {
      new SimpleTime(h - 1, m + 60)
    }
  }
}

val anotherT1 =
new SimpleTime(10, 30)
val anotherT2 = new SimpleTime(9)
val anotherST =
anotherT1.subtract(anotherT2)
anotherST.hours is 1
anotherST.minutes is 30
val anotherST2 =
 new SimpleTime(10).subtract(
 new SimpleTime(9, 45))
anotherST2.hours is 0
anotherST2.minutes is 15