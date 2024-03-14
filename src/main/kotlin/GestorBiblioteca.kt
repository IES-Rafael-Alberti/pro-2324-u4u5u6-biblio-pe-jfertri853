package org.pebiblioteca

class GestorBiblioteca {
    val catalogo = Catalogo()
    val registroPrestamos = RegistroPrestamos()


    /** Agrega un libro al catálogo de la biblioteca
     *
     * @param libro El objeto libro que se agrega
     */
    fun agregarLibro(libro: Libro) {
        catalogo.libros.add(libro)
    }


    /** Elimina un libro del catálogo de la biblioteca
     *
     * @param libro El objeto libro que se elimina
     */
    fun eliminarLibro(libro: Libro) {
        catalogo.libros.remove(libro)
    }


    /** Devuelve si un libro está disponible o no
     *
     * @param id código del libro
     *
     * @return true o false según esté disponible o prestado
     */
    fun consultarDisponibilidad(id: String): Boolean {
        return catalogo.libros.any { it.id == id && it.estado == Estado.DISPONIBLE }
    }


    /** Presta un libro si estaba disponible
     *
     * @param id código del libro
     */
    fun registrarPrestamo(id: String) {
        if (consultarDisponibilidad(id)) {
            val libro = catalogo.libros.find { it.id == id}
            libro?.estado = Estado.PRESTADO
            println("El libro ${libro?.titulo} se ha prestado correctamente")
        } else {
            println("No se ha podido procesar la solicitud de préstamo")
        }

    }


    /** Devuelve un libro a la biblioteca si estaba prestado
     *
     * @param id código del libro
     */
    fun devolverLibro(id: String) {
        if (!consultarDisponibilidad(id)) {
            val libro = catalogo.libros.find { it.id == id}
            libro?.estado = Estado.DISPONIBLE
            println("El libro ${libro?.titulo} se ha devuelto correctamente")
        } else {
            println("No se ha podido procesar la solicitud de devolución")
        }

    }


    /** Muestra el título de todos los libros y su disponibilidad
     */
    fun mostrarLibros() {
        for (libro in catalogo.libros) {
            println("${libro.titulo} - ${libro.estado}")
        }
    }


}