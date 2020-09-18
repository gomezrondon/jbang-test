import java.io.File


fun imprimiendo(filePath: String): List<String> {

    val readLines = File(filePath).readLines()
    println("num lines: ${readLines.size}")

    return readLines

}