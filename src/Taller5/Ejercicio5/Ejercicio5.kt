package Taller5.Ejercicio5

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer

/**
 * Clase avion utilizada para modelar un avion asi como poder obtener datos de el.
 */
class avion{
    private var costoClase1 = 0
    private var costoClase2 = 0
    private var costoClase3 = 0

    /**
     * Metodo constructor de la clase avion
     * @param costoClase1 : Costo por tiquete de la clase 1 del avion
     * @param costoClase2 : Costo por tiquete de la clase 2 del avion
     * @param costoClase3 : Costo por tiquete de la clase 3 del avion
     */
    constructor(costoClase1: Int,costoClase2: Int,costoClase3: Int){
        this.costoClase1 = costoClase1
        this.costoClase2 = costoClase2
        this.costoClase3 = costoClase3
    }

    // Metodos Analizadores

    /**
     * Metodo analizador que obtiene los ingresos obtenidos por cada clase del avion
     * @param clase: clase del avion que puede ser 1,2 o 3.
     * @param numPasajeros: Cantidad de pasajeros que compraron un tiquete para la clase
     *
     * @return rpt: ingreso obtenido por la venta total de la clase
     * @exception Retorna error si la clase no existe. Osea si es diferente a 1 o 2 o 3
     */
    fun recolectadoPorTiquetes(clase : Int,numPasajeros:Int):Int{
        var rpt = 0
        if (clase == 1){
            rpt = costoClase1 * numPasajeros
        }else if (clase == 2){
            rpt = costoClase2 * numPasajeros
        }else if(clase == 3){
            rpt = costoClase3 * numPasajeros
        }else{
            Error("La clase no existe")
        }
        return rpt
    }

}