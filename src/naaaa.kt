fun main () {

    var a = Point()
    a.firstCoordinate = 2F
    a.secondCoordinate = 3F

    a.toString()

    var b = Point()
    b.firstCoordinate = 2F
    b.secondCoordinate = 3F
    println("y ღერძის მიმართ სიმეტრიულბის დროს კოორდინატები იქნება: ${a}, ")
    println(a==b)



}

class Point {

    var firstCoordinate: Float = 0F
    var secondCoordinate: Float = 0F

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (firstCoordinate == other.firstCoordinate && secondCoordinate == other.secondCoordinate) {
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "(${firstCoordinate} ; ${secondCoordinate})"
    }
    fun symethry() {
        firstCoordinate=-firstCoordinate //აქ რაღაც მაინც არ მიპრინტავს შეცვლილი ნიშნით, no idea
        return println ("y ღერძის მიმართ სიმეტრიულბის დროს კოორდინატები იქნება: ${firstCoordinate},${secondCoordinate} ")

    }





}

