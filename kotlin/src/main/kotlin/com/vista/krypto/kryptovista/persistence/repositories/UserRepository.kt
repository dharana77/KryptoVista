package com.vista.krypto.kryptovista.persistence.repositories

import com.vista.krypto.kryptovista.persistence.entities.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}