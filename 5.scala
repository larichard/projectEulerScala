//5. Smallest multiple
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
//begin = 9699690 = 2*3*5*7*11*13*17*19

def smallestMultiple(begin:Int):Int = {
    if(evenlyDivisible(begin)) {
        begin
    } else {
        smallestMultiple(begin + (2*3*5*7*11*13*17*19))
    }
}

def evenlyDivisible(n:Int):Boolean = {
    var check = 0
    for(i <- 1 to 20) {
        if(n % i != 0) {
            check += 1
        }
    }
    check == 0
}