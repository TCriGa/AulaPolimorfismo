package Exercicio01

fun main() {
    val autoajuda: Autoajuda = Autoajuda()
    autoajuda.registrarLivroAutoAjuda()

    println("|------------------------------------------------------|")
    val fantasia: Fantasia = Fantasia()
    fantasia.registrarLivroFantasia()

    println("|------------------------------------------------------|")
    val romance : Romance = Romance()
    romance.registrarLivroRomance()

}