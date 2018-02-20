package Taller5.Ejercicio6

/**
 * Clase que representa los atributos que obtiene un Hexagono
 * @author Jose Diaz
 */
class hexagono{
    private var lado = 0.0
    private var ap = 0.0

    /**
     * Metodo constructor de la clase hexagono
     * @param lado: Valor de un lado del hexagono
     * @param ap: El apotema de un hexagono, La menor distancia entre el centro
     * y cualquiera de sus lados.
     */
    constructor(lado:Double,ap:Double){
        this.lado = lado
        this.ap = ap
    }

    /**
     * Metodo analizador que determina el valor del lado del hexagono
     * @return lado: Valor de un lado del hexagono
     */
    fun darLado():Double{
        return lado
    }

    /**
     * Metodo analizador que determina el apotema del hexagono
     * @return ap: apotema del hexagono
     */
    fun darApotema():Double{
        return ap
    }

    /**
     * Metodo analizador que obtiene el area de un hexagono
     * @return area: Area del hexagono
     */
    fun area():Double{
        return (6*lado*ap) / 2
    }
}