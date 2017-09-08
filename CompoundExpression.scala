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