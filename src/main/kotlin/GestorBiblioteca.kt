package org.pebiblioteca

class GestorBiblioteca {
    val catalogo = Catalogo()
    val registroPrestamos = RegistroPrestamos()


    fun agregarLibro(libro: Libro) {
        catalogo.libros.add(libro)
    }


    fun eliminarLibro(libro: Libro) {
        catalogo.libros.remove(libro)
    }


    fun consultarDisponibilidad(id: String): Boolean {
        return catalogo.libros.any { it.id == id && it.estado == Estado.DISPONIBLE }
    }


    fun registrarPrestamo(id: String) {
        if (consultarDisponibilidad(id)) {
            val libro = catalogo.libros.find { it.id == id}
            libro?.estado = Estado.PRESTADO
            println("El libro ${libro?.titulo} se ha prestado correctamente")
        } else {
            println("No se ha podido procesar la solicitud de préstamo")
        }

    }


    fun devolverLibro(id: String) {
        if (!consultarDisponibilidad(id)) {
            val libro = catalogo.libros.find { it.id == id}
            libro?.estado = Estado.DISPONIBLE
            println("El libro ${libro?.titulo} se ha devuelto correctamente")
        } else {
            println("No se ha podido procesar la solicitud de devolución")
        }

    }


    fun mostrarLibros() {
        for (libro in catalogo.libros) {
            println("${libro.titulo} - ${libro.estado}")
        }
    }


}