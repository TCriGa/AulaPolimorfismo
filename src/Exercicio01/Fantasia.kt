package Exercicio01

class Fantasia : Biblioteca() {

    fun registrarLivroFantasia(){
        registrarLivro(1234)
        registrarLivro(1234, "Harry Potter")
        registrarLivro(1234,"Harry Potter", "Fantasia")
        registrarLivro(1234, "Harry Potter", "Fantasia", "J. K. ")
        registrarLivro()

    }



}