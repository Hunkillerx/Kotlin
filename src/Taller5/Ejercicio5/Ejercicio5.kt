package Taller5.Ejercicio5

class Avion{
    private var costoClase1 = 500_000
    private var costoClase2 = 200_000
    private var costoClase3 = 125_000

    constructor(costoClase1: Int,costoClase2: Int,costoClase3: Int){
        this.costoClase1 = costoClase1
        this.costoClase2 = costoClase2
        this.costoClase3 = costoClase3
    }

    fun recolectadoPorTiquetes(clase : Int,numPasajeros:Int):Int{
        var rpt = 0
        if (clase == 1){
            rpt = costoClase1 * numPasajeros
        }else if (clase == 2){
            rpt = costoClase2 * numPasajeros
        }else if(clase == 3){
            rpt = costoClase3 * numPasajeros
        }else{
            println("La clase no existe")
        }
        return rpt
    }
}