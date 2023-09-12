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
    fun IWillFail() {
        assertEquals("Jack", "jack")
    }
    @Test
    fun TestXhosa() {
        val w = Words();
        val expected = "Hambo"
        val actual = w.Xhosa()
        assertEquals(expected, actual)
    }
    @Test
    fun TestAfrikaans() {
        val w = Words();
        val expected = "Kak"
        val actual = w.Afri()
        assertEquals(expected, actual)
    }
    @Test
    fun TestEnglish() {
        val w = Words();
        val expected = "Crap"
        val actual = w.English()
        assertEquals(expected, actual)
    }
}