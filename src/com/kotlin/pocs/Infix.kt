package com.kotlin.pocs

fun main(args: Array<String>) {
    val h1 = Header("h1");
    val h2 = Header("h2");
    val h3 = Header("h3");

    val h = h1 plus h2 plus h3
    println(h.Name)
    val hh = h1 - h2 + h3
    println(hh.Name)
}

class Header(var Name: String) {

}

// Extension Function
infix operator fun Header.plus(otherHeader: Header): Header {
    return Header("${this.Name} > ${otherHeader.Name}")
}

infix operator fun Header.minus(otherHeader: Header): Header {
    return Header("${this.Name} < ${otherHeader.Name}")
}