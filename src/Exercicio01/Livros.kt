package Exercicio01

open class Livros() {
    open fun registrarLivro(isbn: Int) {
        println("O livro foi registrado com o ISBN = $isbn")
    }

    open fun registrarLivro(isbn: Int, nomeLivro: String) {
        println("O livro foi registrado com o ISBN: $isbn e nome: $nomeLivro ")

    }

    open fun registrarLivro(isbn: Int, nomeLivro: String, generos: String) {
        println("O livro foi registrado com o ISBN: $isbn e nome: $nomeLivro e gênero: $generos ")
    }

    open fun registrarLivro(isbn: Int, nomeLivro: String, generos: String, pessoaAutora: String) {
        println("O livro foi registrado com o ISBN: $isbn, nome: $nomeLivro, gênero: $generos e pessoa autora: $pessoaAutora ")
    }
    open fun registrarLivro() {
        println("O livro foi registrado com todos os atributos")
    }

}