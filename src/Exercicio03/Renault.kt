package Exercicio03

class Renault : ICarros(){


    override fun dadosAutomovel() {
        super.dadosAutomovel()
    }

    override fun partidaMotor() {
        velocidade = 0.0
        println("Renault: Iniciando o motor...minha velocidade está em $velocidade Km/h")
    }

    override fun freiar() {
        velocidade -= 5.0
        println("Freando...minha velocidade está em $velocidade Km/h")
    }

    override fun acelerar() {
        velocidade += 10.0
        println("Acelerando...minha velocidade está em $velocidade Km/h")
    }

    override fun mostrarInformacoesAutomoveis() {
               super.mostrarInformacoesAutomoveis()
    }
}