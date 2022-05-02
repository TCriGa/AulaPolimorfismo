package Exercicio03

class Fiat : ICarros(){

    override fun dadosAutomovel() {
        super.dadosAutomovel()
    }

    override fun partidaMotor() {
        velocidade = 3.0
        println("Fiat: Iniciando o motor...Minha velocidade está em $velocidade Km/h")
    }

    override fun freiar() {
        velocidade -= 6.0
        println("Freando...Minha velocidade está em $velocidade Km/h")
    }

    override fun acelerar() {
        velocidade += 12.0
        println("Acelerando...Minha velocidade está em $velocidade Km/h")
    }

    override fun mostrarInformacoesAutomoveis() {
        super.mostrarInformacoesAutomoveis()
    }
}