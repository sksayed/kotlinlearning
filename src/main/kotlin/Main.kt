fun main(args: Array<String>) {
    println("Hello World!")
    val c = Circle(4.0);
    println("perimeter is ${c.perimeter()}")
    fun Circle.area(): Double {
        return Math.PI * radius * radius;
    }
    println("Area is ${c.area()}")
}