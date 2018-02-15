package Taller5.Ejercicio2

class viajeCamion{
    private var numKilosCapacidad = 0.0
    private var galonKm = 0.0

    constructor(numKilosCapacidad:Double,galonKm:Double){
        this.numKilosCapacidad = numKilosCapacidad
        this.galonKm = galonKm
    }

    fun darCapacidad():Double{
        return numKilosCapacidad
    }


}