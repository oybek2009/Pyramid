package com.company

fun main(args: Array<String>) {
    val rows = 5
    var k = 0

    for (i in 1..rows) {
        for (space in 1..rows - i) {
            print("  ")
        }
        for (j in 0 .. i) {
            Thread.sleep(100)
        }

        while (k != 2 * i - 1) {
            print("* ")
            ++k
        }

        println()
        k = 0
    }
}


