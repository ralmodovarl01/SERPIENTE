import kotlin.random.Random

fun main(args: Array<String>) {
    var serpiente = Anfibio(Array(1){"n"})
    var edad : Int= 0
    var esCazada : Boolean = false


    while (serpiente.getEdad()<12 && !esCazada){

     var   mangosta : Int = Random.nextInt(1,10)

        if (mangosta>8){
             esCazada=true
            println("La serpiente a sido cazada por una mangosta")
        }
        if (!esCazada  && serpiente.getEdad()<=6 ){
            serpiente.aumentarTamano(serpiente.getColor())
            println(serpiente)
        }
        if (!esCazada && serpiente.getEdad()>6){
            serpiente.reducirTamano(serpiente.getColor())
            println(serpiente)
        }

        serpiente.getEdad()+1


    }

    println("HOla Ramón")

<<<<<<< HEAD
=======
    println("Modificacion en el main")

    println("tercera midificacion")

>>>>>>> master

    println("\n")
    println("la ${serpiente.getNombre()} a muerto a la edad de ${serpiente.getEdad()} años")

}
//otra linea

//serpiente.aumentarTamano(serpiente.getColor())