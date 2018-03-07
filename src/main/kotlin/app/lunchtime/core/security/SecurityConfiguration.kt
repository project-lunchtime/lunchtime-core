package app.lunchtime.core.security

import org.springframework.context.annotation.Bean
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain
import org.springframework.stereotype.Component

@Component
class SecurityConfiguration {

    @Bean
    fun webFilterChain(http: ServerHttpSecurity): SecurityWebFilterChain =
            http.authorizeExchange().anyExchange().permitAll()
                    .and().httpBasic()
                    .and().build()
}