package com.spring.docker.control

class PintorNotFoundException(id: Int) : RuntimeException("Não encotramos um pintor com o ID:  $id") {
    companion object {
        private const val serialVersionUID = 1L
    }
}