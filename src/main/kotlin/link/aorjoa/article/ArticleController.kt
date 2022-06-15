package link.aorjoa.article

import link.aorjoa.pun.article.dto.request.Article
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/articles")
class ArticleController @Inject constructor(val articleService: ArticleService?) {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun hello(): List<Article>? {
        val ll = articleService?.list()
        return ll
    }
}