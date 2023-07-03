 fun main(){
     var cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
     println(cars[0])
     cars[0] = "Opel"
     println(cars[0])
     println(cars.size)

     if ("Volvo" in cars) println("It exists!")else println("It does not exist.")

     for (x in cars) println(x)

     for(x in 'a'..'z') print(x)
     println()
     for(x in 5..50) print(x)

     myFunction("John")
     myFunction("Jane")
     myFunction("George")

     println("Sum is " + calculate(5,67))
     println("Sum is " + calculate_Short(5,67))

 }

 fun myFunction(name: String){
     println(name)
 }

 fun calculate(x: Int, y: Int): Int{
     return x+y
 }

 fun calculate_Short(x: Int, y: Int) = x+y
