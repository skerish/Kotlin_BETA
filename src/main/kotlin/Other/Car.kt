class Car{
    var brand = ""
    var model = ""
    var year = 0

    fun drive(){
        println("Wrooom!")
    }
}

// Creating a Class BIKE with Constructor declaration
class Bike(var brand: String, var model: String, var year: Int){
    fun drive(){
        println("Wrooooooom!")
    }
    fun speed(maxSpeed: Int){
        println("Max speed is : $maxSpeed")
    }
}

fun main(){
    var c1 = Car()
    c1.brand = "FORD"
    c1.model = "MUSTAND"
    c1.year= 2014

    println(c1.brand)
    println(c1.model)
    println(c1.year)

    var b1 = Bike("KTM", "DUKE", 2017)
    println(b1.brand)
    println(b1.model)
    println(b1.year)

    c1.drive()
    b1.drive()
    b1.speed(500)
}