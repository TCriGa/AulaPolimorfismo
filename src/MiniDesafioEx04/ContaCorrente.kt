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
        println("Informe o valor de dep�sito: ")
        deposito = readln().toDouble()
        if (deposito > 5000){
            println("Opera��o inv�lida, procure a sua ag�ncia.")
        } else println("Deposito realizado com sucesso")
    }







}