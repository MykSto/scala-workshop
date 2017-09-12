//ClassObject.scala
val r = Range(0, 10)
println(r.step)

val r1 = Range(0, 10, 2)
//println(r1.start)
//println(r1.end)
println(r1.step)

/* .split */
val s = ("This is an experiment")
val spliting = s.split(" ")
println(spliting(1))
println(spliting(0))
println(spliting(2))
println(spliting(3))
println(" ?")

/* .equals() */
var s1  = ("Sally")
var s2 = ("Sally")
if(s1.equals(s2)){
	println("s1 equal s2")
} else {
	println("s1 does not equal s2")
}

s2 = ("Sam")
if(s1.equals(s2)){
	println("Equal")
} else {
	println("Are not equal")
}
println(s1)
println(s2)

/* Upper case, contentEquals */
var s3 = s1.toUpperCase()
println(s3)
val test: Boolean = s1.contentEquals(s3)
println(test)