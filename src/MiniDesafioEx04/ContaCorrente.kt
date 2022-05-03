package MiniDesafioEx04

class ContaCorrente : Conta(){

    override fun informarValorSaque() {
        super.informarValorSaque()
        validacaoSaqueCS()

    }

    override fun valorSaldo() {
        super.valorSaldo()
    }



    override fun depositoCS() {
        println("Informe o valor de depósito: ")
        deposito = readln().toDouble()
        if (deposito > 5000){
            println("Operação inválida, procure a sua agência.")
        } else println("Deposito realizado com sucesso")
    }







}