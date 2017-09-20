//NamedDefaultArguments.scala
//named argument increase code readability 
import com.atomicscala.AtomicTest._
class SimpleTime (val minutes:Int = 0, val hours: Int) { 

	}

val t = new SimpleTime(minutes=30, hours=5)
t.hours is 5 //in order to print this value, class paramenter should have indicated (val or var)
t.minutes is 30

val t2 = new SimpleTime(hours=10)
t2.hours is 10
t2.minutes is 0

class Planet (val name:String, val description:String, val moons:Int = 0) {
	def hasMoon():Boolean = {
			if(moons > 0){
				true 
				} else {
					false
				}
		}
}

// val p = new Planet(name = "Mercury",
//  description = "small and hot planet",
//  moons = 0)
// p.hasMoon is false

val earth = new Planet(moons = 1,
 name = "Earth",
 description = "a hospitable planet")
earth.hasMoon is true

class FlexibleFamily(mom:String, dad:String, kids:String*) {
  def flexSize():Int = {
    var capacity1 = 2    // need to have 2 (mom and dad) mom:String - 1, dad:String - 2, kids:String* - 3 (*) means argument list
    for(nn <- kids) {
      capacity1 = capacity1 + 1
    }
    capacity1
  }
}

// val familyYey = new FlexibleFamily(dad="Dad", mom="Mommy")
// familyYey.mom is "Mommmy"
// familyYey.dad is "Dad"

class Item(val name: String, var price:Double) {
	def cost(grocery:Boolean = false, medication: Boolean = false, taxRate: Double = 0.10):Double = {
		if(grocery || medication) {
			price
		} else {
			price + (taxRate * price)
		}
	}
}

val flour = new Item(name="flour", 4)
flour.cost(grocery=true) is 4
val sunscreen = new Item(
 name="sunscreen", 3)
sunscreen.cost() is 3.3
val tv = new Item(name="television", 500)
tv.cost(taxRate = 0.06) is 530