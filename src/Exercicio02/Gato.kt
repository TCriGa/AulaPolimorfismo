package Exercicio02

class Gato : PetShop() {

    override fun movimentar() {
        println("Andando e saltando em 4 patas")
    }

    override fun comer() {
        println("Comendo Whiskas sachê")
    }

    override fun dormir() {
        println("Dormindo na caixa")
    }

    fun fichaCadastroGato(){
        nome = "Mingau"
        raca = "persa"
        responsavel = "Thay"

        println("O nome do pet é : $nome, da raça: $raca e o a responsável é a $responsavel ")
    }
}