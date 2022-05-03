package MiniDesafioEx04

class ContaSalario : Conta() {


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

    override fun valorSaldo() {
        super.valorSaldo()
    }


    override fun depositoCS() {
        super.depositoCS()
    }

}