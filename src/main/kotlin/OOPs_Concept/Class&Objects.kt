package OOPs_Concept

class employee{
    // properties
    var name: String = ""
    var age: Int = 0
    var gender: Char = 'M'
    var salary: Double = 0.toDouble()

    // member functions
    fun insertValues(n: String, a: Int, g: Char, s: Double) {
        name = n
        age = a
        gender = g
        salary = s
        println("Name of the employee: $name")
        println("Age of the employee: $age")
        println("Gender: $gender")
        println("Salary of the employee: $salary")
    }

    fun insertName(str: String) {
        this.name = str
    }
}

fun main(args: Array<String>){
    var obj = employee()
    var obj2 = employee()
    var obj3 = employee().apply {
        name = "Harry"
        age = 24
        gender = 'M'
        salary = 50000.00
    }

    //accessing the member function
    obj.insertValues("Praveen", 50, 'M', 500000.00)

    // accessing the member function
    obj2.insertName("Alina")

    // accessing the name property of class
    println("Name of the new employee: ${obj2.name}")
    println("Name of the new employee: ${obj3.name}")
}