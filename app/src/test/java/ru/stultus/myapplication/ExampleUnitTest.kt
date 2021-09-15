package ru.stultus.myapplication


import org.junit.Assert.assertEquals
import org.junit.Test

class ExampleUnitTest {

    private val minMax = MinMax()

    @Test
    fun checkMinBetween1And3() {
        val first = 1
        val second = 3
        val expected = 3

        val actual = minMax.min(first, second)

        assertEquals(expected, actual)
    }

    @Test
    fun checkMinBetween3And3() {
        val first = 3
        val second = 3
        val expected = 3

        val actual = minMax.min(first, second)

        assertEquals(expected, actual)
    }

    @Test
    fun checkMinBetween10And6() {
        val first = 10
        val second = 6
        val expected = 6

        val actual = minMax.min(first, second)

        assertEquals(expected, actual)
    }

    @Test
    fun checkMinBetweenMinus3And3() {
        val first = -3
        val second = 3
        val expected = -3

        val actual = minMax.min(first, second)

        assertEquals(expected, actual)
    }

    @Test
    fun checkMaxBetween1And3() {
        val first = 1
        val second = 3
        val expected = 3

        val actual = minMax.max(first, second)

        assertEquals(expected, actual)
    }

    @Test
    fun checkMaxBetween3And3() {
        val first = 3
        val second = 3
        val expected = 3

        val actual = minMax.max(first, second)

        assertEquals(expected, actual)
    }

    @Test
    fun checkMaxBetween10And6() {
        val first = 10
        val second = 6
        val expected = 10

        val actual = minMax.max(first, second)

        assertEquals(expected, actual)
    }

    @Test
    fun checkMaxBetweenMinus3And3() {
        val first = -3
        val second = 3
        val expected = 3

        val actual = minMax.max(first, second)

        assertEquals(expected, actual)
    }
}