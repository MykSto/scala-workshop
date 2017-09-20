//PaternMatching.scala
// MatchExpressions.scala
import com.atomicscala.AtomicTest._

def matchColor(color:String):String = {

if(color == "red"){
	"RED"
} else if (color == "blue"){
	"BLUE"
} else if (color == "green") {
 "GREEN"
}
else "UNKNOWN COLOR: " + color
}

 matchColor("white") is
 "UNKNOWN COLOR: white"
 matchColor("blue") is "BLUE"

 // OneOrTheOther.scala
import com.atomicscala.AtomicTest._

def oneOrTheOther(exp: Boolean):String = {
exp match {
	case true => "True" 
	case false => "False"
	}
 }

 val v = Vector(1)
 val v2 = Vector(3, 4)
 oneOrTheOther(v == v.reverse) is "True"
 oneOrTheOther(v2 == v2.reverse) is
 "False"

// CheckTruth.scala
import com.atomicscala.AtomicTest._ 

def checkTruth(
exp1:Boolean, exp2:Boolean):String = {
	(exp1, exp2) match {
	case (true, true) => "Both are true"
    case (true, false) => "First: true, second: false"
    case (false, true) => "First: false, second: true"
    case (false, false) => "Both are false"
	}
 }

checkTruth(true || false, true) is
"Both are true"
checkTruth(1 > 0 && -1 < 0, 1 == 2) is
"First: true, second: false"
checkTruth(1 >= 2, 1 >= 1) is
"First: false, second: true"
checkTruth(true && false,false && true) is
"Both are false"

def forecast(temp: Int): String ={
	temp match {
		case 100 => "Sunny"
		case 80 => "Mostly Sunny"  
		case 50 => "Partly Sunny"
		case 20 => "Mostly Cloudy" 
		case 0 => "Cloudy"
		case _ => "Unknown" + " " + temp 
	}
}
forecast(100) is "Sunny"
forecast(80) is "Mostly Sunny"
forecast(50) is "Partly Sunny"
forecast(20) is "Mostly Cloudy"
forecast(0) is "Cloudy"
forecast(15) is "Unknown"

val sunnyData = forecastData(Vector(100, 80, 50, 20, 0, 15))

def forecastData(cast:Vector[Int]):Unit = {
  for(s <-cast)
    println("Forecast: " + s + " -" + forecast(s))
}

