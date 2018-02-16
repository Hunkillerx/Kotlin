package Taller5.Ejercicio2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class viajeCamionTest{

    @Test
    fun prueba1(){

        val c = viajeCamion(2000.0,6.0)

        assertEquals(2000.0,c.darCapacidad())

        assertEquals(6.0,c.darGalonKm())

        val (a,b) = c.numViajesGalones(100.4,20000.0)
        assertEquals(10,a)
        assertEquals(12048.0,b)

    }
}