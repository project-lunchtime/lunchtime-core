package app.lunchtime.core.repository

import app.lunchtime.core.model.User
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Flux

interface UserRepository : ReactiveMongoRepository<User, String> {
    fun findByEmail(email: String): Flux<User>
}