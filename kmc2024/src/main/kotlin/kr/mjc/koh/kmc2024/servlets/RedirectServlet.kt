package kr.mjc.koh.kmc2024.servlets

import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

@WebServlet("/servlets/redirect")
class RedirectServlet : HttpServlet() {
    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {
        // TODO: 어떤 처리를 한 후에 redirect
        resp.sendRedirect("${req.contextPath}/servlets/template")
        /*forward와 다르게 컨텍스트 지정해줘야됨 그리고 다른서버로 보낼경우엔
        그 서버 주소 입력해주면 됨 */
    }
}