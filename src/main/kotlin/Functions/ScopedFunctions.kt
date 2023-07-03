package Functions

/*

    Scope functions make code more clear, readable, and concise.

    There are five types of scope functions:
        1. let: working with nullable objects to avoid NullPointerException
        2. run: changing object configuration
        3. with: operate on nullable object, executing lambda expressions
        4. apply: adding additional operations
        5. also: operating on non-null objects

    There are mainly two differences among these functions:
        - Way of referring to a context object (i.e. using either ‘this’ or ‘it’ keyword)
        - return value (i.e. returns either ‘context object’ or ‘lambda result’)

 */

fun main(args: Array<String>){

    //************************ let function ********************************

    /*
    Context object  :   it
    Return value    :   lambda result

    let function is often used to provide null safety calls. Use safe call operator(?.) with ‘let’ for null safety.
    It executes the block only with the non-null value.
    */

    val a: Int? = null
    a?.let {
        println("a is not null")            // Code will only execute if a is not null
        println("Value is $it")
    }



    //************************ apply function ********************************

    /*
    Context object  :   this
    Return value    :   context object

    It can be used to operate on members of the receiver object mostly to initialize members.
    */

    val obj = Company().apply {
        name = "GeeksforGeeks"
        objective = "A computer science portal for Geeks"
        founder = "Sandeep Jain"
    }
    println(obj.name)


    //************************ with function ********************************

    /*
    Context object  :   this
    Return value    :   lambda result

    Recommended use of ‘with’ for calling functions on context objects without providing the lambda result.
    */

    with(obj){
        println("Name: $name")
        println("Objective: $objective")
        println("Founder: $founder")
    }


    //************************ run function ********************************

    /*
    Context object  :   this
    Return value    :   lambda result

    ‘run’ function can be said as the combination of ‘let’ and ‘with’ functions.
    Used when the object lambda contains both initialization and the computation of the return value.
    Using run we can perform null safety calls as well as other computations.
    */

    var obj2: Company? = null
    obj2?.run {
        print(name)
    }

    obj2 = Company().apply {
        name = "Cashfree Payments"
        founder = "Akash Sinha"
        objective = "Onine payment solutions"
    }

    obj2.run {
        println(name)
        println(founder)
        println(objective)
    }

    //************************ also function ********************************

    /*
    Context object  :   it
    Return value    :   context object

    It is used where we have to perform additional operations when we have initialized the object members.
    */

    val list = mutableListOf<Int>(1, 2, 3)
    list.also {
        it.add(6)
        it.remove(2)
    }
    println(list)

}


class Company() {
    lateinit var name: String
    lateinit var objective: String
    lateinit var founder: String
}