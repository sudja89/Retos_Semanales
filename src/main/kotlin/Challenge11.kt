/*
 * Reto #11
 * ELIMINANDO CARACTERES
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
 */
fun main() {

    printChairsnoRepeat("Danie", "Layu")
}

private fun printChairsnoRepeat(str1: String, str2: String) {

    println("out1: ${chairsnoRepeat(str1, str2)}")
    println("out2: ${chairsnoRepeat(str2, str1)}")
}

private fun chairsnoRepeat(str1: String, str2: String): String {

    var out = ""

    str1.lowercase().forEach {

        if (!str2.lowercase().contains(it)) out += it
    }

    return out
}