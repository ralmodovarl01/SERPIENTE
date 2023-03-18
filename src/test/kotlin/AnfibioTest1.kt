import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

internal class AnfibioTest1 {

    @DisplayName("En este test se compara el nombre que" +
            "le damos actualmente al test junto con el que " +
            "relmente tiene predefinido")
    @Test
    fun getNombre() {
    }


    @DisplayName("Comparamos las edades de la serpiente")
    @Test
    fun getEdad() {

        var esperado = Anfibio(15,"crotalus")
        var resultado = Anfibio(15,"crotalus")
        Assertions.a
    }

    @Test
    fun getColor() {
    }
}