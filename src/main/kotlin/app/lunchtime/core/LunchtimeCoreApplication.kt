package app.lunchtime.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class LunchtimeCoreApplication

fun main(args: Array<String>) {
    runApplication<LunchtimeCoreApplication>(*args)
}
