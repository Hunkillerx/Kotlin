package Taller5.Ejercicio3

class Cono {
    private var radioBase = 0.0
    private var altura = 0.0

    constructor(radioBase: Double, altura: Double) {
        this.radioBase = radioBase
        this.altura = altura
    }

    fun areaBase(): Double {
        return Math.PI * Math.pow(radioBase, 2.0)
    }

    fun volumenCono(): Double {
        return areaBase() * altura
    }

    fun volumenTroncoCono(alturaConoDeficiente: Double, radioConoDeficiente: Double): Double {
        var troncoCono = Cono(alturaConoDeficiente, radioConoDeficiente)
        if (alturaConoDeficiente > altura && radioConoDeficiente > radioBase) {
            return error("El cono deficiente es mas grande que el cono")
        }
        return volumenCono() - troncoCono.volumenCono()
    }
}