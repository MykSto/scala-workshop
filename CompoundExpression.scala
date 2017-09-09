//CompoundExpression.scala
val hour = 5 
val openOrClose = {
	val open = 8
	val close = 20 
	println("Opens at: " + open + "-" + close)
	
	if(hour >= open && hour <= close){
		println ("Opened")
	} else {
		println ("Closed")
	}
}

/* ConditionalExpressions exercise 3. Use > = to solve */
val a = 1
val check = {
val b = 6
val c = 5
println("a: " + a + "\n" + "b: " + b + "\n" + "c: " + c)

if(a <= c && b <= c){
	true
} else{
	println("One is, and one is not!")
}
}

/* CompoundExpression2 + goodTemperature */
val activity = "swimming"
val hours = 7
val temp = 20
val isOpen ={
	if (activity == "swimming"){
		val opens = 9
		val closes = 20
		println("Operating hours: " + opens + " - " + closes)
		if(hours >= opens && hours <= closes){
			true
		} else {
			false
		}
	}else {
		false
	}
}

val goodTemperature = {
	if(temp >= 30){
		true
	} else {
		false
	}
}

val doActivity = (isOpen && goodTemperature)
	println(activity + ": " + isOpen + " && " + goodTemperature + " = " + doActivity)

/* Activities with distance */
val distance = 9
val act = "biking"

val willDo = {
  if(act == "running") {
    distance < 10
  } else if(act == "biking") {
    distance < 20
  } else if(act == "walking") {
    distance < 6
  } else {
      false
  }
}

println(act + ": " + willDo)
