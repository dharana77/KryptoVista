package com.vista.krypto.kryptovista.persistence.entities

import com.vista.krypto.kryptovista.domain.order.OrderPlaceRequest
import com.vista.krypto.kryptovista.enums.OrderStatus
import com.vista.krypto.kryptovista.enums.OrderType
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.math.BigDecimal

@Entity
class Order(
    val userId: Long,
    val stockSymbol: String,
    val quantity: Float,
    val orderType: OrderType,
    val orderPrice: BigDecimal? = null,
    @Enumerated(EnumType.STRING) val orderStatus: OrderStatus = OrderStatus.PENDING,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null
) : BaseEntity() {

    constructor(orderPlaceRequest: OrderPlaceRequest) : this(
        orderPlaceRequest.userId,
        orderPlaceRequest.stockSymbol,
        orderPlaceRequest.quantity,
        orderPlaceRequest.orderType,
        orderPlaceRequest.price
    )
}
