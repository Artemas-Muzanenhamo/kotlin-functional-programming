package functional.programming.transformations

data class Book(
    val title: String,
    val author: Author
)

data class Author(
    val name: String,
    val surname: String
)
