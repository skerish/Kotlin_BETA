package ArrayAndString

fun main(args: Array<String>){

    // There are two ways to define an array in Kotlin.

    // ************************* 1. Using the arrayOf() function *************************

    val num1 = arrayOf(1, 2, 3, 4)   //implicit type declaration
    val num2 = arrayOf<Int>(1, 2, 3) //explicit type declaration
    for (i in 0..num1.size-1)
        println(num1[i])


    // ************************** 2. Using the Array constructor *****************************

    /*
    Since Array is a class in Kotlin, we can also use the Array constructor to create an array.
    The constructor takes two parameters:
        1. The size of the array, and
        2. A function which accepts the index of a given element and returns the initial value of that element.
    */

    val myArray = Array(5, {i -> i*1})
    for (i in myArray)
        println(i)


    // Built-in factory methods to create arrays of primitive types
    val arr1 = intArrayOf(1,2,3,4,5)
    val arr2 = doubleArrayOf(10.52,65.69,85.41)


    // Accessing and modifying arrays

    // ********* get() method ************
    val x = myArray.get(3)  // passing index in the param
    // or
    val y = myArray[3]

    // ********** set() method *************
    myArray.set(2, 100)     // (index, updatedValue)
    // or
    myArray[2] = 100


    // Traversing arrays

    // ************** using 'indices' ************
    val num = arrayOf(10,20,30,40,50)
    for (i in num.indices)
        println("index: $i, value: " + num[i])

    // *************** using range operator (..) **************
    for (i in 100..110)
        println(i)

    // *************** using for-each loop *****************
    num.forEach { i -> println(i-2) }
}