/*
 * Reto #9
 * CÓDIGO MORSE
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 */
fun main() {

    val naturalChair = "LAURA"
    val morseChair = decoder(naturalChair)

    println(morseChair)
    println(decoder(morseChair))
}

private fun decoder(input: String):String{

    var decodedInput = ""

    val naturalDict = mapOf("A" to ".—", "N" to "—.", "0" to "—————",
        "B" to "—...", "Ñ" to "——.——", "1" to ".————",
        "C" to "—.—.", "O" to "———", "2" to "..———",
        "CH" to "————", "P" to ".——.", "3" to "...——",
        "D" to "—..", "Q" to "——.—", "4" to "....—",
        "E" to ".", "R" to ".—.", "5" to ".....",
        "F" to "..—.", "S" to "...", "6" to "—....",
        "G" to "——.", "T" to "—", "7" to "——...",
        "H" to "....", "U" to "..—", "8" to "———..",
        "I" to "..", "V" to "...—", "9" to "————.",
        "J" to ".———", "W" to ".——", "." to ".—.—.—",
        "K" to "—.—", "X" to "—..—", "," to "——..——",
        "L" to ".—..", "Y" to "—.——", "?" to "..——..",
        "M" to "——", "Z" to "——..", "\"" to ".—..—.", "/" to "—..—.")

    val morseDict = mutableMapOf<String,String>()
    naturalDict.forEach {
        morseDict[it.value] = it.key
    }

    if (input.contains("[a-zA-Z0-9]".toRegex())){

        //natural

        var index = 0
        var ch = false

        input.uppercase().forEach { character ->

            if (!ch && character.toString() != " "){

                val nextIndex = index + 1

                if (character.toString() == "C" &&
                    nextIndex < input.length &&
                    input.uppercase()[nextIndex].toString() == "H"){

                    decodedInput += naturalDict["CH"]
                    ch = true
                } else {
                    decodedInput += naturalDict[character.toString()]
                }

                decodedInput += " "

            } else {

                if (!ch) decodedInput += " "

                ch = false
            }

            index++
        }
    }else if (input.contains(".") || input.contains("-")){

        //morse

        input.split(" ").forEach { word ->

            word.split(" ").forEach { symbols ->

                if (decodedInput.isNotEmpty()) decodedInput += morseDict[symbols]
            }

            decodedInput += " "
        }
    }

    return decodedInput
}