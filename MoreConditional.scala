//MoreConditional.scala
import com.atomicscala.AtomicTest._

def palindrome(word: String): Boolean = {
	val p = word.reverse
	p == word
}

palindrome("mom") is true
palindrome("dad") is true
palindrome("street") is false

def isPalIgnoreCase(words: String): Boolean = {
	val pic = words.toUpperCase.reverse
	pic == words.toUpperCase
}

isPalIgnoreCase("Bob") is true
isPalIgnoreCase("DAD") is true
isPalIgnoreCase("Blob") is false

def isPalIgnoreSpecial(str:String):Boolean = {
  var createdStr = ""
  for(c <- str) {
    val theValue = c.toInt
    if(theValue > 64 && theValue < 123) {
      createdStr += c
      //println(theValue)
    }
    else if(theValue > 47 && theValue < 58) {
      createdStr += c
      //println(theValue)
    }
  }
  val s1 = createdStr.toUpperCase.reverse
  val s2 = createdStr.toUpperCase
  s1 == s2
}

isPalIgnoreSpecial("Madam I'm adam") is true
isPalIgnoreSpecial("trees") is false
