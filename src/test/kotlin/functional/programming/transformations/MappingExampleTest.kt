package functional.programming.transformations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MappingExampleTest {
    @Test
    fun `Should return a list of Authors names given an Author Object`() {
        val artemas = Author("artemas", "prime")
        val kobe = Author("kobe", "bryant")
        val james = Author("james", "harden")
        val authors = listOf(artemas, kobe, james)

        val names = authors.map { it.name }

        assertThat(names)
            .containsExactly("artemas", "kobe", "james")
    }
}