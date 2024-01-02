package com.vista.krypto.kryptovista.domain.order

import com.vista.krypto.kryptovista.response.KryptoResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/order")
class OrderController(
    private val orderService: OrderService
) {
    @PostMapping("/place")
    fun requestOrder(
        @RequestBody orderPlaceRequest: OrderPlaceRequest
    ): KryptoResponse<OrderBasicResult> {
        val res = orderService.placeOrder(orderPlaceRequest)
        return KryptoResponse(data = res)
    }
}
