fun main(){

    val num1 = 20
    val num2: Int? = 20     // num2 is nullable type

    // Option 1
    if(num2 != null) {
        val result = num1.times(num2)
    }

    // Option 2
    num2?.let {
        val result = num1.times(it)         // it => num2
    }

    lateinit var name: String
    print(name)                             // No compile time error but will give runtime if name is uninitialized

    var text: String? = "Hello World"

    // Option 1
    if(text != null) println(text) else println("String is null!")

    // Option 2
    println(text?:"String is null!")        // '?:' is called elvis operator

    var sampleText1 = sample() as String        // Casting the return type of sample() funcation to String (unsafe casting)
    var sampleText2 = sample() as? String       // safe casting

}

fun sample(): String = "Hello World"