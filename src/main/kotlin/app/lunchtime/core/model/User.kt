package app.lunchtime.core.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
class User {
    @Id
    var id: String = ""
    var email: String = ""
    var password: String = ""
    var authorities: ArrayList<String> = ArrayList()
}