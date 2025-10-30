package com.smart.app.domain

import com.smart.app.data.local.SumaService

class SumTwoNumUseCase() {
    val sumaService = SumaService()

    operator fun invoke(num1: Int, num2: Int): Int {
        return sumaService.sunNumero(num1, num2)
    }
}