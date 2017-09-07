//ConditionalExpressions.scala
val a = 1
val b = 5
val c = 5
if(a > b){
	println("a is not less than b")
} else {
	println("a is less than b")
}

if(a > 2 ){
	println("a is less than 2")
} else if(b > 2){				//if else conditional, extra spicy
	println("""a is less than 2,
		b is not less than 2""")
}

val aIfC: Boolean = (a < c)

val bIfC: Boolean = (b < c)

println(aIfC, bIfC)