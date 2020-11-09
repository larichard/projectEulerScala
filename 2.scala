//2. Even Fibonacci numbers
//Find sum of even valued terms in Fibonnaci sequence.
def fibSeq(input:Int):Int = {
    var first = 1
    var second = 2
    var count = 1

    while(count < input) {
        var sum = first + second
        first = second
        second = sum
        count = count + 1
    }
    return first
}

//sum of even valued terms up to a certain value
def fibSum(maxVal:Int):Int = {
    var sum = 0
    var i = 1
    
    while(fibSeq(i) <= maxVal) {
        if ( fibSeq(i) % 2 == 0 ) {
            sum += fibSeq(i)
        }
        i += 1
    }
    return sum
}