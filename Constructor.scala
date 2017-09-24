//Constructor.scala
import com.atomicscala.AtomicTest._

class Coffee(val shots:Int = 2,
             val decaf:Int = 0,
             val milk:Boolean = false,
             val toGo:Boolean = false,
             val syrup:String = "") {
  var result = ""
  println(shots, decaf, milk, toGo, syrup)
  def getCup():Unit = {
    if(toGo){
      result += "ToGoCup "
    }
    else{
      result += "HereCup "
    }
  }
  def pourShots():Unit = {
    for(s <- 0 until shots)
      if(decaf > 0){
        result += "decaf shot "
      }else{
        result += "shot "
    }
  }
  def addMilk():Unit = {
    if(milk){
      result += "milk "
    }
  }
  def addSyrup():Unit = {
    result += syrup
  }
  def caf():Int = {
    shots - decaf
  }
  getCup()
  pourShots()
  addMilk()
  addSyrup()
}

// val usual = new Coffee
// usual.result is "HereCup shot shot "
// val mocha = new Coffee(decaf = true,
//   toGo = true, syrup = "Chocolate")
// mocha.result is
// "ToGoCup decaf shot decaf shot Chocolate"

val doubleHalfCaf = new Coffee(shots=2, decaf=1)
val tripleHalfCaf = new Coffee(shots=3, decaf=2)
doubleHalfCaf.decaf is 1
doubleHalfCaf.caf is 1
doubleHalfCaf.shots is 2
tripleHalfCaf.decaf is 2
tripleHalfCaf.caf is 1
tripleHalfCaf.shots is 3

class Tea2(val milk: Boolean = false,
		  val sugar: Boolean = false,
		  val decafe: Boolean = false,
		  val name: String = "Earl Grey",
		  val calMilk: Int = 100,
		  val calSug: Int = 16) {
	var res = ""
	
	def calories(): Int = {
		var total = 0
		if(sugar && milk ) return calMilk + calSug
    	if(milk) return calMilk
    	if(sugar) return calSug
    	total
	}
	def describe():String = {
		if(sugar && milk){
			name + " + milk + sugar"
		} else if (decafe) { 
			name + " decaf"
		} else if (sugar){
			name + " + sugar"
		} else if (milk){
			name + " + milk"
		} else {
			name
		}
	}
	describe()
	calories()
}
/* EXERCISE2 */

// val tea = new Tea
// tea.describe is "Earl Grey"
// tea.calories is 0
// val lemonZinger = new Tea(
//  decafe = true, name="Lemon Zinger")
// lemonZinger.describe is
// "Lemon Zinger decaf"
// lemonZinger.calories is 0
// val sweetGreen = new Tea(
//  name="Jasmine Green", sugar=true)
// sweetGreen.describe is
//  "Jasmine Green + sugar"
// sweetGreen.calories is 16
// val teaLatte = new Tea(
//  sugar=true, milk=true)
// teaLatte.describe is
//  "Earl Grey + milk + sugar"
//  teaLatte.calories is 116

/* EXERCISE 3 */

val tea = new Tea2
tea.describe is "Earl Grey"
tea.calories is 0
tea.name is "Earl Grey"

val lemonZinger = new Tea2(decafe = true,
 name="Lemon Zinger")
lemonZinger.describe is
 "Lemon Zinger decafe"
lemonZinger.calories is 0
lemonZinger.decafe is true

val sweetGreen = new Tea2(
 name="Jasmine Green", sugar=true)
sweetGreen.describe is
 "Jasmine Green + sugar"
sweetGreen.calories is 16
sweetGreen.sugar is true

val teaLatte = new Tea2(sugar=true,
 milk=true)
teaLatte.describe is
 "Earl Grey + milk + sugar"
teaLatte.calories is 116
teaLatte.milk is true