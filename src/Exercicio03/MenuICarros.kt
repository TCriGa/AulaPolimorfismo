package Exercicio03

import kotlin.system.exitProcess

class MenuICarros : ICarros() {

    val renault: Renault = Renault()
    val fiat: Fiat = Fiat()
    val hyndai: Hyundai = Hyundai()

    init {
        println("|-------------------Bem vindo ao sistema Icarros------------------------------------------|")
    }

    fun boasvindas(){

        println("|------------------01 - Inserir marca do Veiculo------------------------------------------|")
        println("|------------------02 - Inserir dados do automóvel ---------------------------------------|")
        println("|------------------03 - Mostrar dados cadastrados ----------------------------------------|")
        println("|------------------04 - Sair--------------------------------------------------------------|")
    }

    fun menuu() {

        do {
            boasvindas()
            when (readln().toInt()) {
                1-> marcaAutomovel()
                2 -> {
                    when (marca) {
                        "Renault" -> {
                            renault.dadosAutomovel()
                        }
                        "Fiat" -> {
                            fiat.dadosAutomovel()
                        }
                        "Hynday" -> hyndai.dadosAutomovel()
                    }
                }
                3 -> when (marca) {
                    "Renault" -> {
                        renault.mostrarInformacoesAutomoveis()
                        renault.partidaMotor()
                        renault.acelerar()
                        renault.freiar()
                    }
                    "Fiat" -> {
                        fiat.mostrarInformacoesAutomoveis()
                        fiat.partidaMotor()
                        fiat.acelerar()
                        fiat.freiar()
                    }
                    "Hynday" ->{
                        hyndai.mostrarInformacoesAutomoveis()
                        hyndai.partidaMotor()
                        hyndai.acelerar()
                        hyndai.freiar()
                    }

                }
                4 -> {
                    println("Obrigada por utilizar nosso sistema!! :D")
                    exitProcess(0)
                }
                else -> println("Opção inválida. Digite novamente!! XD")
            }
        } while (true)

    }
}