package Taller5.Ejercicio2

import kotlin.math.roundToInt

/**
 * Clase viajeCamion que se utiliza para determinar costos y recorrido del camion en viajes de mercancia
 * @author Jose Diaz
 */
class viajeCamion {
    private var numKilosCapacidad = 0.0
    private var galonKm = 0.0

    /**
     * Metodo constructor de la clase viajeCamion
     * @param numKilosCapacidad : Capacidad total del camion en kilos
     * @param galonKm : Galones consumidos por un kilometro de recorrido
     */
    constructor(numKilosCapacidad: Double, galonKm: Double) {
        this.numKilosCapacidad = numKilosCapacidad
        this.galonKm = galonKm
    }

    //Metodos Analizadores

    /**
     *Metodo analizador que retorna la capacidad del camion en kilos
     * @return numKilosCapacidad: Capacidad total del camion en kilos
     */
    fun darCapacidad(): Double {
        return numKilosCapacidad
    }

    /**
     * Metodo analizador que retorna la cantidad de galones que consume
     * el camion en 1 kilometro
     * @return galonKm: cantidad de galones consumidos por kilometros
     */
    fun darGalonKm(): Double {
        return galonKm
    }

    /**
     * Metodo analizador que retorna los numeros de viajes necesarios para
     * completar el viaje asi como los galones necesarios para toda la
     * cantidad de viajes necesarios
     *
     * @param kmsViaje: Kilometros hasta el destino del viaje
     * @param cantidadCarga: Cantidad de carga total por transportar
     *
     * @return numViajes: Numero de viajes necesarios para entregar el total de carga
     * @return galonesPorViaje: Galones de gasolina necesarios para completar la
     * cantidad de viajes necesarios
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