import java.io.File

class kola {


    fun imprimiendo(): List<String> {

        val readLines = File("file.txt").readLines()
        println("num lines: ${readLines.size}")

        return readLines

    }

}