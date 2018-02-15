package Taller5.Ejercicio1

import Taller5.Ejercicio1.piramide
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class piramideTest{

    @Test
    fun prueba1(){
        val p = piramide(5.0, 3.0, 2.0)

        assertEquals(5.0,p.darDimensionb())

        assertEquals(3.0,p.darDimensionB())

        assertEquals(2.0,p.darAltura())

        assertEquals(60.0,p.areaPiramide())

        assertEquals(32.666666666666664,p.Volumen())
    }
}