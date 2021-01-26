package functional.programming.transformations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FlatteningExampleTest {
    @Test
    fun `Should return sum of all numbers`() {
        val firstNumberSet = listOf(10, 20, 30)
        val secondNumberSet = listOf(100, 90, 80)
        val thirdNumberSet = listOf(40, 60, 50)
        val numbers = listOf(firstNumberSet, secondNumberSet, thirdNumberSet)

        val sum = numbers.flatten().sum()

        assertThat(sum)
            .isEqualTo(480)
    }
}