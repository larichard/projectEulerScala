//1. Multiples of 3 and 5
//Find sum of terms that are multiples of three and five.
def multiplesOf(input:Int): Int = {
    var sum = 0
    for (index <- 1 to input-1) {
        if (index % 3 == 0 || index % 5 == 0) {
            sum += index
        }
    }
    return sum
}