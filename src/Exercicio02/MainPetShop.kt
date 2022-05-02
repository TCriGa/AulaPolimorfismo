package Exercicio02

fun main() {
    val cachorro : Cachorro = Cachorro()
    cachorro.fichaCadastroCachorro()
    cachorro.movimentar()
    cachorro.comer()
    cachorro.dormir()

    println("|-----------------------------------------------------------------------------------------|")

    val gato : Gato = Gato()
    gato.fichaCadastroGato()
    gato.movimentar()
    gato.comer()
    gato.dormir()

    println("|-----------------------------------------------------------------------------------------|")
    val peixe : Peixe = Peixe()
    peixe.fichaCadastroPeixe()
    peixe.movimentar()
    peixe.comer()
    peixe.dormir()


}