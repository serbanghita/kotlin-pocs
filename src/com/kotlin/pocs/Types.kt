package com.kotlin.pocs

import java.math.BigInteger
import kotlin.random.Random

fun main(args: Array<String>) {
    val p = Player()
    p.render()

    val me = Event.MoveEvent(100, 200)
    val se = Event.ShootEvent(102, 202)

    getEvent(me)
    getEvent(se)

    val p1 = Point(10, 20)

    val e1 = EntityNetworkEvent(10, 11, BigInteger("12345"))
    val e2 = EntityNetworkEvent(10, 11, BigInteger("12345"))

    val e11 = e1.copy(y = 12)

    if (e1 == e2) {
        println("e1 == e2")
        println(e1)
        println(e11)
    } else {
        println("e1 != e2")
    }

    val p2 = Player.create()
    println(p2.uuid)

}

data class EntityNetworkEvent(val x: Int, val y: Int, val id: BigInteger) {
}

sealed class Event {
    open val x: Int = 0;
    open val y: Int = 0;

    fun getCoordinates(): Point = Point(this.x, this.y)

    class MoveEvent(override val x: Int, override val y: Int): Event()
    class ShootEvent(override val x: Int, override val y: Int): Event()
}


class Point(val x: Int, val y: Int) {
    init {
        println("Point init #1 $x, $y")
    }
    val z: Int = x + y
    init {
        println("Point init #2 $x, $y, $z")
    }
}

fun getEvent(e: Event) {
    when (e) {
        is Event.MoveEvent -> println("MoveEvent: ${e.getCoordinates().x} y: ${e.getCoordinates().y}")
        is Event.ShootEvent -> println("ShootEvent: ${e.getCoordinates().x} y: ${e.getCoordinates().y}")
    }
}


interface Entity {
    val id: Int
    fun setPosition(x: Int, y: Int): Unit
    fun getPosition() = object {
        val x: Int = 0
        val y: Int = 0
    }
    fun update(): Boolean {
        return true;
    }
    fun render(): Unit {
        println("Entity.render()");
    }
}

interface Renderable {
    fun render(): Unit {
        println("Renderable.render()")
    }
}

open class Player: Entity, Renderable {
    override val id: Int = 123;
    val uuid: Int = Random.nextInt(1, 10000)

    override fun setPosition(x: Int, y: Int) {
        TODO("Not yet implemented")
    }

    override fun render(): Unit {
        super<Renderable>.render()
    }

    companion object {
        @JvmStatic
        fun create(): Player {
            return Player()
        }
    }
}

//class NPCAi: Player {
//
//}