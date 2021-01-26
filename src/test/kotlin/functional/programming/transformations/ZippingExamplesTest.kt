package functional.programming.transformations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ZippingExamplesTest {

    private val books = listOf(
        Book("harry potter"),
        Book("artemas the great")
    )

    private val authors = listOf(
        Author("joanne", "rowling"),
        Author("artemas", "prime")
    )

    @Test
    fun `Zip to create a list of Pairs containing Books with Authors`() {
        val booksWithAuthors: List<Pair<Book, Author>> = books.zip(authors)

//         RESULT:
//        [
//            (Book(title = harry potter), Author(name = joanne, surname = rowling)),
//            (Book(title = artemas the great), Author(name = artemas, surname = prime))
//        ]
        assertThat(booksWithAuthors)
            .containsExactly(
                Pair(books.first(), authors.first()),
                Pair(books.last(), authors.last())
            )
    }
}
