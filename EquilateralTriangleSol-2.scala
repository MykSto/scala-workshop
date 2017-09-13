//EquilateralTriangleSol-2.scala
package com.atomicscala.pythagorean

class EquilateralTriangle {
	def area (side: Double) = {
		side*side*Math.sqrt(3)/4
	}
}
//to compile the package - use scalac 