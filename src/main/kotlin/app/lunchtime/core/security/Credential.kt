package app.lunchtime.core.security

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "credentials")
class Credential {
    @Id
    var id: String = ""
    var email: String = ""
    var password: String = ""
    var authorities: ArrayList<String> = ArrayList()
}