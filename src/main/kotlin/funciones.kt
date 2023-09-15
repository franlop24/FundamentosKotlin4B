fun main(){
    println("Hello")
    sayHello()
    sayHelloTo("Peter")
    sayHelloToFrom("Bruce Wayne", "Gotham City")
    println("El doble de 25 es ${ duplicate(25) }")
    val result = divide(99, 15.0)
    println("El resultado de 99 / 15 es $result")
    println(fullName("John", "Snow"))

    welcomeToMexico()
    welcomeToMexico("Spiderman")

    // Params with name
    sayHelloToFrom("Superman", "Metropolis")
    sayHelloToFrom(city = "Namekusei", name = "Pikoro")
}

// functions without params and without return
fun sayHello(){
    println("Hello!")
}

// Functions with params and without return
fun sayHelloTo(name: String){
    println("Hello $name")
    println("Welcome")
}

fun sayHelloToFrom(name: String, city: String){
    println("Hello $name from $city")
}

// Functions With return
// We must specify the datatype
fun duplicate(num: Int): Int {
    return num * 2
}

fun divide(num1: Int, num2: Double): Double {
    return num1 / num2
}

fun fullName(firstName: String, lastName: String): String {
    return "$firstName $lastName"
}

// Functions with optional Params
fun welcomeToMexico(name: String = "Invitado"): Unit{
    println("Welcome to Mexico $name")
}