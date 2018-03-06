package app.lunchtime.core

import app.lunchtime.core.handler.UserHandler
import app.lunchtime.core.handler.VersionHandler
import com.mongodb.connection.Server
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@Configuration
open class Routes {

    @Bean
    open fun versionRouter(handler: VersionHandler): RouterFunction<ServerResponse> = router {
        accept(MediaType.APPLICATION_JSON).nest {
            GET("/version", handler::appVersion)
        }
    }

    @Bean
    open fun userRouter(handler: UserHandler): RouterFunction<ServerResponse> = router {
        accept(MediaType.APPLICATION_JSON).nest {
            GET("/users", handler::retrieve)
        }
    }
}