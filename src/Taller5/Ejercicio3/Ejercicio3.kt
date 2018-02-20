package Taller5.Ejercicio3

/**
 * Clase Cono que representa un cono y sus respectivos atributos.
 * @author Jose Diaz
 */
class Cono {
    private var radioBase = 0.0
    private var altura = 0.0

    /**
     * Metodo construsctor de la clase Cono
     * @param radioBase: Radio de la base del cono
     * @param altura: Altura del cono
     */
    constructor(radioBase: Double, altura: Double) {
        this.radioBase = radioBase
        this.altura = altura
    }
    // Metodos Analizadores

    /**
     * Metodo analizador que retorna el Radio de la base del cono
     * @return radioBase : Devuelve el radio de la base del cono
     */
    fun darRadio() = radioBase

    /**
     * Metodo analizador que retorna la altura del cono
     * @return altura : Devuelve la altura del cono
     */
    fun darAltura() = altura
    /**
     * Metodo analizador que retorna el area de la base del cono
     * @return areaBase : Area de la base del cono
     */
    fun areaBase(): Double {
        return Math.PI * Math.pow(radioBase, 2.0)
    }

    /**
     * Metodo analizador que retorna el volumen del cono
     * @return volumenCono: Volumen total del cono
     */
    fun volumenCono(): Double {
        return areaBase() * altura
    }

    /**
     * Metodo analizador que retorna el volumen del Tronco del cono
     * El tronco del cono es la figura restante al cortar el cono en 2 partes
     *
     * @param alturaConoDeficiente:Altura del cono deficiente obtenido
     * @param radioConoDeficiente:Radio del cono deficiente obtenido
     *
     * @return volumenCono : Volumen del tronco del cono
     * @exception "El cono deficiente es mas grande que el cono" este error sucede
     * cuando el cono deficiente es mas grande que el cono.
     */

    fun volumenTroncoCono(alturaConoDeficiente: Double, radioConoDeficiente: Double): Double {
        var troncoCono = Cono(alturaConoDeficiente, radioConoDeficiente)
        if (alturaConoDeficiente > altura && radioConoDeficiente > radioBase) {
            return error("El cono deficiente es mas grande que el cono")
        }
        return volumenCono() - troncoCono.volumenCono()
    }
}