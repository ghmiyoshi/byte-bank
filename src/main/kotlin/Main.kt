fun main(args: Array<String>) {
    println("Bem vindo ao Byte Bank")
    testaComportamentosConta()
}

private fun testaComportamentosConta() {
    val contaGabriel = Conta(titular = "Gabriel", numero = 123)
    println(contaGabriel.titular)
    println(contaGabriel.numero)
    println(contaGabriel.saldo)

    val contaKah = Conta(numero = 456, titular = "Kah")
    println("Deposita conta da Kah")
    contaKah.deposita(10.0)
    println(contaKah.titular)
    println(contaKah.numero)
    println(contaKah.saldo)

    println("Saque conta da Kah")
    contaKah.saca(5.0)
    println("Saldo conta Kah R$ ${contaKah.saldo}")
    // testaLacos()
    // testacondicoes(contaKah.saldo)
    // testaCopiasEReferencias()

    contaKah.transfere(valor = 5.0, destino = contaGabriel)

    println("Transferência entre contas")
    println("Saldo conta Gabriel R$ ${contaGabriel.saldo}")
    println("Saldo conta Kah R$ ${contaKah.saldo}")
}
