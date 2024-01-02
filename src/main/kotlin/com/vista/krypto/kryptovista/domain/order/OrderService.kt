package com.vista.krypto.kryptovista.domain.order

import com.vista.krypto.kryptovista.persistence.entities.Order
import com.vista.krypto.kryptovista.persistence.repositories.OrderRepository
import org.springframework.stereotype.Service

@Service
class OrderService(
    private val orderRepository: OrderRepository
) {

    fun placeOrder(orderPlaceRequest: OrderPlaceRequest): OrderBasicResult {
        val order = Order(orderPlaceRequest)
        val orderEntity = orderRepository.save(order)
        return OrderBasicResult(orderEntity)
    }

    // TODO OrderStatus 처리 및 거래완료 처리 구현
    fun processOrder() {
    }
}
