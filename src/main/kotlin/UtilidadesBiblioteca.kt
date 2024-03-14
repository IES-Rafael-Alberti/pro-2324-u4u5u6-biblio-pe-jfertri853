package org.pebiblioteca

class UtilidadesBiblioteca {

    companion object {
        private var codigo = System.currentTimeMillis()
        private var contador = 0

        fun generarIdentificadorUnico(): String {
            contador ++
            return "$codigo$contador"
        }

    }

}