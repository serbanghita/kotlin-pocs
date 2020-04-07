import com.kotlin.pocs.Person
import com.kotlin.pocs.log
import java.io.FileReader
import java.lang.NumberFormatException
import java.util.*

fun main(args: Array<String>) {
//    firstIteration()

    val compare = compareNumbers(102, 90);
    log(message = "Compare: $compare")
}

fun firstIteration() {
//    var reader = FileReader("somefile.txt")
//    reader.read()


    println("Hello world")
    val p1: Person = Person(123, "Gali")
    p1.display()
    p1.displayWithLambda(::printName)
    println("This is of type: ${p1.Type}")
    if (p1.Id == 123) {
        println("The id is 123")
    }

    val name = if(p1.Id == 123) {
        "Gali"
    } else {
        "N/A"
    }
    println(name);

    if (p1.Email == null) {
        println("Email is null")
    }

    val number: Number = try {
        Integer.parseInt(p1.Name)
    } catch(e: NumberFormatException) {
        -1
    } finally {
        println("finally")
    }
    println("Number is $number")

    val frames = 0..3;
    for(i in frames) {
        println(i)
    }
    for(i in 0 until 3) {
        println(i)
    }
    val names = listOf("A", "B", "C")
    for (firstName in names) {
        println(firstName)
    }

    val players = TreeMap<Number, String>()
    players[1] = "player1";
    players[2] = "player2";
    for ((playerId, playerName) in players) {
        println("Id: $playerId, Name: $playerName")
    }

    val alphabet = 'a'..'c'
    for ((index, letter) in alphabet.withIndex()) {
        println("$letter is of index $index")
    }
}

fun printName(s: String) {
    println(s)
}

fun compareNumbers(a: Int, b: Int): Int = if (a > b) a else b