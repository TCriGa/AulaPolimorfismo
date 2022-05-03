package Exercicio01

class Romance : Livros(){


    fun registrarLivroRomance(){
        registrarLivro(789)
        registrarLivro(789, "A verdade de cada um")
        registrarLivro(789, "A verdade de cada um", "Romance")
        registrarLivro(789, "A verdade de cada um", "Romance", "Zibia Gasparetto")
        registrarLivro()
    }
}