package Exercicio01

class Autoajuda: Livros() {


    fun registrarLivroAutoAjuda(){
        registrarLivro(456)
        registrarLivro(456,"O poder do Hábito", "Auto Ajuda")
        registrarLivro(456,"O poder do Hábito", "Auto Ajuda", "Charles Duhigg")
        registrarLivro()
    }

}