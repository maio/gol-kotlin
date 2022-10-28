package cz.maio.gameoflife

class App {
    val greeting: String
        get() {
            return "Hello World! :)"
        }
}

fun main() {
    println(App().greeting)
}
