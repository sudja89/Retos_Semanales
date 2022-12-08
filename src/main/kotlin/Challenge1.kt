/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y
 * retorne verdadero o falso (Boolean) según sean o no anagramas.
 *
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 *
 * NO hace falta comprobar que ambas palabras existan.
 *
 * Dos palabras exactamente iguales no son anagrama.
 */


fun main(){
   println( anagram("casa","saca"))
}

private fun anagram(fisrtWord:String,secondWord:String) :Boolean{
    if (fisrtWord.lowercase() == secondWord.lowercase()) return false
    return fisrtWord.lowercase().toCharArray().sortedArray().contentEquals(secondWord.lowercase().toCharArray().sortedArray())
}
