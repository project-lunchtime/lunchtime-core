package app.lunchtime.core

import com.mongodb.MongoClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class Application {

    @Value("\${database.host}")
    private lateinit var databaseHost: String

    @Value("\${database.port}")
    private lateinit var databasePort: Integer

    @Bean
    open fun database(): MongoClient =
        MongoClient(databaseHost, databasePort.toInt())

    @Bean
    open fun appVersion() : AppVersion =
        AppVersion()
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
