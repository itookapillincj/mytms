package org.itcase.tms.service;/*
 *ClassName:UserService
 *UserName:小阎王丷
 *CreateTime:2020/9/16 11:47
 */
/**
 * userService是一个服务类，用于处理服务器的请求，并响应给服务
 */

import org.itcase.tms.dao.UserDao;
import org.itcase.tms.pojo.Account;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet(urlPatterns = "/userlogin")
public class UserService extends HttpServlet {
    /*
    处理客户端提交过来的get请求
    */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //添加cookie值
        Cookie cok1=new Cookie("x","1654487");
        resp.addCookie(cok1);
        //获取session对象
        HttpSession session= req.getSession();
        boolean isnew=session.isNew();
        System.out.println("是新的会话吗？"+isnew);
        //获取会话的id
        String sessionId=session.getId();
        System.out.println(sessionId);
        //重定向：重新定位到新的资源上
        resp.sendRedirect("main.html");
        // resp.setStatus(302);
       // resp.addHeader("Location","main.html");

        resp.setContentType("text/html;charset=utf-8");
//        System.out.println("调用了doget请求");
//        //获取输出流
//        PrintWriter out=resp.getWriter();
//             String username= req.getParameter("username");
//             String password= req.getParameter("password");
//            if (password!="^(?[a-zA-Z]+$)(?[A-Z0-9]+$)(?[A-Z\\W_]+$)(?[a-z0-9]+$)(?"){
//
//               out.println("密码必须包含字母，数字，且一个或多个字符");
//
//            }
//            if (password.length()<8){
//               out.println("密码长度不能小于8");
//
//             }

        }


/*
处理客户端提交过来的post请求
 */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession session=request.getSession();
//        //获取参数
//        String username= request.getParameter("username");
//        String password= request.getParameter("password");
//        //验证传入的参数是否符合要求（服务端参数验证）
//        //将数据传给dao，判断用户是否存在，如果正确，存到Httpsession中
//        //假如登录成功，将账户昵称存到cookie中
//        UserDao dao=new UserDao();
//        List<User> list= dao.checkAccount(username,password);
//        if (list.size()>0){
//            Cookie cookie=new Cookie("username",list.get(0).getUsername());
//            response.addCookie(cookie);
//            response.sendRedirect("main.html");
//        }else {
//            response.sendRedirect("erre.html");
//        }
//        session.setAttribute("LOGIN_USER",username);
//        session.setMaxInactiveInterval(3600);
//        System.out.println(session.getMaxInactiveInterval());
        HttpSession session = request.getSession();
        //获取参数
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        //验证传入的参数是否符合要求 (服务端参数验证)
        //创建DAO对象
        UserDao dao = new UserDao();
        Account account = null;
        //如果包含@说明传入的是email
        if(name.indexOf('@')!=-1) {
            account = dao.checkAccount(-1, name, password);
        }
        else {
            int id = Integer.parseInt(name);
            account = dao.checkAccount(id, null, password);
        }

        if(account != null) {
            if (account.getConfirmed_and_active() == 0) {
                response.sendRedirect("no_active.html");
            } else {
                session.setAttribute("ACCOUNT", account);
                Cookie cookie1 = new Cookie("acc_name", account.getName());
                Cookie cookie2 = new Cookie("acc_id", account.getId() + "");
                response.addCookie(cookie1);
                response.addCookie(cookie2);
                response.sendRedirect("main.html");
            }
        }
        else {
            response.sendRedirect("erre.html");
        }
    }
}
