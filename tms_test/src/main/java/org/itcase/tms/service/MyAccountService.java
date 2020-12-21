package org.itcase.tms.service;/*
 *ClassName:MyAccountService
 *UserName:小阎王丷
 *CreateTime:2020/10/9 14:51
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet(urlPatterns = "/myaccount")
public class MyAccountService extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
       Object obj= session.getAttribute("LOGIN_USER");
        System.out.println(obj);
        if (obj==null||"".equals(obj)){
            resp.sendRedirect("login.html");
        }else {
            resp.sendRedirect("mopass.html");
        }
        //        Cookie[] coi=req.getCookies();
//        for (int i = 0; i <coi.length ; i++) {
//            System.out.println(coi[i].getName()+"=0"+coi[i].getValue());
//        }
    }
}
