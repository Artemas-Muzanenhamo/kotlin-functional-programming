package functional.programming.aggregation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CountExamplesTest {
    @Test
    fun `Get the maximum value in the list of numbers`() {
        val listOfNumbers = listOf(100, 2, 43, 632, 55, 334)

        val biggestValue = listOfNumbers.max()

        assertThat(biggestValue).isEqualTo(632)
    }

    @Test
    fun `Get the maximum value in a list of number list`() {
        val listsOfNumbers = listOf(listOf(100, 2, 43), listOf(78, 565, 76), listOf(67, 443, 98))

        val biggestValue = listsOfNumbers.flatten().max()

        assertThat(biggestValue).isEqualTo(565)
    }

    @Test
    fun `Get the maximum value in a list of ranges list`() {
        val listsOfNumbers = listOf(listOf(1000..2000), listOf(1..10), listOf(200..300), listOf(5..7))

        val biggestValue = listsOfNumbers
            .asSequence()
            .flatten()
            .flatten()
            .max()

        assertThat(biggestValue).isEqualTo(2000)
    }
}
