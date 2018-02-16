package Taller5.Ejercicio2

import kotlin.math.roundToInt

class viajeCamion {
    private var numKilosCapacidad = 0.0
    private var galonKm = 0.0

    constructor(numKilosCapacidad: Double, galonKm: Double) {
        this.numKilosCapacidad = numKilosCapacidad
        this.galonKm = galonKm
    }

    fun darCapacidad(): Double {
        return numKilosCapacidad
    }

    fun darGalonKm(): Double {
        return galonKm
    }


    fun numViajesGalones(kmsViaje: Double, cantidadCarga: Double): Pair<Int, Double> {
        var numViajes = cantidadCarga / numKilosCapacidad
        if (cantidadCarga % numKilosCapacidad != 0.0) {
            numViajes++
        }
        var galonesPorViaje = ((numViajes * kmsViaje) * 2) * galonKm

        return numViajes.roundToInt() to galonesPorViaje
    }


}