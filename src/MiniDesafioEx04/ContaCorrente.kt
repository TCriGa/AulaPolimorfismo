package MiniDesafioEx04

class ContaCorrente : Banco(){

    override fun informarValorSaque() {
        super.informarValorSaque()
        validacaoSaqueCS()

    }

    fun saqueCC() {
        saldoTotal = saldoIncial - saque + deposito
        println("O valor do seu saldo � = $saldoTotal")
    }



    override fun depositoCS() {
        println("Informe o valor de dep�sito: ")
        deposito = readln().toDouble()
        if (deposito > 5000){
            println("Opera��o inv�lida, procure a sua ag�ncia.")
        } else println("Deposito realizado com sucesso")
    }







}