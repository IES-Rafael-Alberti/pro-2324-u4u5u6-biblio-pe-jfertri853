package org.pebiblioteca

fun main() {

    val gestor = GestorBiblioteca()

    gestor.agregarLibro(Libro("1234A", "Hola", "anonimo", 2012, "autoayuda"))
    gestor.agregarLibro(Libro("0987G", "Arañas", "Peter Parker", 2002, "suspense"))
    gestor.agregarLibro(Libro("1357K", "La Niebla", "Stephen King", 2006, "terror"))
    gestor.agregarLibro(Libro("2468F", "Merendar", "anonimo", 2021, "suspense"))

    gestor.devolverLibro("1357K")
    gestor.registrarPrestamo("0987G")
    gestor.registrarPrestamo("0987G")
    gestor.devolverLibro("0987G")

}