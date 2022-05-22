fun testaCopiasEReferencias() {
    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    println(numeroY)
    println(numeroX)

    var contaJoao = Conta("João", 1001)
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println(contaMaria.titular)
    println(contaJoao.titular)
}