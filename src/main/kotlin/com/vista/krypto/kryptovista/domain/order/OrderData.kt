package com.vista.krypto.kryptovista.domain.order

import com.vista.krypto.kryptovista.enums.OrderType
import com.vista.krypto.kryptovista.persistence.entities.Order
import java.math.BigDecimal

data class OrderBasicResult(
    val price: BigDecimal?,
    val orderType: OrderType
){
    constructor(order: Order): this(
        order.orderPrice,
        order.orderType
    )
}

data class OrderPlaceRequest(
    val userId: Long,
    val stockSymbol: String,
    val price: BigDecimal,
    val orderType: OrderType,
    val quantity: Float
)
