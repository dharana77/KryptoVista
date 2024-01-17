package com.vista.krypto.kryptovista.domain.auth.signup

// TODO: move key to application properties and make it secret
val KAKAO_USER_INFO_URI: String = "https://kapi.kakao.com/v2/user/me"
val KAKAO_CLIENT_KEY = "ef3d5f480a67bb881c142311ff5f09e8"

data class SignupRequestBySocialProvider(
    val username: String,
    val signupProvider: String
)
