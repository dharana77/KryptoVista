package com.vista.krypto.kryptovista.persistence.entities

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

abstract class BaseEntity(
    @LastModifiedDate val updatedAt: LocalDateTime? = null,
    @CreatedDate val createdAt: LocalDateTime = LocalDateTime.now()
)
