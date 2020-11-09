//3. Largest prime factor

import scala.collection.mutable.ArrayBuffer

def largestPrimeFact(n:Long):Long = {
    var factors = ArrayBuffer[Long]()
    var f = 1
    var num = n
    while(f <= num) {
        if(n % f == 0) {
            factors :+= f
            num = num / f
            f += 1
        } else {
            f += 1
        }
    }
    
    f = (factors.length-1)

    while(f >= 0) {
        if(isPrime(factors(f))) {
            return factors(f)
        } else {
            f -= 1
        }
    }
    
    return n
}

def isPrime(n:Long):Boolean = {
    if(n <= 1) {
        return false
    }
    if(n == 2) {
        return true
    }
    if(n % 2 == 0) {
        return false
    }
    var i = 3
    while(i * i <= n) {
        if(n % i == 0) {
            return false
        } else {
            i += 1
        }
    }
    return true;
}