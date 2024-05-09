package kr.mjc.koh.kmc2024.servlets

import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

@WebServlet("/servlets/hello")
class HelloServlet : HttpServlet() {
    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {

        resp.contentType = "text/html"  //요청
        resp.writer.println("<html><body><h1><Hello, 서블릿!></h1></body></html>")  // 응답
    }
}