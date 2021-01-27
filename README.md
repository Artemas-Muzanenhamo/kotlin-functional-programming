# Kotlin Functional Programming

<!--ts-->
* [Aggregation Operations](#aggregation-operations)
    * [Sum](#sum)
    * [Max](#max)
* [Transformations Operations](#transformations-operations)
    * [Zip](#zip)
    * [Flatten](#flatten)
<!--te-->

## Aggregation Operations

### Sum
- Get the total sum of numbers in a list
```kotlin
val listOfNumbers : List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val totalSum : Int = listOfNumbers.sum()
```

- Get the total sum of numbers in a range
```kotlin
val rangeOfNumbers : IntRange = 1..10
val totalSum : Int = rangeOfNumbers.sum()
```

- Get total sum of numbers in a list of Range
```kotlin
val listOfIntRange : List<IntRange> = listOf(1..10)
val totalSum : Int = listOfIntRange.sumBy(IntRange::sum)
```

### Max
- Get the maximum value in the list of numbers
```kotlin
val listOfNumbers = listOf(100, 2, 43, 632, 55, 334)
val biggestValue = listOfNumbers.max()
```

- Get the maximum value in a list of number list
```kotlin
val listsOfNumbers = listOf(listOf(100, 2, 43), listOf(78, 565, 76), listOf(67, 443, 98))
val biggestValue = listsOfNumbers.flatten().max()
```

- Get the maximum value in a list of ranges list
```kotlin
val listsOfNumbers = listOf(listOf(1000..2000), listOf(1..10), listOf(200..300), listOf(5..7))

val biggestValue = listsOfNumbers
    .asSequence()
    .flatten()
    .flatten()
    .max()
```
## Transformations Operations
- These functions build new collections from existing ones based on the transformation rules provided.

### Zip
- Given the following data: 

```kotlin
private val books = listOf(
    Book("harry potter"),
    Book("artemas the great")
)

private val authors = listOf(
    Author("joanne", "rowling"),
    Author("artemas", "prime")
)
```

- Zip to create a list of Pairs containing Books with Authors

```kotlin
val booksWithAuthors: List<Pair<Book, Author>> = books.zip(authors)
```

### Flatten
```kotlin
val firstNumberSet = listOf(10, 20, 30)
val secondNumberSet = listOf(100, 90, 80)
val thirdNumberSet = listOf(40, 60, 50)

val numbers = listOf(firstNumberSet, secondNumberSet, thirdNumberSet)
```

- Get the total sum of all numbers

```kotlin
val sum = numbers.flatten().sum()
```

### Mapping

- Given the following data:
```kotlin
val artemas = Author("artemas", "prime")
val kobe = Author("kobe", "bryant")
val james = Author("james", "harden")

val authors = listOf(artemas, kobe, james)
```

- Return a list of author names

```kotlin
val names = authors.map { it.name }
```