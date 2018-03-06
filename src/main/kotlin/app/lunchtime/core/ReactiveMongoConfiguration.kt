package app.lunchtime.core

import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoClients
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration
import org.springframework.stereotype.Component

@Component
class ReactiveMongoConfiguration: AbstractReactiveMongoConfiguration() {
    @Value("\${database.uri}")
    private lateinit var databaseURI: String

    @Value("\${database.name}")
    private lateinit var databaseName: String

    override fun reactiveMongoClient(): MongoClient =
        MongoClients.create(databaseURI)

    override fun getDatabaseName(): String = databaseName

}