//ClassArguments.scala
import com.atomicscala.AtomicTest._

class Family(name: String*) {
	def size(): Int = {
		var capacity = 0
		for( n <- name) {
			capacity = capacity + 1
		}
		capacity
	}
	}
	val family1 = new Family("Mom", "Dad", "Sally", "Dick")
	family1.size() is 4
	val family2 =  new Family("Dad", "Mom", "Harry")
	family2.size() is 3

class FlexibleFamily(mom:String, dad:String, kids:String*) {
  def flexSize():Int = {
    var capacity1 = 2    // need to have 2 (mom and dad) mom:String - 1, dad:String - 2, kids:String* - 3 (*) means argument list
    for(nn <- kids) {
      capacity1 = capacity1 + 1
    }
    capacity1
  }
}

val family3 = new FlexibleFamily("Mom", "Dad", "Sally", "Dick")
family3.flexSize() is 4
val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
family4.flexSize() is 3

val familyNoKids = new FlexibleFamily("Mom", "Dad")
familyNoKids.flexSize() is 2

//parents:String* - cannot be used, since (*) parameter list must come last

// Cup2.scala
class Cup2 (var percentFull: Int) {
  val max = 100
	def add(increase:Int):Int = {
		percentFull += increase
	if(percentFull > max) {
		percentFull = max
	}
	percentFull
	}
	def add1(arg: Int*):Int = {
		for(nnn <- arg) {
			percentFull += nnn
		if(percentFull > max) {
			percentFull = max
		} 
	}
	percentFull
   	}
}

// val cup2 = new Cup2(0) -- start from 0 !!
// cup2.add(45) is 45
// cup2.add(-15) is 30

//val cup = new Cup2 (50)
// cup.percentFull is 50

// val cup3 = new Cup2(0)
// cup5.add1(20, 30, 50, 20, 10, -10, -40, 10, 50) is 100

def squareThem(number: Int*):Int = {
   		var res = 0
		for( nnnn <- number) {
			res += + nnnn * nnnn
		}
		res
	}
squareThem(2) is 4
squareThem(2, 4) is 20
squareThem(1, 2, 4) is 21
