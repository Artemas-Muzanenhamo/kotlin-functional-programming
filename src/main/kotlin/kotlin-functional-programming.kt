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

    println("=====================FILTER=================")
    filterExample()
    println("============================================")

    println("=====================MAP====================")
    mapExample()
    println("============================================")

    println("=====================REDUCE=================")
    reduceExample()
    println("============================================")

    println("=====================FLATTEN================")
    flattenExample()
    println("============================================")

    println("=====================FLAT MAP===============")
    flatMapExample()
    println("============================================")

    println("=====================SEQUENCE===============")
    withoutSequenceExample()
    withSequenceExample()
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
    println("======================")

/**
 *  forEach { number -> println(number) } is a pass-through lambda which means that it just takes an input and just
    passes the parameter to a function. Here we can even exercise method references instead as below:
 */
    numbers.forEach(::println)
    
//    Assigning a lambda to a variable
    println("======Assigning a lambda to a variable===========")
    val printIt = { number: Int -> println(number) }
    printIt(4)

//    Receive Lambdas to functions
    println("=======Receive Lambdas to functions=========")
    compute(7) { result -> println(result) }
}

private fun compute(n: Int, action: (Double) -> Unit) {
    action(n * 2.1)
}

private fun filterExample() {
    /**
     * Filter Characteristics:
     *
     * Filter takes a Predicate which returns a true/false value and filter based on the
     * result that resolves to true.
     */
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // get all even numbers
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers)
}

private fun mapExample() {
    /**
     * Map Characteristics:
     *
     * The number of input is the same number of output.
     * The type of the output may not be the same. e.g. .map(strings) -> returns int
     */
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

//    Get even numbers multiplied by 2
    val evenNumbersMultiplied = numbers
        .filter { it % 2 == 0 }
        .map { it * 2 }

    println(evenNumbersMultiplied)
}

private fun reduceExample() {
    /**
     * Reduce Function Characteristics:
     *
     * Takes a collection of data and reduces it to a single value often.
     * Terminal operation.
     *
     */
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

//    Get even numbers multiplied by 2 and get the sum of all the elements
    val sumOfMultipliedEvenNumbers = numbers
        .filter { it % 2 == 0 }
        .map { it * 2 }
        .sum()

    println(sumOfMultipliedEvenNumbers)
}

private fun flattenExample() {
    /**
     * Flatten Characteristics:
     *
     * Flattens a list of list down to a single list of all values
     */
    val numbers = listOf(listOf(1, 2), listOf(3, 4, 5))
    println("unflattened numbers")
    println(numbers.size)
    println(numbers)

    println("flattened numbers")
    val flattenedNumbers = numbers.flatten()
    println(flattenedNumbers.size)
    println(flattenedNumbers)
}

private fun flatMapExample() {
    /**
     * A Map has the following definition:
     * one-to-one function e.g. .map(person) -> return person.firstname | output = list of elements
     *
     * A FlatMap has the following definition:
     * one-to-many function e.g. .flatMap(person) -> return listOf(person.emailAddress) | output = list of list
     */
    println("map output")
    val numbers = listOf(1, 2, 3)
    println(numbers.map { e -> e + 1 }) // output = list
    println("return a list of list with .map()")
    println(numbers.map { e -> listOf(e - 1, e + 1) })

    /**
     * What if you have one-to-many function
     * but you don't want a list of list, but just
     * a single list
     *
     * Solution: We would need to:
     * .map()
     * .flatten()
     */
    println("map n flatten")
    println(numbers.map { e -> listOf(e - 1, e + 1) }.flatten())

    /**
     * If you have a many-to-many function
     * but you want a list not a list-of-list as output,
     * then use .flatMap()
     */
    println(".flatMap() operation")
    println(numbers.flatMap { e -> listOf(e - 1, e + 1) })
}

private fun withoutSequenceExample() {
    /**
     * Functional Composition + Lazy Evaluation = Functional Programming.
     *
     * Polymorphism is to OOP
     * as Lazy Evaluation is to Functional Programming.
     */
    val numbers = listOf(1, 2, 3, 7, 5, 4, 6, 8, 20)

    //find the first even number > 3 and double it
    numbers
        .filter(::isGreaterThan)
        .filter(::isEven)
        .map(::doubleIt)
        .first()
}

private fun withSequenceExample() {
    /**
     * asSequence gives you the same behaviour as
     * .stream() from Java
     */
    println("================================================")
    val numbers = listOf(1, 2, 3, 7, 5, 4, 6, 8, 20)

    //find the first even number > 3 and double it
    numbers
        .asSequence() // Yes I want Lazy Evaluation
        .filter(::isGreaterThan)
        .filter(::isEven)
        .map(::doubleIt)
        .first()
}

private fun isGreaterThan(number: Int): Boolean {
    println("isGreaterThan is called for element: $number")
    return number > 3
}

private fun isEven(number: Int): Boolean {
    println("isEven() is called for element: $number")
    return number % 2 == 0
}

private fun doubleIt(number: Int): Int {
    return number * 2
}
