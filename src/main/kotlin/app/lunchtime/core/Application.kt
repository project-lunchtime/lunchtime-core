package app.lunchtime.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration
import org.springframework.boot.autoconfigure.data.mongo.MongoReactiveDataAutoConfiguration
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.autoconfigure.mongo.MongoReactiveAutoConfiguration
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity


@SpringBootApplication(exclude = [MongoAutoConfiguration::class, MongoDataAutoConfiguration::class,
    MongoReactiveDataAutoConfiguration::class, MongoReactiveAutoConfiguration::class, UserDetailsServiceAutoConfiguration::class])
@EnableWebFluxSecurity
@EnableReactiveMethodSecurity
open class Application {

    @Bean
    open fun appVersion(): AppVersion =
            AppVersion()
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
