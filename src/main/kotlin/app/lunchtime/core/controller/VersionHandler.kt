package app.lunchtime.core.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body
import reactor.core.publisher.Mono

@Component
class VersionHandler {

    @Value("\${application.version}")
    lateinit var appVersion: String

    fun appVersion(request: ServerRequest) =
        ok().body(Mono.just(appVersion))

}
