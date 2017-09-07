//Variables.scala
val number: Int = 5
number = 10 //reassignment error *** Fix with using (var - mutable) 

var v1: Int = 5
v1 = 10
val constantv1 = v1 //store value with variable
v1 = 15 // value of constantv1 (10) did not change since (val) is immutable.  
var v2: Int = v1
v1 = 20
 println(number)
 println(v1)
 println(constantv1)
 println(v2) // v1 value can not be changed