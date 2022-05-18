fun main(args: Array<String>) {
    val titular = "Gabriel"
    val numeroDeConta: Int = 1000
    var saldo = 0.0
    saldo += 100

    println("titular $titular")
    println("numeroDeConta $numeroDeConta")
    println("saldo R$ $saldo")

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