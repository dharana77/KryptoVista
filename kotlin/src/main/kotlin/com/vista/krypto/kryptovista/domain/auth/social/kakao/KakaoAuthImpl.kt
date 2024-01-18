package com.vista.krypto.kryptovista.domain.auth.social.kakao

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

@Component
class KakaoAuthImpl : KakaoAuth {
    // TODO: move key to application properties and make it secret
    val BASE_URL = "http://localhost:8080"
    val KAKAO_SIGNUP_URL: String = "https://kapi.kakao.com/v1/user/signup"
    val KAKAO_ACCESSTOKEN_URL: String = "https://kapi.kakao.com/v1/user/access_token_info"
    val KAKAO_CLIENT_KEY = "ef3d5f480a67bb881c142311ff5f09e8"

    override fun signup(accessToken: String): Mono<String.Companion> {
        return WebClient.builder().baseUrl(BASE_URL).defaultHeader("Authorization", accessToken).build()
            .post().uri(KAKAO_SIGNUP_URL).retrieve().bodyToMono(String.javaClass)
    }

    override fun getAccessToken(): Mono<String.Companion> {
        return WebClient.builder().baseUrl(KAKAO_ACCESSTOKEN_URL).build().get()
            .uri(KAKAO_ACCESSTOKEN_URL).retrieve().bodyToMono(String.javaClass)
    }
}
