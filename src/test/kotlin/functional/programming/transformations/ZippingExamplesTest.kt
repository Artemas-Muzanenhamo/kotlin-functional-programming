package functional.programming.transformations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ZippingExamplesTest {

    private val books = listOf(
        Book("harry potter")
    )

    private val authors = listOf(
        Author("joanne", "rowling")
    )

    @Test
    fun `Zip to create a list of Books with Authors`() {
        val booksWithAuthors = books.zip(authors)

        assertThat(booksWithAuthors)
            .containsExactly(Pair(books.first(), authors.first()))
    }
}
