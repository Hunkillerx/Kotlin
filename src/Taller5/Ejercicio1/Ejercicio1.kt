package Taller5.Ejercicio1

import java.awt.Dimension
import kotlin.math.roundToInt

/**
 * Creacion de la clase piramide, posee 3 atributos
 *  - Dimension
 */
class piramide{
    private var dimensionb: Double = 0.0
    private var dimensionB: Double = 0.0
    private var h:Double = 0.0

    constructor(dimensionb:Double, dimensionB: Double, h:Double){
        this.dimensionb = dimensionb
        this.dimensionB = dimensionB
        this.h = h
    }

    fun darDimensionb():Double{
        return dimensionb
    }

    fun darDimensionB():Double{
        return dimensionB
    }

    fun darAltura():Double{
        return h
    }

    fun areaPiramide():Double{
        var promedio = (dimensionb * dimensionB) / 2
        var areaLado = promedio * h
        return areaLado * 4
    }

    fun Volumen():Double {
        var s1 = dimensionB * dimensionB
        var s2 = dimensionb * dimensionb
        return (h/3)*(s1 + s2 + Math.sqrt((s1 * s2)))
    }
}