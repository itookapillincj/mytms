package org.itcase.tms.service;/*
 *ClassName:RegService
 *UserName:小阎王丷
 *CreateTime:2020/10/10 15:43
 */


import org.itcase.tms.dao.UserDao;
import org.itcase.tms.mail.CodeUtil;
import org.itcase.tms.mail.MailUtil;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/regaccount")
public class RegService extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        System.out.println("注册");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        CodeUtil codeUtil=new CodeUtil();
        String code=codeUtil.stringCodeUtil();
        UserDao dao = new UserDao();
        int id = dao.addAccount(name, email, password, code);
        if (id > 0) {
           new Thread(new MailUtil(email,code)).start();
           resp.sendRedirect("login.html");
        }
    }
    @Override
    public void destroy() {
        System.out.println("销毁servlet");
    }
}
