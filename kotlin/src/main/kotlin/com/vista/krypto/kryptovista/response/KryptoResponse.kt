package com.vista.krypto.kryptovista.response

data class KryptoResponse<T> (
    val status: Int = 200,
    val message: String? = null,
    val data: T
)
