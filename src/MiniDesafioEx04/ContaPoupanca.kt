package MiniDesafioEx04

class ContaPoupanca : Conta() {

    override fun informarValorSaque() {
        super.informarValorSaque()
        validacaoSaqueCS()

    }

    override fun valorSaldo() {
        super.valorSaldo()
    }

    override fun depositoCS() {
        super.depositoCS()
    }

}