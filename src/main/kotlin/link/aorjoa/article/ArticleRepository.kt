package link.aorjoa.article

import io.quarkus.mongodb.panache.PanacheMongoRepository
import link.aorjoa.pun.article.dto.request.Article
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class ArticleRepository: PanacheMongoRepository<Article> {}