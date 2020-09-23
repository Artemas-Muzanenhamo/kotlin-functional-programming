package functional.programming.aggregation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RangeExamplesTest {
    @Test
    fun `Get the total sum in a list of numbers`() {
        val listOfNumbers : List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        val totalSum : Int = listOfNumbers.sum()

        assertThat(totalSum)
            .isNotZero()
            .isEqualTo(55)
    }

    @Test
    fun `Get the total sum of number in a range`() {
        val rangeOfNumbers : IntRange = 1..10

        val totalSum : Int = rangeOfNumbers.sum()

        assertThat(totalSum)
            .isNotZero()
            .isEqualTo(55)
    }
}
