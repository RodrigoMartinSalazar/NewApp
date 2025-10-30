package com.smart.app.domain

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class SumTest {


    private lateinit var sumTwoNumUseCase: SumTwoNumUseCase

    @Before
    fun setup() {
        sumTwoNumUseCase = SumTwoNumUseCase()
    }

    @Test
    fun `cuando se suman dos numeros positivos deberia devolver la suma correcta`() {
        val resultado = sumTwoNumUseCase(3, 5)
        assertEquals(8, resultado)
    }

    @Test
    fun `cuando se suman numeros negativos deberia devolver la suma correcta`() {
        val resultado = sumTwoNumUseCase(-4, -6)
        assertEquals(-10, resultado)
    }

    @Test
    fun `cuando se suman un numero positivo y uno negativo deberia devolver la suma correcta`() {
        val resultado = sumTwoNumUseCase(10, -4)
        assertEquals(6, resultado)
    }

    @Test
    fun `cuando se suma cero no deberia alterar el resultado`() {
        val resultado = sumTwoNumUseCase(7, 0)
        assertEquals(7, resultado)
    }
}