package doublecola

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.jupiter.api.assertAll

internal class DoubleColaKtTest {
    @Test
    fun testWhoIsNext() {
        val names = listOf("Sheldon", "Leonard", "Penny", "Rajesh", "Howard")
        assertAll(
            { shouldReturn("Sheldon", names, 1) },
            { shouldReturn("Leonard", names, 2) },
            { shouldReturn("Penny", names, 3) },
            { shouldReturn("Rajesh", names, 4) },
            { shouldReturn("Howard", names, 5) },

            { shouldReturn("Sheldon", names, 6) },
            { shouldReturn("Sheldon", names, 7) },
            { shouldReturn("Leonard", names, 8) },
            { shouldReturn("Leonard", names, 9) },
            { shouldReturn("Penny", names, 10) },
            { shouldReturn("Penny", names, 11) },
            { shouldReturn("Rajesh", names, 12) },
            { shouldReturn("Rajesh", names, 13) },
            { shouldReturn("Howard", names, 14) },
            { shouldReturn("Howard", names, 15) },

            { shouldReturn("Sheldon", names, 16) },
            { shouldReturn("Sheldon", names, 17) },
            { shouldReturn("Sheldon", names, 18) },
            { shouldReturn("Sheldon", names, 19) },
            { shouldReturn("Leonard", names, 20) },
            { shouldReturn("Leonard", names, 21) },
            { shouldReturn("Leonard", names, 22) },
            { shouldReturn("Leonard", names, 23) },
            { shouldReturn("Penny", names, 24) },
            { shouldReturn("Penny", names, 25) },
            { shouldReturn("Penny", names, 26) },
            { shouldReturn("Penny", names, 27) },
            { shouldReturn("Rajesh", names, 28) },
            { shouldReturn("Rajesh", names, 29) },
            { shouldReturn("Rajesh", names, 30) },
            { shouldReturn("Rajesh", names, 31) },
            { shouldReturn("Howard", names, 32) },
            { shouldReturn("Howard", names, 33) },
            { shouldReturn("Howard", names, 34) },
            { shouldReturn("Howard", names, 35) },

            { shouldReturn("Sheldon", names, 36) },
            { shouldReturn("Sheldon", names, 37) },
            { shouldReturn("Sheldon", names, 38) },
            { shouldReturn("Sheldon", names, 39) },
            { shouldReturn("Sheldon", names, 40) },
            { shouldReturn("Sheldon", names, 41) },
            { shouldReturn("Sheldon", names, 42) },
            { shouldReturn("Sheldon", names, 43) },
            { shouldReturn("Leonard", names, 44) },
            { shouldReturn("Leonard", names, 45) },
            { shouldReturn("Leonard", names, 46) },
            { shouldReturn("Leonard", names, 47) },
            { shouldReturn("Leonard", names, 48) },
            { shouldReturn("Leonard", names, 49) },
            { shouldReturn("Leonard", names, 50) },
            { shouldReturn("Leonard", names, 51) },
            { shouldReturn("Penny", names, 52) }
        )
    }

    fun shouldReturn(expected: String, names: List<String>, n: Int) =
        assertEquals("For $n with $names", expected, whoIsNext(names, n))
}