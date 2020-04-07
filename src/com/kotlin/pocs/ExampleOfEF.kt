package com.kotlin.pocs

class Example {
    fun getName(): String = "name"
}

fun Example.getName2(): String = "other ${this.getName()}"

fun main(args: Array<String>) {
    val e = Example()
    println(e.getName())
    e.getName2()
    println(e.getName2())
}

