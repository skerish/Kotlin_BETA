package OOPs_Concept

/*
    We often create classes to hold some data in it. In such classes, some standard functions are often derivable from the data.
    In Kotlin, this type of class is known as data class and is marked as data.

        SYNTAX: data class class_name(val n1: String, val n2: Int)

    The compiler automatically derives the following functions :
        1. equals()
        2. hashCode()
        3. toString()
        4. copy()

    Rules to create Data classes
    Data classes have to fulfill the following requirements to ensure the consistency:
        1. The primary constructor needs to have at least one parameter.
        2. All primary constructor parameters need to be marked as val or var.
        3. Data classes cannot be abstract, open, sealed or inner.
        4. Data classes may only implement interfaces.
*/


// ********************************** toString() ****************************************
// This function returns a string of all the parameters defined in the data class .

data class Man(val roll: Int,val name: String,val height:Int){
    //  The compiler only uses the properties defined inside the primary constructor for the automatically generated functions.
    //  It excludes the properties that are declared in the class body.
    var weight: Int = 0
}



// ********************************** copy() ****************************************

/*
    Sometimes we need to copy an object, with some change in some of its properties keeping all others unchanged.
    In this case copy() function is used.

    Properties of copy():
        1. It copies all arguments or members defined in primary constructor
        2. Two objects can have same primary parameter values and different class body values if defined

 */



// ********************************** hashCode() and equals() ****************************************

/*
    hashCode() function returns a hash code value for the object.

    Properties of hashCode()
        1. Two hash codes declared two times on same object will be equal.
        2. If two objects are equal according to equals() method, then the hash codes returned will also be same

    equals() method return true if two objects have same contents, it works similar to “==”, but works different for
    Float and Double values.

 */



fun main(args: Array<String>) {
    val man1 = Man(1,"man",50)
    println(man1.toString())


    //copying details of man1 with change in name of man
    val man2 = man1.copy(name="rahul")

    //copying all details of man1 to man3
    val man3 = man1.copy()

    //declaring heights of individual men
    man1.weight=100
    man2.weight=90
    man3.weight=110

    //man1 & man3 have different class body values,
    //but same parameter values

    println("$man1 has ${man1.weight} kg weight")
    println("$man2 has ${man2.weight} kg weight")
    println("$man3 has ${man3.weight} kg weight")


    val hash1=man1.hashCode()
    val hash2=man2.hashCode()
    val hash3=man3.hashCode()
    println("Hashcode of Man1: $hash1")
    println("Hashcode of Man2: $hash2")
    println("Hashcode of Man3: $hash3")

    //checking equality of  these hash codes
    println("hash1 == hash2 : ${hash1.equals(hash2)}")
    println("hash2 == hash3 : ${hash2.equals(hash3)}")
    println("hash1 == hash3 : ${hash1.equals(hash3)}")
}
