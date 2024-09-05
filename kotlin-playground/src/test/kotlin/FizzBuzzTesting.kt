import org.example.functional_prog.fizzBuzz
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTesting {

    @Test
    fun returnNumberForNotDivisibleBy3or5() {
        val res = fizzBuzz(1)
        assertEquals(listOf("1"), res)
    }

    @Test
    fun returnNumberForDivisibleBy3() {
        val res = fizzBuzz(3)
        assertEquals(listOf("1", "2", "Fizz"), res)
    }
}