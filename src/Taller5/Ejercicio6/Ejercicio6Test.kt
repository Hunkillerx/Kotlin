package Taller5.Ejercicio6

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Ejercicio6Test{

    @Test
    fun prueba1(){
        var h = hexagono(4.0,2.0)
        assertEquals(4.0,h.darLado())
        assertEquals(2.0,h.darApotema())
        assertEquals(24.0,h.area())
    }
}