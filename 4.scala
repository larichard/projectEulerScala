//4. Largest palindrome product
//Find the largest palindrome made from the product of two 3-digit numbers.
import scala.collection.mutable.ArrayBuffer

def largestPalindrome(first:Int, second:Int):Int = {

    var soln = ArrayBuffer[Int]()
    for(f <- first to 100 by -1) {
        for(s <- second to 100 by -1) {
            if(isPalindrome(f*s)) {
                soln :+= (f*s)
            }
        }
    }
    soln.max
}

def isPalindrome(n:Int):Boolean = {
    var num = n.toString
    var rev = num.reverse
    num == rev
}