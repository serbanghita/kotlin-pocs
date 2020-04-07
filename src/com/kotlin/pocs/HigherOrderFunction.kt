package com.kotlin.pocs

fun main(args: Array<String>) {

    val p1 = MyProgram("CLI");
    p1.renderText("Hello everyone!") { t -> log(t) }

    val p2 = MyProgram("GUI");
    p2.renderText("Hello everyone!", ::log);

}

class MyProgram(val programName: String = "") {
    fun renderText(text: String, renderer: (text: String) -> Unit) {
        renderer("`$text` from $programName")
    }
}

fun log(message: String): Unit {
    println(message)
}