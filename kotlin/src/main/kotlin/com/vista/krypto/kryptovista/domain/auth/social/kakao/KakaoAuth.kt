package com.vista.krypto.kryptovista.domain.auth.social.kakao

import reactor.core.publisher.Mono

interface KakaoAuth {

    fun signup(accessToken: String): Mono<String.Companion>

    fun getAccessToken(): Mono<String.Companion>
}
