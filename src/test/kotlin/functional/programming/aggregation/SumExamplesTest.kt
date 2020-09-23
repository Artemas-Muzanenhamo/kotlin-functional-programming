package functional.programming.aggregation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SumExamplesTest {
    @Test
    fun `Get the total sum of numbers in a list`() {
        val listOfNumbers : List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        val totalSum : Int = listOfNumbers.sum()

        assertThat(totalSum)
            .isNotZero()
            .isEqualTo(55)
    }

    @Test
    fun `Get the total sum of numbers in a range`() {
        val rangeOfNumbers : IntRange = 1..10

        val totalSum : Int = rangeOfNumbers.sum()

        assertThat(totalSum)
            .isNotZero()
            .isEqualTo(55)
    }

    @Test
    fun `Get total sum of numbers in a list of Range`() {
        val listOfIntRange : List<IntRange> = listOf(1..10)

        val totalSum : Int = listOfIntRange.sumBy(IntRange::sum)

        assertThat(totalSum)
            .isNotZero()
            .isEqualTo(55)
    }
}
