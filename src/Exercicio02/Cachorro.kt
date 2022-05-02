package Exercicio02

class Cachorro : PetShop() {

    override fun movimentar() {

        println( "Andando em 4 patas")
    }

    override fun comer() {
        println("Comendo Bife")
    }

    override fun dormir() {
        println("Dormindo na cama da Jéssica")
    }

    fun fichaCadastroCachorro(){
        nome = "Bidu"
        raca = "Scottish Terrier"
        responsavel = "Jéssica"

        println("O nome do pet é : $nome, da raça: $raca e o a responsável é a $responsavel ")
    }
}