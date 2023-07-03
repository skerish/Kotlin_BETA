package OOPs_Concept

/*
    Unlike Java enums, Kotlin enums are classes.

    Some important points about enum classes in kotlin –
        1. Enum constants aren’t just mere collections of constants- these have properties, methods etc.
        2. Each of the enum constants acts as separate instances of the class and separated by commas.
        3. Enums increases readability of your code by assigning pre-defined names to constants.
        4. An instance of enum class cannot be created using constructors.
 */

// ******************************** Initializing enums **************************************

// In Kotlin also enums can have a constructor like Java enums. Since enum constants are instances of an Enum class,
// the constants can be initialized by passing specific values to the primary constructor.

enum class Cards(val color: String, val total: Int) {
    Diamond("black", 12),
    Heart("red", 12),
}


// ****************************** Enums properties and methods ******************************

/*
    Kotlin enum classes has some inbuilt properties and functions which can be used by the programmer.
        Properties –
        1. ordinal: This property stores the ordinal value of the constant, which is usually a zero-based index.
        2. name: This property stores the name of the constant.

        Methods –
        1. values: This method returns a list of all the constants defined within the enum class.
        2. valueOf: This methods returns the enum constant defined in enum, matching the input string. If the constant, is not present in the enum, then an IllegalArgumentException is thrown.
 */

enum class DAYS {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}


/**
 * The properties can be given a default value, however, if not provided, then each constant should define its own value
 * for the property. In the case of functions, they are usually defined within the companion objects so that they do not
 * depend on specific instances of the class. However, they can be defined without companion objects also.
 *
 */

enum class SEASONS(val isLiked: Boolean = false){
    WINTER(true),
    SUMMER,
    AUTUMN(true),
    MONSOON;

    companion object{
        fun today(obj: SEASONS): Boolean {
            return obj.name.compareTo("WINTER") == 0 || obj.name.compareTo("AUTUMN") == 0
        }
    }
}


// ****************************** Enums as Anonymous Classes ******************************

// Enum constants also behaves as anonymous classes by implementing their own functions along with overriding
// the abstract functions of the class. The most important thing is that each enum constant must override.

enum class SEASON2(var weather: String) {
    Summer("hot"){
        // compile time error if not override the function foo()
        override fun foo() {
            println("Hot days of a year")
        }
    },
    Winter("cold"){
        override fun foo() {
            println("Cold days of a year")
        }
    },
    Rainy("moderate"){
        override fun foo() {
            println("Rainy days of a year")
        }
    };
    abstract fun foo()
}



fun main(){
    println("Diamond card color is " + Cards.Diamond.color)

    for (day in DAYS.values()) {
        println("${day.ordinal} = ${day.name}")
    }
    println("${DAYS.valueOf("WEDNESDAY")}")

    for(x in SEASONS.values()) {
        println("${x.ordinal} = ${x.name} and is liked ${x.isLiked}")
    }

    val today = SEASONS.MONSOON
    println("Is today liked? : ${SEASONS.today(today)}")

    SEASON2.Summer.foo()

}