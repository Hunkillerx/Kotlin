package Taller5.Ejercicio3

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class troncoConoTest{

    @Test
    fun prueba1(){

       val c = Cono(4.0,2.0)

        assertEquals(50.26548245743669,c.areaBase())

        assertEquals(100.53096491487338,c.volumenCono())

        assertEquals(98.96016858807849,c.volumenTroncoCono(1.0,0.5))
    }
}
