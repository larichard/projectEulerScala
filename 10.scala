//10. Summation of primes
//Find the sum of all the primes below two million.

def sumOfPrimes(max:Int):Long = {
    var sum:Long= 0
    for(i <- 2 to max) {
        if(isPrime(i)) {
            sum = sum + i
        }
    }
    sum
}

def isPrime(n:Int):Boolean = {
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