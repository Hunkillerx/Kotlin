package Taller5.Ejercicio4

import kotlin.math.absoluteValue

//constructor
class paseo {
    private var gordos: Int = 0
    private var flacos: Int = 0
    private var numSillasporBus: Int = 0
    private var valorPlatoComida: Int = 0
    private var valorHabitacion: Int = 0
    private var numPersonaHabitacion: Int = 0
    private var numDiasDuracion: Int = 0

    constructor(gordos: Int, flacos: Int, numSillasporBus: Int, valorPlatoComida: Int, valorHabitacion: Int,
                numPersonaHabitacion: Int, numDiasDuracion: Int) {
        this.gordos = gordos
        this.flacos = flacos
        this.numSillasporBus = numSillasporBus
        this.valorPlatoComida = valorPlatoComida
        this.valorHabitacion = valorHabitacion
        this.numPersonaHabitacion = numPersonaHabitacion
        this.numDiasDuracion = numDiasDuracion
    }

    //Hallar numero buses
    fun numBuses(): Int {
        var nb = (gordos * 2 + flacos) / numSillasporBus
        if ((gordos * 2 + flacos) % numSillasporBus != 0) {
            nb = nb + 1
        }
        return nb
    }

    fun costoTotalBuses(valorAlquilerBus: Int): Int = //Solo si es una linea
            numBuses() * valorAlquilerBus * 2

    fun costoTotalComida(): Int {
        val costoDia = ((gordos * 5 + flacos * 3) * valorPlatoComida)
        val costoComidaTotal = costoDia * numDiasDuracion
        return costoComidaTotal
    }

    fun numHabitaciones(): Int {
        var nh = (gordos + flacos) / numPersonaHabitacion
        if ((gordos + flacos) % numPersonaHabitacion != 0) {
            nh++
        }
        return nh
    }

    var n = -1

    fun costoHabitaciones(): Pair<Int, Int> {
        val costoDia = valorHabitacion * numHabitaciones()
        val costoTotalPaseo = costoDia * numDiasDuracion

        return costoDia to costoTotalPaseo
    }

}


