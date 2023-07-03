open class MyParentClass{
    val x = 5
}

class MyChildClass: MyParentClass(){
    fun myFunction(){
        println(x)
    }
}

fun main(){
    val demo = MyChildClass()
    demo.myFunction()
}
