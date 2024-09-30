
fun main() {

    //easy level question : Length Of Last Word

    var s = "   Hello   Worldddddd   "
    var words = s.reversed().trim().split(" ").filter { it.isNotBlank() }[0].length
    print(words)
}