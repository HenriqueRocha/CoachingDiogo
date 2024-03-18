import java.io.FileInputStream
import java.io.InputStream


fun calculateFloor (inputStream: InputStream) : Int{
    var floor = 0
    var input = inputStream.read()
    while(input != -1) {
        if (input.toChar() == '(') {
            floor++
        } else if (input.toChar() == ')') {
            floor--
        }
        input = inputStream.read()
    }
    return floor
}

fun main() {
    val inputStream = FileInputStream ("input.txt")
    val floor = calculateFloor (inputStream)
    println(floor)
    inputStream.close()
}