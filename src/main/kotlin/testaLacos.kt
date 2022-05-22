fun testaLacos() {
    for (i in 1..3) {
        val titular = "Gabriel $i"
        val numeroDeConta: Int = 1000 + i
        var saldo = i + 10.0
        println("titular $titular")

        println("numeroDeConta $numeroDeConta")
        println("saldo R$ $saldo")
        println()
    }

    for (i in 3 downTo 1) {
        val titular = "Gabriel $i"
        val numeroDeConta: Int = 1000 + i
        var saldo = i + 10.0
        println("titular $titular")

        println("numeroDeConta $numeroDeConta")
        println("saldo R$ $saldo")
        println()
    }

    for (i in 5 downTo 1 step 2) {
        if (i == 4)
            break

        val titular = "Gabriel $i"
        val numeroDeConta: Int = 1000 + i
        var saldo = i + 10.0
        println("titular $titular")

        println("numeroDeConta $numeroDeConta")
        println("saldo R$ $saldo")
        println()
    }

    for (i in 5 downTo 1 step 2) {
        if (i == 3)
            continue

        val titular = "Gabriel $i"
        val numeroDeConta: Int = 1000 + i
        var saldo = i + 10.0
        println("titular $titular")

        println("numeroDeConta $numeroDeConta")
        println("saldo R$ $saldo")
        println()
    }

    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

    do {
        println(i)
        i++
    } while (i < 5)
}