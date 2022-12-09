/*
 * Reto #8
 * DECIMAL A BINARIO
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario
 * sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */
fun main() {
    println(decimalToBinary(256))
    println(decimalToBinary(128))
    println(decimalToBinary(0))
    println(decimalToBinary(1))

}

fun decimalToBinary(decimal: Int): String {

    var number = decimal
    var binary = ""

    while (number != 0) {

        var reminder = number % 2
        number /= 2

        binary = "$reminder$binary"
    }

    return binary.ifEmpty { "0" }
}