/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de
 * números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 */

fun main() {
    fibonacci()
}

private fun fibonacci() {
    var number:Long = 0
    var number2:Long = 1


    for (x in 0 until 50) {
        println("${x} - ${number}")
        var aux = number + number2
        number = number2
        number2 = aux
    }
}
