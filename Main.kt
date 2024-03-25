import java.io.FileInputStream
import java.io.InputStream


fun calculateFloor (inputStream: InputStream) : Int{
    var floor = 0
    var input = inputStream.read()
    while(input != -1) {
        val ch = input.toChar()
        if (ch == '(') {
            floor++
        } else if (ch == ')') {
            floor--
        }
        input = inputStream.read()
    }
    return floor
}

fun floorAtBasement (inputStream: InputStream) : Int{
    var floor = 0
    var counter = 0
    var input = inputStream.read()
    while(input != -1) {
        if (input.toChar() == '(') {
            floor++
        } else if (input.toChar() == ')') {
            floor--
        }
        counter ++
        if (floor == -1) break

        input = inputStream.read()
    }
    return counter
}
fun main() {
    val inputStream = FileInputStream("input.txt")
    val floor = calculateFloor(inputStream)
    println(floor)
    val counter = floorAtBasement(inputStream)
    inputStream.close()
}