//ForLoops.scala
import com.atomicscala.AtomicTest._
/*
 /* TO */
 var result = ""
  for(i <- 0 to 9) {
  result += i + " " //<-- space created lul
 }
  result is "0 1 2 3 4 5 6 7 8 9 "
 /* UNTIL */
 result = ""
 for(i <- 0 until 10) {
 result += i + " "
 }
 result is "0 1 2 3 4 5 6 7 8 9 "
 /* RANGE */
 result = ""
 for(i <- Range(0, 10)) { //to include 10, Range(0, 10).inclusive
 result += i + " "
 }
 result is "0 1 2 3 4 5 6 7 8 9 "
 /* RANGE + STEP */
 result = ""
 for(i <- Range(0, 20, 2)) {
 result += i + " "
 }
 result is "0 2 4 6 8 10 12 14 16 18 "
 /* SUM OF RANGE WITH STEP */
 var sum = 0
 for(i <- Range(0, 20, 2)) {
 println("adding " + i + " to " + sum)
 sum += i
 }
 sum is 90 */

/* EXERCISES */
val r1 = Range(0, 10) //.inclusive to 10, not until 10
r1 is Range(0, 10)

/*SUM OF 0 to 10 */
var r2 = 0 //! urgent, var must be used to satisfy forLoop, since it is as mutable variable. 
for( i <- Range(0, 10). inclusive) {
	r2 += i
}
r2 is 55

/* EVEVN SUM */
var r3 = 0
var even = ""
for( i <- Range(0, 10).inclusive) {
	if(i % 2 == 0){
	r3 += i
	even += r3 + " "	
	}
}
println("Even: " + even)
r3 is 30

/* SUM OF EVEN AND ODD */

var even1 = 0
var odd = 0
var sumEvenOdd = 0
for( i <- Range(0, 10).inclusive) {
	if(i % 2 == 0) even1 += i
	if(i % 2 != 0) odd += i
	sumEvenOdd = even1 + odd
}
even1 is 30
odd is 25
sumEvenOdd is 55

