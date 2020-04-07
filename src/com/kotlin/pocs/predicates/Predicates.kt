package com.kotlin.pocs.predicates

fun main(args: Array<String>): Unit {

//    val n = listOf(1,2,3,4,5,6,7,8);
//    val pred = { value: Int -> value > 5 }
//
//    println(n.all(pred))
//    println(n.any(pred))
//    println(n.count { it > 5 })
//
//    println(n.find(pred))

    val players = listOf(
        Player(1, "AAA", listOf(Point(1,1), Point(1,2))),
        Player(2, "BBB", listOf(Point(1,1), Point(11,22))),
        Player(3, "CCC", listOf(Point(1,1), Point(111,222)))
    )
    val p1 = players
        .asSequence()
        .filter {
            println("filter($it)")
            it.id > 1
        }
        .map {
            println("map($it)");
            "${it.id} + ${it.name}"
        }
//    val p2 = players
//                    //.asSequence()
//                    .flatMap { it -> it.points }
//                    .distinct()

    // println(p1)
    for(player in p1) {
        println(player);
    }

    // println(p2)

    /**
            filter(com.kotlin.pocs.predicates.Player@7eda2dbb)
            filter(com.kotlin.pocs.predicates.Player@6576fe71)
            filter(com.kotlin.pocs.predicates.Player@76fb509a)
            map(com.kotlin.pocs.predicates.Player@6576fe71)
            map(com.kotlin.pocs.predicates.Player@76fb509a)
            2 + BBB
            3 + CCC
     */

    /**
            kotlin.sequences.TransformingSequence@2b71fc7e

            filter(com.kotlin.pocs.predicates.Player@4b85612c)
            filter(com.kotlin.pocs.predicates.Player@277050dc)
            map(com.kotlin.pocs.predicates.Player@277050dc)
            2 + BBB
            filter(com.kotlin.pocs.predicates.Player@5c29bfd)
            map(com.kotlin.pocs.predicates.Player@5c29bfd)
            3 + CCC
     */

}


class Player(var id: Int = 0, var name: String = "", var points: List<Point>) {

}

data class Point(var x: Int = 0, var y: Int = 0) {

}

