import java.io.File


fun imprimiendo(): List<String> {

    val readLines = File("file.txt").readLines()
    println("num lines: ${readLines.size}")

    return readLines

}