package link.aorjoa.article

import link.aorjoa.pun.article.dto.request.Article
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject


@ApplicationScoped
class ArticleService @Inject constructor(val articleRepository: ArticleRepository?){
    fun list(): List<Article>? {
        return articleRepository?.listAll()
    }
}