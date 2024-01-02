package com.vista.krypto.kryptovista.errors

enum class ErrorStatus(val status: Int, val code: Int, val description: String) {
    // Basic Error Statuses
    INTERNAL_SERVER_ERROR(500, 1000, "Internal Server Error"),
    NOT_FOUND_ERROR(404, 1001, "Not Found Error"),
    INVALID_REQUEST_ERROR(400, 1002, "Request is Invalid Error")
}
