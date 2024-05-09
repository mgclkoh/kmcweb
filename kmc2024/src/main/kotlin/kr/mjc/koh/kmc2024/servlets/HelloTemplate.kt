package kr.mjc.koh.kmc2024.servlets

import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.beans.factory.annotation.Autowired
import org.thymeleaf.TemplateEngine
import org.thymeleaf.context.Context

@WebServlet("/servlets/template")
class HelloTemplate : HttpServlet() {

    @Autowired  //세터를 자동 지정해줌
    //세터 만들기 세터 injection이용해 지정
    lateinit var templateEngine: TemplateEngine

    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {
        resp.contentType = "text/html"
        templateEngine.process("examples/hello", Context(), resp.writer)
        /*val html =  templateEngine.process("examples/hello", Context()) 같은것
        resp.writer.println(html) */
    }
}