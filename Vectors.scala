//Vectors.scala
// Vectors.scala
 import com.atomicscala.AtomicTest._

 // A Vector holds other objects:
 val v1 = Vector(1, 3, 5, 7, 11, 13) //new refers to class, not to Vector !!!
 v1 is Vector(1, 3, 5, 7, 11, 13)

 v1(4) is 11 // "Indexing" into a Vector

 // Take each element of the Vector:
 var result = ""
 for(i <- v1) {
 result += i + " "
 }
 result is "1 3 5 7 11 13 "

 val v3 = Vector(1.1, 2.2, 3.3, 4.4)
 // reverse is an operation on the Vector:
 v3.reverse is Vector(4.4, 3.3, 2.2, 1.1)

 var v4 = Vector("Twas", "Brillig", "And",
 "Slithy", "Toves")
 v4 is Vector("Twas", "Brillig", "And",
 "Slithy", "Toves")
 v4.sorted is Vector("And", "Brillig",
 "Slithy", "Toves", "Twas")
 v4.head is "Twas"
 v4.tail is Vector("Brillig", "And", "Slithy", "Toves")

/*EXERCISES */

val vector = Vector("The", "dog", "visited", "the", "firehouse")
var res = ""
for( i <- vector) {
	res += i + " "//or use toString()
}
//res.toString() is "The dog visited the firehouse "
//res is "The dog visited the firehouse "
/* REPLACING */
val theString = res.replace("firehouse", "firehouse!")
theString is "The dog visited the firehouse! "

/* REVERSED */

val vectorv1 = Vector("The", "dog", "visited", "the", "firehouse")
for(a <- vectorv1) {
	println(a.reverse)
}

val vectorv2 = Vector("The", "dog", "visited", "the", "firehouse")
for(b <- vectorv2.reverse) { //order changed, last to first!
	println(b)
}

val oneVector = Vector(1, 2, 3, 4, 5)
val secondVector = Vector(1.2, 2.2, 2.3, 2.4, 2.5)
val max = oneVector.max
val sum = oneVector.sum
val min = oneVector.min
println("Max: " + max + "\n" + "Min: " + min + "\n" + "Sum: " + sum)

/* INCLUSIVE AND SUM RANGE */
val rangeAndSum = Range(0, 10).inclusive.sum
rangeAndSum is 55

