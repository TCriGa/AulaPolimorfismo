package Exercicio03

class Hyundai : ICarros(){
    override fun dadosAutomovel() {
        super.dadosAutomovel()
    }

    override fun partidaMotor() {
        velocidade = 5.0
        println("Hynday: Iniciando Motor...Minha velociade est� em $velocidade Km/h")
    }

    override fun freiar() {
        velocidade -= 2.0
        println("Freando...Minha velocidade est� em $velocidade Km/h")

    }

    override fun acelerar() {
        velocidade += 15.0
        println("Acelerando...Minha velocidade est� em $velocidade Km/h")
    }

    override fun mostrarInformacoesAutomoveis() {
        super.mostrarInformacoesAutomoveis()
    }

}