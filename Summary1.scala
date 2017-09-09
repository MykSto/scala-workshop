//Summarry1.scala
val g: Int = 4
var a: Int = 4


// CompoundBMI.scala
 val lbs = 150.0 
 val height = 68.0
 val weightStatus = {
 val bmi = lbs/(height * height) * 703.07
 if(bmi < 18.5) "Underweight"
 else if(bmi < 25) "Normal weight"
 else "Overweight"
 }
 val bmiv1 = lbs/(height * height) * 703.07
 val idealWeight = bmiv1 * (height * height) / 703.07
 println("Weight status: " + weightStatus + "\n" + "Ideal weight would be: " + idealWeight)
