package functional.programming.transformations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AssociationExampleTest {

    @Test
    fun `Should associate the length of words with the values in the given list`() {
        val numbers = listOf("one", "two", "three", "four")

        val listOfNumbersAssociated = numbers.associateWith { it.length }

        val expectedResult = mapOf(Pair("four", 4), Pair("one", 3), Pair("three", 5), Pair("two", 3))
        assertThat(listOfNumbersAssociated).isEqualTo(expectedResult)
    }
}