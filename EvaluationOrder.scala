//EvaluationOrder.scala
val sunny = true
val partlyCloudy = false
val temp = 90
val sky = if(sunny && temp > 80){
	println("Sunny with more than 80C")
} 

val skyv1 = (sunny && temp > 80 || partlyCloudy )
	println(skyv1)

val skyv2 = (sunny && temp > 80 || partlyCloudy && temp < 20)
	println(skyv2)

/*** Fahrenheit to Celsius ***/
val nF: Double = 1
val cal = (nF - 32) * 5/9
println(cal)

/*** Celsius to Fahrenheit ***/
val nC: Double = 1
val feh = (nC * 9/5) + 32
println(feh)