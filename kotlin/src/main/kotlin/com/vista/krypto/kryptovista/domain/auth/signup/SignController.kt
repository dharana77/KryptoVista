package com.vista.krypto.kryptovista.domain.auth.signup

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/auth/signup")
class SignController (
    private val signupService: SignupService
){

    @PostMapping
    fun signupBySocialProvider(
        signupRequestBySocialProvider: SignupRequestBySocialProvider
    ){
        signupService.signupBySocialProvider(signupRequestBySocialProvider.username, signupRequestBySocialProvider.username)

    }
}