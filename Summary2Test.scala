//Summary2Test.scala
import calculusTest.result.Calculus

val test = new Calculus
val testing1 = test.cube(5) 
println(testing1)
assert(testing1 == 125, "Expected, 125" + "Got: " + testing1)
val testing2 = test.bang("Dab")
println(testing2)
assert(testing2 == "Dab!", "Expected, 125" + "Got: " + testing2)