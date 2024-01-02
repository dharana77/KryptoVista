package com.vista.krypto.kryptovista.persistence.repositories

import com.vista.krypto.kryptovista.persistence.entities.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository: JpaRepository<Order, Long> {
}