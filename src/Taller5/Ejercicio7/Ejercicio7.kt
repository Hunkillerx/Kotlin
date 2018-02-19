package Taller5.Ejercicio7

class triangulo{
    private var ladoA = 0.0
    private var ladoB = 0.0
    private var ladoC = 0.0

    constructor(ladoA:Double,ladoB:Double,ladoC:Double){
        this.ladoA = ladoA
        this.ladoB = ladoB
        this.ladoC = ladoC
    }

    fun semiperimetro():Double{
        return (ladoA+ladoB+ladoC) / 2
    }

    fun area():Double{
        var s = semiperimetro()
        return Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC))
    }

    fun circumradius():Double{
        return (ladoA*ladoB*ladoC)/(4*Math.PI*area())
    }
}