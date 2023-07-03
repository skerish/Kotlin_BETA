package Functions

fun main(){
    println(factorial(5))
    println(factorial2(5, 1))
}

fun factorial(num: Int): Long{
    return if (num<=0)
        1
    else
        num* factorial(num-1)
}

/*
    In Tail recursion, we perform the calculation first, and then we execute the recursive call, passing the results
    of the current step to the next recursive call.
*/

// Tail Recursion method
fun factorial2(num: Int, x: Int): Long{
    return if (num == 1) x.toLong()
    else factorial2(num-1, x*num)
}