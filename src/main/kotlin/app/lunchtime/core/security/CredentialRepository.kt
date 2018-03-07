package app.lunchtime.core.security

import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Mono

interface CredentialRepository : ReactiveMongoRepository<Credential, String> {
    fun findByEmail(email: String): Mono<Credential>

}