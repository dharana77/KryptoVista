package com.vista.krypto.kryptovista.domain.order

import com.vista.krypto.kryptovista.enums.OrderType
import java.math.BigDecimal

data class OrderBasicResult(
    val price: BigDecimal,
    val orderType: OrderType
)

data class OrderPlaceRequest(
    val userId: Long,
    val stockSymbol: String,
    val price: BigDecimal,
    val orderType: OrderType,
    val quantity: Float
)
