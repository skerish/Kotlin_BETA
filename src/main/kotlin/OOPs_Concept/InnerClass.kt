package OOPs_Concept

/*
    When we can declare a class inside another class using the keyword inner then it is called inner class. With the help
    of the inner class, we can access the outer class property inside the inner class.
 */

class myOuterClass {

    var str = "Outer class"

    fun aga(){
        print("aga")
    }

    inner class myInnerClass {
        var s1 = "Inner class"
        fun nestfunc(): String {
            val s2 = str  // can access the outer class property str
            return s2
        }
    }

}

fun main(){
    // creating object for inner class
    val inner= myOuterClass().myInnerClass()

    // inner function call using object
    println(inner.nestfunc()+" property accessed successfully from inner class ")

}