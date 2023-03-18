open class Anfibio {
    private var especie : String
    private var edad : Int = 1
    private var color : Array<String> = Array(1){" "}
    private var estaViva : Boolean

    constructor(esp:String,ed:Int,co:Array<String>,live:Boolean){
        this.edad=ed
        this.especie=esp
        this.color= Array(1){"n"}
        this.estaViva=live
    }

    constructor(especie: String) {
        this.especie = "Crotalus"
        this.edad= 1
        this.color= Array(1){"n"}
        this.estaViva= true
    }

    constructor(ed: Int,co: String){
        this.edad=ed
        this.color=Array(edad){"n"}
        this.especie = "Crotalus"
        this.estaViva= true
    }

    constructor(cl:Array<String>){
        this.color= Array(1){"n"}
        this.estaViva= true
        this.especie = "Crotalus"
    }

    //get->devuelve
    //set->colocar

    public fun getNombre():String{
      return  this.especie
    }

    public fun getEdad():Int{
        return this.edad
    }

    public fun setEdad(ed:Int){
        this.edad=ed
    }

    private fun getLoEsta(): String {
        return "esta viva"
    }

    public fun getColor(): Array<String> {
        return this.color
    }


    public fun aumentarTamano(color: Array<String>) : Array<String> {

        this.color  = Array(this.color.size+1){"n"}

        return this.color
    }


    public fun reducirTamano(color: Array<String>) : Array<String>{

        this.color = Array(this.color.size-1){"n"}
        return this.color
    }



    override fun toString(): String {
        return "Cobra:${this.color.contentToString()}"
    }
}