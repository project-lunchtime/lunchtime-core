package app.lunchtime.core.security

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.ReactiveUserDetailsService
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class AuthenticationService : ReactiveUserDetailsService {

    private val NOOP_PASSWORD_PREFIX = "{noop}"

    @Autowired
    lateinit var credentialRepository: CredentialRepository

    override fun findByUsername(username: String): Mono<UserDetails> =
        credentialRepository
                .findByEmail(username)
                .map(this::toUserDetails)

    private fun toUserDetails(credential: Credential): UserDetails =
            User.builder()
                    .username(credential.email)
                    .password(NOOP_PASSWORD_PREFIX + credential.password)
                    .roles(*credential.authorities.toTypedArray())
                    .build()

}