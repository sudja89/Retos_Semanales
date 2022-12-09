/*
 * Reto #6
 * INVIRTIENDO CADENAS
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
fun main() {
    println(reverser("HOLA"))
}
fun reverser(chair: String): String {
    val chairReversed = chair.reversed()
    return chairReversed
}


//fun main() {
//    println(reverse("Hola mundo"))
//    println(recursiveReverse("Hola mundo"))
//}
//
//private fun reverse(text: String): String {
//    val textCount = text.count() - 1
//    var reversedText = ""
//    for (index in 0..textCount) {
//        reversedText += text[textCount - index]
//    }
//    return reversedText
//}
//
//// Sin un bucle, mediante una función recursiva
//private fun recursiveReverse(text: String, index: Int = 0, reversedText: String = ""): String {
//    val textCount = text.count() - 1
//    var newReversedText = reversedText
//    newReversedText += text[textCount - index]
//    if (index < textCount) {
//        val newIndex = index + 1
//        newReversedText = recursiveReverse(text, newIndex, newReversedText)
//    }
//    return newReversedText
//}