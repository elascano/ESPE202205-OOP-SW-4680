data class Course(
    val code: String,
    val name: String
)
{
    // using toString() method
    override fun toString(): String {
        return "Course(code='$code', name='$name')"
    }
}
