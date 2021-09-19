import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

internal class MaxSequenceKtTest {
    @Test
    fun `it should work on an empty list`() {
        assertEquals(0, maxSequence(emptyList()))
    }

    @Test
    fun `it should work on the example`() {
        assertEquals(6, maxSequence(listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    }

    @Test
    fun `it should work with all negatives`() {
        assertEquals(0, maxSequence(listOf(-2, -1, -2)))
    }

    @Test
    fun `it should work with single`() {
        assertEquals(4, maxSequence(listOf(4)))
    }

    @Test
    fun `it should work with all positive`() {
        assertEquals(5, maxSequence(listOf(1, 1, 1, 2)))
    }

    @Test
    fun `it should run custom test`() {
        assertEquals(60, maxSequence(listOf(-1, -1, -1, -1, 60, -1, -1, -1, -1)))
        assertEquals(80, maxSequence(listOf(0, 1, -1, 0, 60, -60, 10, 20, 40, 10, -40)))
    }

    @OptIn(ExperimentalTime::class)
    @Test
    fun benchmark() {
        val list = List(4_000_00) { if (it == 2_000_001 || it == 2_000_101) 1 else -1 }
        println("maxSequencePerformant: ${measureTime { maxSequencePerformant(list) }}")
        println("maxSequence: ${measureTime { maxSequence(list) }}")
    }

}