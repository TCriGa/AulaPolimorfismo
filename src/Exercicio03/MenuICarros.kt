package Exercicio03

import kotlin.system.exitProcess

class MenuICarros : ICarros() {

    private val renault: Renault = Renault()
    private val fiat: Fiat = Fiat()
    private val hyndai: Hyundai = Hyundai()

    init {
        println("|-------------------Bem vindo ao sistema Icarros------------------------------------------|")
    }

   private fun boasvindas() {


        println("|----------------------Informe a opção desejada ------------------------------------------|")
        println("|------------------01 - Inserir dados do automóvel ---------------------------------------|")
        println("|------------------02 - Mostrar dados cadastrados ----------------------------------------|")
        println("|------------------03 - Sair--------------------------------------------------------------|")
    }


   fun menuu() {
        marcaAutomovel()
        do {
            boasvindas()
            when (readln().toInt()) {

                1 -> {
                    when (marca) {
                        "Renault" -> {
                            renault.dadosAutomovel()
                        }
                        "Fiat" -> {
                            fiat.dadosAutomovel()
                        }
                        "Hyndai" -> hyndai.dadosAutomovel()
                    }
                }
                2 -> when (marca) {
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
                    "Hyndai" -> {
                        hyndai.mostrarInformacoesAutomoveis()
                        hyndai.partidaMotor()
                        hyndai.acelerar()
                        hyndai.freiar()
                    }

                }
                3 -> {
                    println("Obrigada por utilizar nosso sistema!! :D")
                    exitProcess(0)
                }
                else -> println("Opção inválida. Digite novamente!! XD")
            }
        } while (true)

    }
}