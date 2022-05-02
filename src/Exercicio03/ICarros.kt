package Exercicio03

open class ICarros(
    var marca: String = "",
    var ano: Int = 0,
    var valor: Double = 0.0,
    var cor: String = "",
    var portas: Int = 0,
    var velocidade: Double = 0.0
) {

    open fun partidaMotor() = println()
    open fun freiar() = println()
    open fun acelerar() = println()

    fun marcaAutomovel() {
        println(" 01 - Informe a marca do automóvel: ")
        marca = readln()
    }

    open fun dadosAutomovel() {
        println("Informe o ano do automóvel: ")
        ano = readln().toInt()
        println("Informe o valor do automóvel ")
        valor = readln().toDouble()
        println("Informe a cor do automóvel:")
        cor = readln()
        println("informe a quantidade de portas do automóvel")
        portas = readln().toInt()
    }

    open fun mostrarInformacoesAutomoveis(){
        println("Ano = $ano")
        println("Valor = $valor")
        println("Cor = $cor")
        println("Quantidade de portas = $portas")
    }
}