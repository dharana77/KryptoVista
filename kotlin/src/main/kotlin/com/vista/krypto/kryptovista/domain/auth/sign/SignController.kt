package com.vista.krypto.kryptovista.domain.auth.sign

import com.vista.krypto.kryptovista.domain.auth.social.kakao.KakaoAuthImpl
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/auth/signup")
class SignController(
    private val signService: SignService,
    private val kakaoAuthImpl: KakaoAuthImpl
) {

    @GetMapping
    fun getAccessToken(): Mono<String.Companion> {
        return kakaoAuthImpl.getAccessToken()
    }

    @PostMapping
    fun signupBySocialProvider(
        signupRequestBySocialProvider: SignupRequestBySocialProvider
    ) {
        signService.signupBySocialProvider(signupRequestBySocialProvider.username, signupRequestBySocialProvider.username)
    }
}
