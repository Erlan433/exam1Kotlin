import kotlin.random.Random

fun main() {
    val randomString = generateRandomString(20)
    println(randomString)
}

fun generateRandomString(length: Int): String {
    val symbol = ('a' .. 'z') + ('A' .. 'Z') + ('0' .. '9') + listOf('"', '#', '$', '%', '&', "'", '(', ')',  '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_', '`', '{', '|', '}', '~')
    return (1 .. length).map { symbol.random(Random.Default) }.joinToString ("")
}