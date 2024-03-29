package com.vista.krypto.kryptovista.domain.auth.sign

import com.vista.krypto.kryptovista.persistence.entities.User
import com.vista.krypto.kryptovista.persistence.repositories.UserRepository
import org.springframework.stereotype.Service

@Service
class SignService(
    private val userRepository: UserRepository
) {
    fun signupBySocialProvider(
        username: String,
        socialProvider: String
    ) {
        val user = User(username, socialProvider)
        userRepository.save(user)
    }
}
