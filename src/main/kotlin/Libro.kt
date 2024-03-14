package org.pebiblioteca

data class Libro(
    val id: String,
    val titulo: String,
    val autor: String,
    val anioPublicacion: Int,
    val tema: String,
) {
    var estado: Estado


    init {
        require(id.isNotEmpty()) {"el ID del libro no puede estar vacío"}
        require(titulo.isNotEmpty()) {"el libro debe tener título"}
        require(autor.isNotEmpty()) {"el libro debe tener autor"}
        require(anioPublicacion in 2001..2024) {"el año de publicación debe estar entre el 2001 y el 2024"}
        require(tema.isNotEmpty()) {"el libro debe tener tema"}
        estado = Estado.DISPONIBLE
    }

}

