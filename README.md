# Kotlin Functional Programming

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
