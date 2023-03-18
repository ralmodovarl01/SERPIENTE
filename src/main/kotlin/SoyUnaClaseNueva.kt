class SoyUnaClaseNueva {

    var domingo: String


    constructor(domingo: String) {
        this.domingo = domingo
    }

    override fun toString(): String {
        return "SoyUnaClaseNueva(domingo='$domingo')"
    }


    fun hoyEsSabado(){
        this.domingo = "Hoy es domingo"
        println("HOla")
    }


}