package Taller5.Ejercicio6

class hexagono{
    private var lado = 0.0
    private var ap = 0.0

    constructor(lado:Double,ap:Double){
        this.lado = lado
        this.ap = ap
    }

    fun darLado():Double{
        return lado
    }

    fun darApotema():Double{
        return ap
    }

    fun area():Double{
        return (6*lado*ap) / 2
    }
}