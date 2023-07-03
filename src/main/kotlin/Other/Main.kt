fun main(args: Array<String>) {

    var a = 5
    var b = 'k'
    var c = 5.9
    var d = true
    var e = 500L
    var f = 2.5F
    var g = "DIABLO"

    val k = 55 // constant
    val k2: String
    k2 = "HELLO"

    println(c.toInt())
    println(a.toString())
    println(a.toDouble())

    var str:String
    str = "Hello World!"
    var str2 = "Hello World!"
    println(str[0])
    println("String Lenght: " + str.length)
    println(str.compareTo(str2))
    println(str.uppercase())
    println(str.indexOf('W'))
    println(str.indexOf("rld"))
    println(str.plus(str2))
    println("First String is $str")

    val time = 20
    val greeting = if (time < 18) "Good day." else "Good evening."
    println(greeting)

    val day = 4
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

    
}