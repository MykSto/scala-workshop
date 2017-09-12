//MethodsInsideClasses.scala
class Sailboat {
	def raise(): String = { "Sails raised!" }
	def lower(): String = { "Sails lowered!" }
	def signal(): String = {
		new Flare().light()
	}
}

class Motorboat {
	def start(): String = { "Motor on!" }
	def stop(): String = { "Motor off!" }
	def signal(): String = {
		new Flare().light()
	}
}

val sailboat = new Sailboat
val s1 = sailboat.raise()
println(s1)
assert(s1 == "Sails raised!", "Expected, Sails raised!" + "Got: " + s1)
val s2 = sailboat.lower()
println(s2)
assert(s2 == "Sails lowered!", "Expected, Sails lowered!" + "Got: " + s2)

val motorboat = new Motorboat
val m1 = motorboat.start()
println(m1)
assert(m1 == "Motor on!", "Expected, Motor on!" + "Got: " + m1)
val m2 = motorboat.stop()
println(m2)
assert(m2 == "Motor off!", "Expected, Motor off!" + "Got: " + m2)

class Flare{
	def light(): String = { "Flare used!" }
}

val flare = new Flare
val f1 = flare.light()
println(f1)
assert(f1 == "Flare used!", "Expected, Flare used!" + "Got: " + f1)

val sailboat1 = new Sailboat
val s3 = sailboat1.signal()
assert(s3 == "Flare used!", "Expected, Flare used!" + "Got: " + s2)
println(s3)
val motorboat2 = new Motorboat
val m3 = motorboat2.signal()
assert(m3 == "Flare used!", "Expected, Flare used!" + "Got: " + m2)
println(m3)