package Taller5.Ejercicio4

import Taller5.Ejercicio4.paseo
import org.junit.jupiter.api.Assertions.*

internal class ejercicio4Test {

    @org.junit.jupiter.api.Test

    fun prueba1() {
        val p = paseo(20, 40, 50, 2000, 20000, 4, 5)

        assertEquals(2, p.numBuses())

        assertEquals(320000, p.costoTotalBuses(80000))

        assertEquals(2200000, p.costoTotalComida())

        assertEquals(15, p.numHabitaciones())

        val (a, b) = p.costoHabitaciones()
    }
}