//Expressions/scala
val feetPerMinute = 5280
val yardsPerMile = feetPerMinute/3.0
val miles = 2000/yardsPerMile
println(miles)
/*combo with one expression*/
val getMiles = {
	val feetPerMin = 5280
	val yardsPerMil = feetPerMin/3.0
	2000 / yardsPerMil
}
println(getMiles)