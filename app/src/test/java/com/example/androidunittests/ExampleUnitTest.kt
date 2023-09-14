package com.example.androidunittests

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun TestEnglish() {
        val w = Words();
        val expected = "Hello"
        val actual = w.English()
        assertEquals(expected, actual)
    }
    @Test
    fun TestZulu() {
        val w = Words();
        val expected = "Sawubona"
        val actual = w.Zulu()
        assertEquals(expected, actual)
    }
    @Test
    fun TestXhosa() {
        val w = Words();
        val expected = "Hambo"
        val actual = w.Xhosa()
        assertEquals(expected, actual)
    }
    @Test
    fun TestFrench() {
        val w = Words();
            val expected = "Bonjour"
        val actual = w.French()
        assertEquals(expected, actual)
    }
    @Test
    fun TestSpanish() {
        val w = Words();
        val expected = "Ola"
        val actual = w.Spanish()
        assertEquals(expected, actual)
    }
}