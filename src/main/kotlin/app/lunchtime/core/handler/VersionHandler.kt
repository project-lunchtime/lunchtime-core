package app.lunchtime.core.handler

import app.lunchtime.core.AppVersion
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body
import reactor.core.publisher.Mono

@Component
class VersionHandler {

    @Autowired
    lateinit var appVersion : AppVersion

    fun appVersion(request: ServerRequest) =
        ok().body(Mono.just(appVersion))

}
