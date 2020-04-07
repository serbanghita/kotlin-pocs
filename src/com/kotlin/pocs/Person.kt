package com.kotlin.pocs

class Person (var Id: Number, var Name: String) {
    val Type: String = "Person"
    var Email: String? = null
    fun display() {
        println("Hi, my name is $Name")
    }
    fun displayWithLambda(func: (s: String) -> Unit) {
        func(Name);
    }
}