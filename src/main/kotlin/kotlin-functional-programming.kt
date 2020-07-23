package main.kotlin


fun main() {
    println("=====IMPERATIVE STYLE OF PROGRAMMING========")
    imperativeStyle()
    println("============================================")

    println("=====DECLARATIVE STYLE OF PROGRAMMING========")
    declarativeStyle()
    println("============================================")
}

/**
 * Imperative programming
 *  - We show what to do
 *  - We tell how to do it
 */
private fun imperativeStyle() {
    // Imperative
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    // total of double of all even numbers
    var total = 0
    for (number in numbers) {
        if (number % 2 == 0) {
            total += number * 2
        }
    }

    println(total)
}

/**
 * Declarative programming
 * - Focus on what to do
 * - And not how to do it
 *
 * Functional Programming: declarative + higher-order functions
 *
 * What is a normal function?
 * - we pass objects to functions
 * - we create objects in a function
 * - we return object from a function
 *
 * What is a higher order function?
 * - we pass function to functions
 * - we create function in a function
 * - we return function from a function
 */
private fun declarativeStyle() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    println(
        numbers
            .filter { it % 2 == 0 } // Function
            .map { it * 2 }         // Function
            .sum()                  // Function
    )
}

/**
 * What is a Lambda expression?
 * - Are really anonymous function
 * - Expected to be pure functions (No mutation of data/ No side effects)
 *
 * What is the structure of a Lambda then?
 * - A normal function has 4 parts (name, return type, parameter list, body)
 * - A lambda expression has 2 parts (body and parameter list)
 *
 * { (parameter list) -> body }
 */
private fun lambdas() {
}