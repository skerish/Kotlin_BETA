package NullSafety

fun main(args: Array<String>){
    /*
        Explicit type casting can be done using :
        - Unsafe cast operator: as
        - Safe cast operator: as?
    */



    // **************** Unsafe cast operator 'as' *****************

    // Manually, we use the type cast operator as to cast a variable to target type.

    val str1: String = "It works fine"
    val str2: String = str1 as String
//    val str3: Any = str1 as Int      // throw exception as String can't be cast to Int
    val str4: String? = null
//    val str5: String = str4 as String   // throws exception as we can't cast a nullable string to non-nullable string
    val str6: String? = str4 as String?
    println(str4)



    // ******************** Safe cast operator 'as?' **********************

    // If casting is not possible it returns null instead of throwing an ClassCastException exception.

    var txt1: Any = "Safe casting"
    val txt2: String? = txt1 as String     // it works
    txt1 = 11
    val txt3: String? = txt1 as? String    // type casting not possible so returns null to txt3
    val txt4: Int? = txt1 as? Int          // it works
    println(txt2)
    println(txt3)
    println(txt4)

}