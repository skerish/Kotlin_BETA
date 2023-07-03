package OOPs_Concept

/*
    A sealed class defines a set of subclasses within it. It is used when it is known in advance that a type will
    conform to one of the subclass types. Sealed classes ensure type safety by restricting the types to be matched
    at compile-time rather than at runtime.

    To define a sealed class, just precede the class modifier with the sealed keyword. The sealed classes also have
    one another distinct feature, their constructors are protected by default. A sealed class is implicitly abstract
    and hence it cannot be instantiated.
*/

sealed class Demo{
    class A:Demo(){
        fun display(){
            println("Subclass A of Sealed class Demo ")
        }
    }
    class B:Demo(){
        fun display(){
            println("Subclass B of sealed class Demo")
        }
    }
}

//  All the subclasses of the sealed class must be defined within the same Kotlin file. However, it is not necessary to
//  define them within the sealed class, they can be defined in any scope where the sealed class is visible.
class C: Demo(){
    fun display(){
        println("Subclass C of sealed class Demo")
    }
}


// *************************************** Sealed class with when clause *******************************************

sealed class Fruit(val x : String) {
    class Apple : Fruit("Apple")
    class Mango : Fruit("Mango")
}

class Pomegranate: Fruit("Pomegranate")

// A function to take in an object of type Fruit and to display an appropriate message depending on the type of Fruit
fun display(fruit: Fruit) {
    when(fruit) {
        is Fruit.Apple -> println("${fruit.x} is good for iron")
        is Fruit.Mango -> println("${fruit.x} is delicious")
        is Pomegranate -> println("${fruit.x} is good for vitamin d")
    }
}


fun main() {
    val obj1 = Demo.A()
    obj1.display()
    val obj2 = Demo.B()
    obj2.display()
    val obj3 = C()
    obj3.display()

    // Objects of different subclasses created
    val f1 = Fruit.Apple()
    val f2 = Fruit.Mango()
    val f3 = Pomegranate()

    display(f1)
    display(f2)
    display(f3)

}