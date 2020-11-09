//6. Sum square difference
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

def sumSquareDifference(num:Int):Int = {
    var sumOfSquares = 0
    var squareOfSums = 0
    var sum = 0

    for(i <- 1 to num) {
        sumOfSquares += (i * i)
        sum += i
    }

    squareOfSums = sum * sum

    squareOfSums - sumOfSquares
}