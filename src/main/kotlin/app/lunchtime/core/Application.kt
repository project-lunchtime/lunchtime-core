package app.lunchtime.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration
import org.springframework.boot.autoconfigure.data.mongo.MongoReactiveDataAutoConfiguration
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.autoconfigure.mongo.MongoReactiveAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication(exclude = [MongoAutoConfiguration::class, MongoDataAutoConfiguration::class,
    MongoReactiveDataAutoConfiguration::class, MongoReactiveAutoConfiguration::class])
open class Application {

    @Bean
    open fun appVersion(): AppVersion =
            AppVersion()
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
