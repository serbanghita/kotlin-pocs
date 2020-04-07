package com.kotlin.pocs

import java.math.BigInteger

fun main(args: Array<String>) {
    /**
        Exception in thread "main" java.lang.StackOverflowError
        at java.base/java.math.BigInteger.add(BigInteger.java:1309)
        at com.kotlin.pocs.FibonacciKt.fibonacci(Fibonacci.kt:10)
     */
    println(fibonacci(9999))
}

tailrec fun fibonacci(n: Int, a: BigInteger = BigInteger("1"), b: BigInteger = BigInteger("0")): BigInteger {
    return if (n == 0) b else fibonacci(n - 1, a + b, a)
}