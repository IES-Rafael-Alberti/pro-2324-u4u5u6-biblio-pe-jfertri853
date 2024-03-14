package org.pebiblioteca

fun main() {

    val gestor = GestorBiblioteca()

    gestor.agregarLibro(Libro("Hola", "anonimo", 2012, "autoayuda"))
    gestor.agregarLibro(Libro("Arañas", "Peter Parker", 2002, "suspense"))
    gestor.agregarLibro(Libro("La Niebla", "Stephen King", 2006, "terror"))
    gestor.agregarLibro(Libro("Merendar", "anonimo", 2021, "suspense"))

    println(gestor.catalogo.libros)

    println()
    gestor.mostrarLibros()

}