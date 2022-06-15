package link.aorjoa.pun.article.dto.request

import org.bson.types.ObjectId

data class Article(
    var id: ObjectId? = null,
    var title: String,
    var content: String,
    var contributor: String
)