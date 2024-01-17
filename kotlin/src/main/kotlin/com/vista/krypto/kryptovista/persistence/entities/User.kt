package com.vista.krypto.kryptovista.persistence.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class User(
    val username: String,
    val socialProvider: String,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null
) : BaseEntity()
