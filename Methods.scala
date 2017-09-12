//Methods.scala

/* Get Square */
def getSquare(x: Int):Int = {
	x * x
}

val a = getSquare(3)
println(a)
assert(a == 9, "Expected 9" + "\n" + "Got:" + a)
val b = getSquare(6)
println(b)
assert(b == 36, "Expected 36" + "\n" + "Got:" + b)
val c = getSquare(5)
println(c)
assert(c == 25, "Expected 25" + "\n" + "Got:" + c)

/* get Square Double */
def getSquareDouble(y: Double):Double = {
	y * y
}
val sd1 = getSquareDouble(1.2)
println(sd1)
assert(sd1 == 1.44, "Expected 1.44" + "Got: " + sd1)
val sd2 = getSquareDouble(5.7)
println(sd2)
assert(sd2 == 32.49, "Expected 32.49" + "Got: " + sd2)

/* isArg1GreaterThanArg2 */
def isArg1GreaterThanArg2 (z: Double, c: Double):Boolean = {
	z > c
}
val t1 = isArg1GreaterThanArg2(4.1, 4.12)
println(t1)
assert(t1 == false, "Expected to be false" + "Got: " + t1)
val t2 = isArg1GreaterThanArg2(2.1, 1.2)
println(t2)
assert(t2 == true, "Expected to be true" + "Got: " + t2)

/* toLowerCase */
def getMe(t: String):String = {
	t toLowerCase()
}	
val g1 = getMe("abraCaDabra")
println(g1)
assert(g1 == "abracadabra", "Expected to be LowerCase" + "Got: " + g1)
val g2 = getMe("zyxwVUT")
println(g2)
assert(g2 == "zyxwvut", "Expected to be LowerCase" + "Got: " + g2)

/* addString */
def addString(one: String, two: String):String = {
	one.concat(two)
}
val s1 = addString("abc", "def")
println(s1)
assert(s1 == "abcdef", "Expected abcdef" + "Got: " + s1)
val s2 = addString("zyx", "abc")
println(s2)
assert(s2 == "zyxabc", "Expected zyxabc" + "Got: " + s2)

/* Many times String */
def manyTimesString(name: String, times: Int):String = {
	name * times
}
val m1 = manyTimesString("abc", 3)
println(m1)
assert(m1 == "abcabcabc", "Expected abcabcabc" + "Got: " + m1)
val m2 = manyTimesString("123", 2)
println(m2)
assert(m2 == "123123", "Expected 123123" + "Got: " + m2)

/* BMI */
def bmiStatus(lbs: Double, height: Double):String = {
	val bmiv1 = lbs/(height * height) * 703.07
	 if(bmiv1 < 18.5) "Underweight"
	 else if(bmiv1 < 25) "Normal weight"
	 else "Overweight"
}
val normal = bmiStatus(160, 68) 
println(normal)
assert("Normal weight" == normal, "Expected Normal weight, Got " + normal) 
val overweight = bmiStatus(180, 60) 
println(overweight)
assert("Overweight" == overweight, "Expected Overweight, Got " + overweight) 
val underweight = bmiStatus(100, 68)
println(underweight) 
assert("Underweight" == underweight, "Expected Underweight, Got " + underweight) 