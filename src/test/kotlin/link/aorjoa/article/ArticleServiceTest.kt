package link.aorjoa.article

import io.quarkus.test.junit.QuarkusTest
import io.quarkus.test.junit.mockito.InjectMock
import io.restassured.RestAssured.given
import link.aorjoa.pun.article.dto.request.Article
import org.apache.http.HttpStatus
import org.bson.types.ObjectId
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import java.util.*


@QuarkusTest
class ArticleServiceTest {
    @InjectMock
    lateinit var articleRepository: ArticleRepository
    val articleList = listOf(
        Article("id1", "idc1", "ida1"),
        Article("id2", "idc2", "ida2")
    )

    @BeforeEach
    fun setup() {
        Mockito.`when`(articleRepository.listAll()).thenReturn(articleList)
    }

    @Test
    fun testListArticle() {
        val resp = given()
            .`when`().get("/articles")
            .then()
            .statusCode(HttpStatus.SC_OK)
            .extract()
            .body()
            .`as`(Array<Article>::class.java).toList()
        Assertions.assertEquals(resp, articleList)
    }
}