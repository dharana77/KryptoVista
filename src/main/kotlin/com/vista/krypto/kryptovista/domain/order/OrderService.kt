package com.vista.krypto.kryptovista.domain.order

import com.vista.krypto.kryptovista.persistence.entities.Order
import org.springframework.stereotype.Service

@Service
class OrderService(
    private val orderRepository: OrderRepository
) {

    fun placeOrder(orderPlaceRequest: OrderPlaceRequest): OrderBasicResult {
        val order = Order(orderPlaceRequest)
        return OrderBasicResult(orderRepository.save(order))
    }

    // TODO OrderStatus 처리 및 거래완료 처리 구현
    fun processOrder() {
    }
}
