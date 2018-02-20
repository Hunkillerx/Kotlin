package Taller5.Ejercicio1

import java.awt.Dimension
import kotlin.math.roundToInt

/**
 * Clase piramide, posee 3 atributos
 * @author Jose Diaz
 */
class piramide{
    private var dimensionb: Double = 0.0
    private var dimensionB: Double = 0.0
    private var h:Double = 0.0

    /**
     * Metodo constructor de la clase piramide
     *  @param dimensionb : Dimension del lado del cuadrado superior
     *  @param dimensionB : Dimension del lado del cuadrado inferior
     *  @param h : Altura del tronco
     */
    constructor(dimensionb:Double, dimensionB: Double, h:Double){
        this.dimensionb = dimensionb
        this.dimensionB = dimensionB
        this.h = h
    }

    //Metodos Analizadores

    /**
     * Metodo analizador que retorna la dimension b de la piramide
     * @return dimensionb: Dimension del lado del cuadrado superior
     */
    fun darDimensionb():Double{
        return dimensionb
    }

    /**
     * Metodo analizador que retorna la dimension B de la piramide
     * @return dimensionB: Dimension del lado del cuadrado inferior
     */
    fun darDimensionB():Double{
        return dimensionB
    }

    /**
     * Metodo analizador que retorna la altura de la piramide
     * @return h: Altura del tronco
     */
    fun darAltura():Double{
        return h
    }

    /**
     * Metodo analizador que retorna el area de la piramide utlizando
     * las dimensiones generales de la piramide
     * @return area: Area de la piramide
     */
    fun areaPiramide():Double{
        var promedio = (dimensionb * dimensionB) / 2
        var areaLado = promedio * h
        return areaLado * 4
    }

    /**
     * Metodo analizador que retonral el volumen de la piramide utilizando
     * las dimensiones generales de la piramide
     * @return volumen de la piramide
     */
    fun Volumen():Double {
        var s1 = dimensionB * dimensionB
        var s2 = dimensionb * dimensionb
        return (h/3)*(s1 + s2 + Math.sqrt((s1 * s2)))
    }
}