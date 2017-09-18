//Summary-2.scala

import com.atomicscala.AtomicTest._
/* 1) */
val char = Vector("C", "B", "A", "D")
val int = Vector(1, 2, 3, 4)
val string = Vector("ala", "hala", "aka", "shlimp")

println("Min: " + char.sorted.min)
println("Max: " + char.sorted.max)
println("Min: " + int.sorted.min)
println("Max: " + int.sorted.max)
println("Min: " + string.sorted.min)
println("Max: " + string.sorted.max)
var output = ""
for( ch <- char.sorted) {
	output += ch + " "
}
var output1 = ""
for( ch <- int.sorted) {
	output1 += ch + " "
}
var output2 = ""
for( ch <- string.sorted) {
	output2 += ch + " "
}
println(output + "\n" + output1 + "\n" + output2)

/* EXERCISE 2 */
val allInOne = Vector(char, int, string)
var inString = ""
for( all <- allInOne) {
	for( inOne <- all) {
	inString += inOne + " "
     }
}
println(inString)

/* EXERCISE 3 */
val different = Vector(1, 2, 3, "A", "B", "C", "mew", "gaw", "dank", 1.6, 1.8, 0.9)
//println(different.max) // different contain 'any' different no implicit ordering


/*
/*EXERCISE 4 */
package calculusTest.result
class Calculus {
	def cube(x:Int):Int = { x * x * x }
	def bang(s:String):String = { s + "!" }
}
*/

/* EXERCISE 6 */
class Temperature {
  var current = 0.0
  var scale = "f"
  def setFahrenheit(now:Double):Unit = {
    current = now
    scale = "f"
  }
  def setCelsius(now:Double):Unit = {
    current = now
    scale = "c"
  }
  def getFahrenheit():Double = {
    if(scale == "f")
      current
    else
      current * 9.0/5.0 + 32.0
  }
  def getCelsius():Double = {
    if(scale == "c")
      current
    else
      (current - 32.0) * 5.0/9.0
  }
  def setKelvin(now: Double): Unit = {
  	scale = "k"
  	current = now
  }
  def getKelvin(): Double = {
  	if(scale == "k"){
  	 	current
  	 } else {
  		current + 273.15
  	}
  }
}

val temp = new Temperature
temp.setFahrenheit(98.6)
temp.getFahrenheit() is 98.6
temp.getCelsius is 37.0
temp.setCelsius(100.0)
temp.getFahrenheit is 212.0
temp.getKelvin is 373.15

/* EXERCISE 7 and 8 = TicTacToe*/

