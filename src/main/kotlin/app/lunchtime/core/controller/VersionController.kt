package app.lunchtime.core.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class VersionController {

    @Value("\${application.version}")
    lateinit var appVersion: String

    @RequestMapping
    fun appVersion(): String {
        return appVersion
    }
}
