package OOPs_Concept

/*
    Kotlin has two types of constructors –

        1. Primary Constructor
        2. Secondary Constructor

        A class in Kotlin can have at most one primary constructor, and one or more secondary constructors.
        The primary constructor initializes the class, while the secondary constructor is used to initialize the class
        and introduce some extra logic.
 */

// ***************************** Primary Constructor ***********************************

/*
    The primary constructor is initialized in the class header, goes after the class name, using the constructor keyword.
    The parameters are optional in the primary constructor. The 'constructor' keyword can be omitted if there is no
    annotations or access modifiers specified.
 */

class Add constructor(a: Int, b: Int){
    var c = a+b
}

// Primary Constructor with Initializer Block

/*
    The primary constructor cannot contain any code, the initialization code can be placed in a separate initializer
    block prefixed with the init keyword.

    init Block:
    It acts as an initializer block where member variables are initialised. This block gets executed whenever an
    instance of this class is created.

    There can be multiple init blocks and they are called in the order they are written inside the class.

    Note : init blocks gets called before the constructor of this class is called.
 */

class Person(val_name: String){
    // Member Variable
    var name: String

    // Initializer Blocks
    init{
        println("This is first init block")
    }

    init{
        println("This is second init block")
    }

    init{
        println("This is third init block")
    }

    init {
        this.name = val_name
        println("Name = $name")
    }
}

// Default value in Primary Constructor

// Similar to function default values in functions, we can initialize the constructor parameters with some default values.

class MyEmployee(id: Int = 100, name: String = "Dummy Name"){
    val id: Int
    var name: String

    init {
        this.id = id
        this.name = name
        print("Employee id is: $id, ")
        println("Employee name: $name")
        println()
    }

}



//************************** Secondary Constructors *********************************

/*
    Secondary constructors allow initialization of variables and allow to provide some logic to the class as well.
    They are prefixed with the constructor keyword.
 */

class Add2{
    // Secondary Constructors
    constructor(a: Int, b: Int){
        val c = a+b
        println("Sum of 2 numbers: $c")
    }
    //    Which secondary constructor will be called is decided by the compiler based on the arguments received.
    //    In the above program, we does not specify to invoke which constructor and compiler decides by itself.
    constructor(a: Int, b: Int, c: Int){
        val sum = a+b+c
        println("Sum of 3 numbers: $sum")
    }

    // A secondary constructor may call another secondary constructor of the same class using this() function.
    // The called constructor(a,b,c) will execute first before the calling constructor(a)
    constructor(a: Int): this(a, 50, 120){
        println("Number provided on Constructor chaining: $a")
    }
}


// Calling parent class secondary constructor from child class secondary constructor

// We can call the secondary constructor of parent class from the child class using the super keyword.
// We can also call the primary constructor of parent class using the primary or secondary constructor of child class
open class Parent{
    constructor(emp_id: Int, emp_name: String, emp_salary: Double) {
        val id: Int = emp_id
        val name: String = emp_name
        val salary : Double = emp_salary
        println("Parent Constructor")
        println("Employee id is: $id")
        println("Employee name: $name")
        println("Employee salary: $salary")
        println()
    }
}

class Child: Parent{
    constructor (emp_id : Int, emp_name: String): super(emp_id,emp_name,500000.55){
        val id: Int = emp_id
        val name: String = emp_name
        println("Child Constructor")
        println("Employee id is: $id")
        println("Employee name: $name")
    }
}


fun main(args: Array<String>){
   val obj = Add(5,6)
   println(obj.c)

    val obj2 = Person("Harry")

    val obj3 = MyEmployee()
    val obj4 = MyEmployee(name = "Harry")

    val obj5 = Add2(8,6)
    val obj6 = Add2(5,6,7)
    val obj7 = Add2(8)

    Child(18018, "Sagnik")
}
