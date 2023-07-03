package OOPs_Concept

/**
 * In Kotlin, if you want to write a function or any member of the class that can be called without having the instance
 * of the class then you can write the same as a member of a companion object inside the class.
 *
 * Same as static in JAVA.
 *
 */

class ToBeCalled {
    // Only 1 Companion object is allowed per class
    companion object{
        var someInteger: Int = 10
        fun callMe() = println("You are calling me :)")
    }
}
fun main(args: Array<String>) {
    print(ToBeCalled.someInteger)
    ToBeCalled.callMe()
}