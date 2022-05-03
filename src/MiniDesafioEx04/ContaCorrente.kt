package MiniDesafioEx04

class ContaCorrente : Banco(){

    override fun informarValorSaque() {
        super.informarValorSaque()
        validacaoSaqueCS()

    }

    fun saqueCC() {
        saldoTotal = saldoIncial - saque + deposito
        println("O valor do seu saldo é = $saldoTotal")
    }



    override fun depositoCS() {
        println("Informe o valor de depósito: ")
        deposito = readln().toDouble()
        if (deposito > 5000){
            println("Operação inválida, procure a sua agência.")
        } else println("Deposito realizado com sucesso")
    }







}