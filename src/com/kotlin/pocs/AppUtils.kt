package com.kotlin.pocs

fun compareNumbers(a: Int, b: Int): Int = if (a > b) a else b
@JvmOverloads
fun log(message: String, level: Int = 0): Unit = println("$message Log: $level")