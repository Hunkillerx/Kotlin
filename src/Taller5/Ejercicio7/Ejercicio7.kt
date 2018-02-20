package Taller5.Ejercicio7

/**
 * Clase que modela un triangulo y sus principales atributos
 * @author Jose Diaz
 */
class triangulo{
    private var ladoA = 0.0
    private var ladoB = 0.0
    private var ladoC = 0.0

    /**
     * Metodo constructor de la clase triangulo
     * @param ladoA: Valor del ladoA del triangulo
     * @param ladoB: Valor del ladoB del triangulo
     * @param ladoC: Valor del ladoC del triangulo
     */
    constructor(ladoA:Double,ladoB:Double,ladoC:Double){
        this.ladoA = ladoA
        this.ladoB = ladoB
        this.ladoC = ladoC
    }

    /**
     * Metodo analizador que determina el semiperimetro de un triangulo
     * @return semiperimetro: Valor del semiperimetro del triangulo
     */
    fun semiperimetro():Double{
        return (ladoA+ladoB+ladoC) / 2
    }

    /**
     * Metodo analizador que determina el area del triangulo segun sus lados
     * y el semiperimetro
     *
     * @return area: Area del triangulo
     */
    fun area():Double{
        var s = semiperimetro()
        return Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC))
    }

    /**
     * Metodo analizador que determina el circumradius del trinagulo
     *
     * @return circumradius: valor del circumradium del triangulo
     */
    fun circumradius():Double{
        return (ladoA*ladoB*ladoC)/(4*Math.PI*area())
    }
}