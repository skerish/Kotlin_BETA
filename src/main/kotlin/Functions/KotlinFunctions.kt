package Functions

fun main(){
    var result = mul(5,9)
    println("Result: $result")

    println(greet("Jamie"))
    println(greet())

    // Calling a function with named arguments therefore order doesn't matter
    printName(lastName = "World", firstName = "Hello")

    // Calling a functin with partial named arguments
    student("Gaurav", roll_no = 85, standard =  "VIII")

    // Calling a function with partial arguments
    student("Vivek")
}

fun mul(a: Int, b: Int) = a.times(b)

// Function with default arguments
fun greet(name: String = "Diablo") = "Hello $name!"

fun printName(firstName: String, lastName: String) {
    println("First name: $firstName, Last name: $lastName")
}

fun student( name: String="Praveen", standard: String="IX" , roll_no: Int=11 ) {
    println("Name of the student is: $name")
    println("Standard of the student is: $standard")
    println("Roll no of the student is: $roll_no")
}