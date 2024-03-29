package com.example.myapplication

import com.example.myapplication.Math
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    var math: Math?=null

    @Before
    fun init (){
        math= Math()
    }

    @Test
    fun simpleAddTest(){
        assertEquals("4", math?.add("2", "2"))
    }

    @Test
    fun doubleAddTest(){
        assertEquals("4.0", math?.add("2.0","2"))

    }
    @Test
    fun negativeAddTest(){
        assertEquals("0.0", math?.add("-2.0", "2"))
    }
    @Test
    fun symbolAddTest(){
        assertEquals("symbols cannot be use", math?.add("$", "2"))
    }
    @Test
    fun spaceAddTest(){
        assertEquals("symbols cannot be use", math?.add("2", " "))
    }
    @Test
    fun simpleDivide(){
        assertEquals("6", math?.divide("12","2"))
    }
    @Test
    fun zeroDivide(){
        assertEquals("cannot be divided by 0", math?.divide("12","0"))
    }




    @After
    fun detach(){
        math = null

    }
}