package MiniDesafioEx04

class ContaPoupanca : Banco() {

    override fun informarValorSaque() {
        super.informarValorSaque()
        validacaoSaqueCS()

    }

    fun saqueCP() {
        saldoTotal = saldoIncial - saque + deposito
        println("O valor do seu saldo � = $saldoTotal")
    }


    override fun depositoCS() {
        super.depositoCS()
    }

}