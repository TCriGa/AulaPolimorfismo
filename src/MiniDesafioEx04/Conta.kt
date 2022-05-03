package MiniDesafioEx04

open class Conta(
    var deposito: Double = 0.0,
    var saque: Double = 0.0,
    var saldoIncial: Double = 0.0,
    var saldoTotal: Double = 0.0,
    var pessoa: String = ""
) {

    open fun informarValorSaque() {

        println("Informe qual o valor do saque: ")
        saque = readln().toDouble()

    }

    private fun informarValorDeposito() {
        println("Informe qual o valor do dep�sito: ")
        deposito = readln().toDouble()
    }

    open fun validacaoSaqueCS() {
        if (saque >= saldoTotal && saque >= deposito) {
            println("Saldo Insuficiente")
        } else println("Saque realizado com sucesso")
    }

    open fun depositoCS() {
        println("Por gentileza, informe quem est� realizando o deposito")
        pessoa = readln()

        if (pessoa == "Empregador") {
            informarValorDeposito()
        } else println("Conta Sal�rio s� pode receber dep�sito do empregador")


    }

   open fun valorSaldo() {
        saldoTotal = saldoIncial - saque + deposito
        println("O valor do seu saldo � = $saldoTotal")
    }


}