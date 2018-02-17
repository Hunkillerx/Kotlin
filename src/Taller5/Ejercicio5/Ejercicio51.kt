package Taller5.Ejercicio5

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Ejercicio5{

    @Test
    fun prueba1(){
        val a = avion(500_000,200_000,125_000)

        assertEquals(5_000_000,a.recolectadoPorTiquetes(1,10))

    }
}