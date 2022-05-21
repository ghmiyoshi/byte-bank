fun main(args: Array<String>) {
    val contaGabriel = Conta()
    contaGabriel.titular = "Gabriel"
    // println(contaGabriel.titular)

    val contaKah = Conta()
    contaKah.titular = "Kah"
    contaKah.numero = 234
    contaKah.saldo = 0.0

    println("Deposita conta da Kah")
    contaKah.deposita(10.0)
    println(contaKah.saldo)

    println("Saque conta da Kah")
    contaKah.saca(5.0)
    println(contaKah.saldo)

    println(contaKah.titular)
    println(contaKah.numero)
    // testaLacos()
    // testaCondicoes(saldo)
    // testaCopiaEReferencias()
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}

fun testaCopiaEReferencias() {
    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    println(numeroY)
    println(numeroX)

    var contaJoao = Conta()
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println(contaMaria.titular)
    println(contaJoao.titular)
}

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

fun testaCondicoes(saldo: Double) {
    if (saldo > 0)
        println("Conta é positiva")
    else if (saldo == 0.0)
        println("Conta é neutra")
    else
        println("Conta é negativa")

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}
