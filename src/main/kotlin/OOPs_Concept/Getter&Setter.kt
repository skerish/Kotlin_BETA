package OOPs_Concept

class Company {

    // Private modifier
    var surname: String = "abc"
        private set

    var age: Int = 0
    var name: String = ""

        // Default Setter and Getter will set to the last declared property (name in this case)
        // There shouldn't be any line of code between default getter & setter and the property
        get() = field        // getter

        set(value) {         // setter
            println("Inside default setter method")
            field = value
        }

    // ********************* Value and Field Identifiers ******************************

    /*
            Value: Conventionally, we choose the name of the setter parameter as value, but we can choose a different
                    name if we want. The value parameter contains the value that a property is assigned to.
                    In the above program, we have initialized the property name as c.name = “GeeksforGeeks”,
                    the value parameter contains the assigned value “GeeksforGeeks”.

            Backing Field (field): It allows storing the property value in memory possible. When we initialize a
                                    property with a value, the initialized value is written to the backing field of that
                                    property. In the above program, the value is assigned to field, and then, field is
                                    assigned to get().
     */

    // We can set the name only in a method inside the class because of private modifier near set accessor
    fun myFunc(n: String){
        surname = n
    }

}

fun main(args: Array<String>) {
    val c = Company()
    c.name = "GeeksforGeeks"  // access setter
    println(c.name)           // access getter
    c.age = 25

    c.myFunc("Hakuna Matata")
    println("Surname of the company is: ${c.surname}")

    customGetter_SetterTest()

}

fun customGetter_SetterTest(){
    val geek = Registration("PRAVEENRUHIL1993@GMAIL.COM","Geeks@123",25,'M')
    println(geek.email_id)
    geek.email_id = "GEEKSFORGEEKS@CAREERS.ORG"
    println(geek.email_id)
    println(geek.password)
    println("${geek.age}")
    println("${geek.gender}")

    // throw IllegalArgumentException("Passwords is too small")
    geek.password = "abc"

    // throw IllegalArgumentException("Age should be 18+")
    geek.age= 5

    // throw IllegalArgumentException("User should be male")
    geek.gender = 'F'
}

// Custom Getter & Setter
class Registration( email: String, pwd: String, age: Int , gender: Char) {

    var email_id: String = email
        // Custom Getter
        get() {
            return field.lowercase()
        }

    var password: String = pwd
        // Custom Setter
        set(value){
            field = if(value.length > 6) value else throw IllegalArgumentException("Passwords is too small")
        }

    var age: Int = age
        // Custom Setter
        set(value) {
            field = if(value > 18 ) value else throw IllegalArgumentException("Age must be 18+")
        }

    var gender : Char = gender
        // Custom Setter
        set (value){
            field = if(value == 'M') value else throw IllegalArgumentException("User should be male")
        }
}