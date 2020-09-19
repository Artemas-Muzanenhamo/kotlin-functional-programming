package main.kotlin


fun main() {
    println("=====IMPERATIVE STYLE OF PROGRAMMING========")
    imperativeStyle()
    println("============================================")

    println("=====DECLARATIVE STYLE OF PROGRAMMING=======")
    declarativeStyle()
    println("============================================")

    println("=====================LAMBDAS================")
    lambdas()
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
    // given the numbers below, iterate through them and print each one
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

/**
 * External iterators - YOU MANAGE THE ITERATION
    for (number in numbers) {
        println(number)           <<-- Imperative style
    }
 */

 /**
  * Internal iterators - Functional style
  * numbers.forEach { number -> println(number)}
  *
  * Or use the implicit parameter to the function as below
  * Of course if you have more than one parameter then the idea of using the implicit parameter won't apply here.
  * */
    numbers.forEach { println(it) }

/**
 *  forEach { number -> println(number) } is a pass-through lambda which means that it just takes an input and just
    passes the parameter to a function. Here we can even exercise method references instead as below:
 */
    numbers.forEach(::println)
    
//    Assigning a lambda to a variable
    val printIt = { number: Int -> println(number) }
    printIt(4)
}
