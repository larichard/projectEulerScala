//9. Special Pythagorean triplet
//There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.

def pythogoreanTriplet(exact:Int):Int = {
    var soln = 0;
    for(a <- 1 to exact; b <- 1 to exact; c <- 1 to exact) {
        if(isPythTripletAndExact(a,b,c,exact)) {
            soln = a*b*c
        }
    }
    soln
}

def isPythTripletAndExact(a:Int, b:Int, c:Int, exact:Int):Boolean = {
    var triplet = (a+b+c) == exact
    var isExact = (a*a + b*b == c*c)
    triplet && isExact
}

