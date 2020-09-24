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
    fun `Zip to create a list of Pairs containing Books with Authors`() {
        val booksWithAuthors: List<Pair<Book, Author>> = books.zip(authors)

        assertThat(booksWithAuthors)
            .first()
            .isEqualTo(Pair(books.first(), authors.first()))
    }
}
