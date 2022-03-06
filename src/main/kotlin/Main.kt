
// Code for Customer problem
private var counter = 0

class Customer(val name: String, val age: Int) {

    val uniqueID: Int

    init {
        counter++
        uniqueID = counter
    }
}

// return the customer's name and uniqueID
fun printCustomer(vararg customers: Customer): List<Pair<String, Int>> {

    val customerList = mutableListOf<Pair<String, Int>>()

    for(c in customers) {
        customerList.add(Pair(c.name, c.uniqueID))
    }

    return customerList
}

fun main() {

    // Customer List
    val c1 = Customer("Amy", 25)
    val c2 = Customer("Brad", 20)
    val c3 = Customer("Cathy", 30)
    val c4 = Customer("Diego", 43)
    val c5 = Customer("Elle", 29)
    val c6 = Customer("Frances", 18)
    val c7 = Customer("Gustavo", 35)
    val c8 = Customer("Hendrick", 55)
    val c9 = Customer("Ismail", 22)
    val c10 = Customer("John", 32)

    val storeList = listOf(
        listOf("Walmart", 102.32),
        listOf("Costco", 431.02),
        listOf("Kroger", 43.23),
        listOf("Macys", 321.32)
    )

    val nameList = listOf("Sam", "Tim", "Usher", "Virgil")

    val numbers = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19)

    // lambda functions
    val evenNum = numbers.filter { it % 2 == 0}
    val multiples = List(10){(it+1) * 13}


    println(printCustomer(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10))

    // flatten and zip functions
    println(storeList.flatten().toString())
    println(nameList.zipWithNext())

    // output of lambda functions
    println(evenNum.toString())
    println(multiples.toString())
}