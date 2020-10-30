import kotlin.math.max
fun main() {

    var f1 = Fraction ()
    f1.numerator = 5F
    f1.denominator = 15F
    f1.simplify()
    println(f1)
    println(f1.toString())
    println(f1.simplify())




    var f2 = Fraction()
    f2.numerator = 2F
    f2.denominator = 4F

    println(f1==f2)

    println(f1)
//    println(f3)



}
class Fraction() {
    var numerator: Float = 0F
    var denominator: Float = 1F


    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator) {
                return true
            }

        }
        return false
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    fun simplify(): Float {
        var maximum = max(denominator, numerator)
        var d = 1
        for (i in maximum.toInt() downTo 0) {
            if (denominator.toInt() % i == 0 && numerator.toInt() % i == 0) {
                d = i
                break

            }
        }
        return d.toFloat()
    }
//    val max = d()
//    numerator = numerator / d
//    denominator = denominator / d
//    return numerator.toFloat(); denominator.toFloat()  (((Confused)))

    fun multiply(other:Fraction): Fraction {
        var f3= Fraction ()
        var x = numerator * other.numerator
        var y = denominator * other.denominator
        val F3 = Fraction()
        f3.numerator = x
        f3.denominator = y
        return f3

    }
    fun add(other:Fraction): Fraction {

        val x = (numerator * other.denominator) + (other.numerator * denominator)
        val y = other.denominator * denominator
        val f3 = Fraction()

        f3.numerator = x
        f3.denominator = y
        return f3
//        println(f3.add())
    }
}