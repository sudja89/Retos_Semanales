/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

fun main() {

    area(Triangle(15.2,2.2))
    area(Rectangle(25.6,2.0))
    area(Square(5.0))
}

interface Polygon {

    fun area():Double
    fun printArea()
}

data class Triangle(val base: Double, val height: Double) : Polygon {

    override fun area(): Double {
        return (base * height) / 2
    }

    override fun printArea() {
        println("El área del triángulo es ${area()}")
    }
}

data class Rectangle(val length: Double, val width: Double) : Polygon {

    override fun area(): Double {
        return (length * width)
    }

    override fun printArea() {
        println("El área del rectángulo es ${area()}")
    }
}

data class Square(val side:Double):Polygon{

    override fun area(): Double {
        return (side * side)
    }

    override fun printArea() {
        println("El área del cuadrado es ${area()}")
    }
}

private fun area(polygon:Polygon):Double{

    polygon.printArea()
    return polygon.area()
}