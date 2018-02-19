package Taller5.Ejercicio7

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Ejercicio7Test{

    @Test
    fun prueba1(){
        var t1 = triangulo(2.0,2.0,2.0)
        assertEquals(3.0,t1.semiperimetro())
        assertEquals(1.7320508075688772,t1.area())
        assertEquals(0.3675525969478614,t1.circumradius())


    }
}