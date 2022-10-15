package link.aorjoa.pun.article.dto.request

import io.quarkus.mongodb.panache.PanacheMongoEntity
import io.quarkus.mongodb.panache.common.MongoEntity

@MongoEntity
data class Article(
    var title: String,
    var content: String,
    var contributor: String
) : PanacheMongoEntity() {
    constructor() : this("","","") {

    }
}
