package MiniDesafioEx04

import kotlin.system.exitProcess

class MenuBanco {
    val contaSalario: ContaSalario = ContaSalario()
    val contaPoupanca: ContaPoupanca = ContaPoupanca()
    val contaCorrente: ContaCorrente = ContaCorrente()

    var tipoConta = ""

    init {

        println("|----------------* Bem vindo ao sistem Bancário TCriGA ------------------|")
    }

    fun opcaoMenuBancoCC() {

        do {
        println("|----------------* Informe a opção desejada ------------------------------|")
        println("|----------------* 01 - Saque --------------------------------------------|")
        println("|----------------* 02 - Deposito -----------------------------------------|")
        println("|----------------* 03 - Saldo---------------------------------------------|")
        println("|----------------* 04 - Sair ---------------------------------------------|")


            when (readln().toInt()) {
                1-> contaCorrente.informarValorSaque()
                2 -> contaCorrente.depositoCS()
                3-> {
                    contaCorrente.saqueCC()
                }
                4 -> {
                    println("Obrigada por utilizar nosso sistema!! :D")
                    exitProcess(0)
                }
                else -> println("Opção Inválida. Digite Novamente!!")

            }
        } while (true)
    }

    fun opcaoMenuBancoCS() {

        do {
            println("|----------------* Informe a opção desejada ------------------------------|")
            println("|----------------* 01 - Saque --------------------------------------------|")
            println("|----------------* 02 - Deposito -----------------------------------------|")
            println("|----------------* 03 - Saldo---------------------------------------------|")
            println("|----------------* 04 - Sair ---------------------------------------------|")


            when (readln().toInt()) {
                1-> contaSalario.informarValorSaque()
                2 -> contaSalario.depositoCS()
                3-> {
                    contaSalario.saqueCS()
                }
                4 -> {
                    println("Obrigada por utilizar nosso sistema!! :D")
                    exitProcess(0)
                } else -> println("Opção Inválida. Digite Novamente!!")

            }
        } while (true)
    }

    fun opcaoMenuBancoCP() {

        do {
            println("|----------------* Informe a opção desejada ------------------------------|")
            println("|----------------* 01 - Saque --------------------------------------------|")
            println("|----------------* 02 - Deposito -----------------------------------------|")
            println("|----------------* 03 - Saldo---------------------------------------------|")
            println("|----------------* 04 - Sair ---------------------------------------------|")


            when (readln().toInt()) {
                1-> contaPoupanca.informarValorSaque()
                2 -> contaPoupanca.depositoCS()
                3-> {
                    contaPoupanca.saqueCP()
                }
                4 -> {
                    println("Obrigada por utilizar nosso sistema!! :D")
                    exitProcess(0)
                } else -> println("Opção Inválida. Digite Novamente!!")

            }
        } while (true)
    }

    private fun informarQualConta() {

        println("Informe qual tipo de conta deseja Abrir")
        tipoConta = readln()
    }

    fun menuInicial() {
        informarQualConta()
        do {
            when (tipoConta) {
                "Conta Corrente" -> opcaoMenuBancoCC()
                "Conta Salario" -> opcaoMenuBancoCS()
                "Conta Poupanca" -> opcaoMenuBancoCP()


            }
        } while (true)

    }

}