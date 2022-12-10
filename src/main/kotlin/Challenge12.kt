import java.text.Normalizer

/*
 * Reto #12
 * ¿ES UN PALÍNDROMO?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba un texto y retorne verdadero o falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 */
fun main() {

    println(isPalindrome("Ana lleva al oso la avellana."))
}

private fun isPalindrome(chair: String): Boolean {

    val normalizedChair = Normalizer.normalize(chair.lowercase(), Normalizer.Form.NFD)
        .replace("[^\\p{ASCII}]".toRegex(), "")
        .replace("[^a-z0-9]".toRegex(), "")

    return normalizedChair == normalizedChair.reversed()
}