package kr.mjc.koh.kmc2024.servlets

import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.beans.factory.annotation.Autowired
import org.thymeleaf.TemplateEngine
import org.thymeleaf.context.Context

@WebServlet("/servlets/form")
class FormServlet : HttpServlet() {

    @Autowired
    lateinit var templateEngine: TemplateEngine

    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {  //요청하는 파라미터를 가져오는 것:doGet
        println("get processing...")
        val username = req.getParameter("username")
        val email = req.getParameter("email")
        val context = Context()
        context.setVariable("username", username)
        context.setVariable("email", email)

        resp.contentType = "text/html"
        templateEngine.process("examples/form", context, resp.writer)  //examples/form에 위의 가져온 컨텍스트들 넣음
    }

    override fun doPost(req: HttpServletRequest, resp: HttpServletResponse) {
        println("post processing...")
        val username = req.getParameter("username")
        val email = req.getParameter("email")
        val context = Context()
        context.setVariable("username", username)
        context.setVariable("email", email)

        resp.contentType = "text/html"
        templateEngine.process("examples/form", context, resp.writer)
    }
}