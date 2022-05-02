package Exercicio02

class Peixe : PetShop(){

    override fun movimentar() {
        println("Nadando")
    }

    override fun comer() {
        println("Comendo ração molhada")
    }

    override fun dormir() {
        println("Dormindo de olho aberto")
    }

    fun fichaCadastroPeixe(){
        nome = "Dory"
        raca = "cirurgiões-patelar"
        responsavel = "Thay"

        println("O nome do pet é : $nome, da raça: $raca e o a responsável é a $responsavel ")
    }

}