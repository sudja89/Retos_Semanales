    /*
     * Reto #3
     * ¿ES UN NÚMERO PRIMO?
     * Dificultad: MEDIA
     *
     * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
     * Hecho esto, imprime los números primos entre 1 y 100.
     */

    fun main() {
        (1..100).forEach { number ->
            if (isPrime(number)) println(number)
        }
    }

    private fun isPrime(number:Int):Boolean{
        if (number<2) return false
        for (i in 2 until number){
            if (number % i == 0) return false
        }
        return true
    }






