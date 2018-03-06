package app.lunchtime.core.handler

import app.lunchtime.core.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.body

@Component
class UserHandler {
    @Autowired
    lateinit var userRepository: UserRepository

    fun retrieve(request: ServerRequest) =
            ok().body(userRepository.findAll())
}