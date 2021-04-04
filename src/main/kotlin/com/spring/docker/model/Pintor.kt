package com.spring.docker.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Pintor(
    @Id @GeneratedValue
    (strategy = GenerationType.IDENTITY)
    var idPintor: Int,
    var nome: String,
    var idade: Int
)