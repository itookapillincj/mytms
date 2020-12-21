package org.itcase.tms.service;/*
 *ClassName:MailServlet
 *UserName:小阎王丷
 *CreateTime:2020/10/15 15:57
 */

import org.itcase.tms.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns ="/mail")
public class MailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        UserDao dao=new UserDao();
        int n=dao.updatestate(req.getParameter("email"));
        if (n>0){
          resp.getWriter().println("激活成功");
          resp.sendRedirect("login.html");
        }
        resp.getWriter().println("激活失败");
    }
}
