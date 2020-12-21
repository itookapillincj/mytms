package org.itcase.tms.service;/*
 *ClassName:ExitLoginService
 *UserName:小阎王丷
 *CreateTime:2020/10/10 11:23
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/exit")
public class ExitLoginService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        //删除session中Account属性
        session.removeAttribute("ACCOUNT");
        //使session无效
        session.invalidate();
        Cookie cookie=new Cookie("username",null);
        resp.addCookie(cookie);
        resp.sendRedirect("login.html");
    }
}
