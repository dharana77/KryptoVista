package com.vista.krypto.kryptovista.domain.auth.sign

data class SignupRequestBySocialProvider(
    val username: String,
    val signupProvider: String
)
