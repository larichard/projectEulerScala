//7. 10001st prime
//What is the 10001st prime number?

def numPrime(max:Int):Int = {
    var ind = 1
    var soln = 0
    var num = 0

    while(ind <= max) {
        if(isPrime(num)) {
            soln = num
            ind = ind + 1
            num = num + 1
        } else {
            num = num + 1
        }
    }

    soln
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