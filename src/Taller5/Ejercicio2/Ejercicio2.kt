package Taller5.Ejercicio2

import kotlin.math.roundToInt

/**
 * Clase viajeCamion que se utiliza para determinar costos y recorrido del camion en viajes de mercancia
 * @param numKilosCapacidad : Double
 * @param galonKm : Double
 * @author Jose Diaz
 */
class viajeCamion {
    private var numKilosCapacidad = 0.0
    private var galonKm = 0.0

    /**
     * Metodo constructor de la clase viajeCamion
     */
    constructor(numKilosCapacidad: Double, galonKm: Double) {
        this.numKilosCapacidad = numKilosCapacidad
        this.galonKm = galonKm
    }

    //Metodos Analizadores

    /**
     *Metodo analizador que retorna la capacidad del camion en kilos
     * @return numKilosCapacidad:Double
     */
    fun darCapacidad(): Double {
        return numKilosCapacidad
    }

    /**
     * Metodo analizador que retorna la cantidad de galones que consume
     * el camion en 1 kilometro
     * @return galonKm:Double
     */
    fun darGalonKm(): Double {
        return galonKm
    }

    /**
     * Metodo analizador que retorna los numeros de viajes necesarios para
     * completar el viaje asi como los galones necesarios para toda la
     * cantidad de viajes necesarios
     *
     * @param kmsViaje:Double
     * @param cantidadCarga: Double
     *
     * @return numViajes: Int
     * @return galonesPorViaje: Double
     */
    fun numViajesGalones(kmsViaje: Double, cantidadCarga: Double): Pair<Int, Double> {
        var numViajes = cantidadCarga / numKilosCapacidad
        if (cantidadCarga % numKilosCapacidad != 0.0) {
            numViajes++
        }
        var galonesPorViaje = ((numViajes * kmsViaje) * 2) * galonKm

        return numViajes.roundToInt() to galonesPorViaje
    }


}