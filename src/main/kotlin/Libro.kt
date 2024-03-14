package org.pebiblioteca

data class Libro(
    val titulo: String,
    val autor: String,
    val anioPublicacion: Int,
    val tema: String,
) {
    var estado: Estado
    val id: String

    init {
        require(titulo.isNotEmpty()) {"el libro debe tener título"}
        require(autor.isNotEmpty()) {"el libro debe tener autor"}
        require(anioPublicacion in 2001..2024) {"el año de publicación debe estar entre el 2001 y el 2024"}
        require(tema.isNotEmpty()) {"el libro debe tener tema"}
        estado = Estado.DISPONIBLE
        id = UtilidadesBiblioteca.generarIdentificadorUnico()
    }

    override fun toString(): String {
        return "ID: $id - " +
                "título: $titulo - " +
                "autor: $autor - " +
                "año de Publicación: $anioPublicacion - " +
                "tema: $tema - " +
                "estado: $estado"
    }
}

