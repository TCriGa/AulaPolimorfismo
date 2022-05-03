package MiniDesafioEx04

class ContaSalario : Banco() {


    override fun informarValorSaque() {
        saldoIncial = 1212.0
        super.informarValorSaque()
        validacaoSaqueCS1()

    }

     fun validacaoSaqueCS1() {

        if (saque >= saldoIncial) {
            println("Saldo Insuficiente")
        }else println("Saque realizado com sucesso")
    }

    fun saqueCS() {

        saldoTotal = saldoIncial - saque + deposito
        println("O valor do seu saldo é = $saldoTotal")
    }


    override fun depositoCS() {
        super.depositoCS()
    }

}