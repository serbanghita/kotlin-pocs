package com.kotlin.pocs

fun main(args: Array<String>) {

    val n1 = listOf(1,2,3,4,5,6,7);
    val n2 = n1.filter { it % 2 == 0 }.map { it * 2 }

    println(n1)
    println(n2)

    val m1 = mapOf("first" to 1, "second" to 2, "third" to 3, "fourth" to 4, "fifth" to 5)
    val m2 = m1.filter { (key, value) -> value % 2 == 0 }

    println(m2)
}