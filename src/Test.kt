import org.testng.annotations.Test

@Test fun randomElementTest() {
    val array = arrayOf("a")
    assert(randomElement(array) == "a")
}