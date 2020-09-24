# Kotlin Functional Programming

<!--ts-->
* [Aggregation Operations](#aggregation-operations)
    * [Sum](#sum)
    * [Max](#max)
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

assertThat(booksWithAuthors)
    .containsExactly(
        Pair(books.first(), authors.first()),
        Pair(books.last(), authors.last())
    )
```
