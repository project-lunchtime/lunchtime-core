package app.lunchtime.core

import org.springframework.beans.factory.annotation.Value

class AppVersion {
    @Value("\${application.group}")
    lateinit var appGroup: String

    @Value("\${application.module}")
    lateinit var appModule: String

    @Value("\${application.version}")
    lateinit var appVersion: String
}
