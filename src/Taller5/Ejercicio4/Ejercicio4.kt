package Taller5.Ejercicio4

import kotlin.math.absoluteValue

/**
 * Clase paseo que es utilizada para la obtencion de los datos necesarios para el paseo de la universidad
 * principalmente los costos del paseo
 */
class paseo {
    private var gordos: Int = 0
    private var flacos: Int = 0
    private var numSillasporBus: Int = 0
    private var valorPlatoComida: Int = 0
    private var valorHabitacion: Int = 0
    private var numPersonaHabitacion: Int = 0
    private var numDiasDuracion: Int = 0

    /**
     * Metodo constructor de la clase
     *
     * @param gordos: Cantidad de estudiantes gordos que van al paseo
     * @param flacos: Cantidad de estudiantes flacos que van al paseo
     * @param numSillasporBus: Cantidad de sillas posibles en un bus
     * @param valorPlatoComida: Valor de costo de 1 plato de comida por estudiante
     * @param valorHabitacion: Valor del costo de la habitacion por dia de paseo
     * @param numPersonaHabitacion: Cantidad de personas que pueden ocupar 1 habitacion
     * @param numDiasDuracion: Numero de dias de duracion del paseo
     */
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

    // Metodos Analizadores

    /**
     * Metodo analizador que permite obtener la cantidad de buses necesarios para el paseo
     * @return nb: Cantidad de buses necesarios para el viaje
     */
    fun numBuses(): Int {
        var nb = (gordos * 2 + flacos) / numSillasporBus
        if ((gordos * 2 + flacos) % numSillasporBus != 0) {
            nb = nb + 1
        }
        return nb
    }

    /**
     * Metodo analizador que permite obtener el costo de los buses durante el viaje
     * @return costo total de los buses en el viaje
     */
    fun costoTotalBuses(valorAlquilerBus: Int): Int = //Solo si es una linea
            numBuses() * valorAlquilerBus * 2

    /**
     * Metodo analizador que permite obtener el costo de la comida durante el viaje
     * @return costo total de la comida durante el viaje
     */
    fun costoTotalComida(): Int {
        val costoDia = ((gordos * 5 + flacos * 3) * valorPlatoComida)
        val costoComidaTotal = costoDia * numDiasDuracion
        return costoComidaTotal
    }

    /**
     * Metodo analizador que permite obtener el numero de habitaciones necesarias
     * para el total de estudiantes
     * @return numero de habitaciones requeridas
     */
    fun numHabitaciones(): Int {
        var nh = (gordos + flacos) / numPersonaHabitacion
        if ((gordos + flacos) % numPersonaHabitacion != 0) {
            nh++
        }
        return nh
    }

    /**
     * Metodo analizador que permite obtener el costo total en habitaciones durante
     * to_do el viaje
     * @return costodia: Costo total por dia en habitaciones
     * @return costoTotalPaseo: Costo total por todos los dias del paseo en habitaciones
     */
    fun costoHabitaciones(): Pair<Int, Int> {
        val costoDia = valorHabitacion * numHabitaciones()
        val costoTotalPaseo = costoDia * numDiasDuracion

        return costoDia to costoTotalPaseo
    }

}


