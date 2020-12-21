package org.itcase.tms.service.city;/*
 *ClassName:CityManagerService
 *UserName:小阎王丷
 *CreateTime:2020/9/27 10:22
 */

import org.itcase.tms.dao.TmsCityDao;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

@WebServlet(urlPatterns="/add_city")
public class CityManagerService extends HttpServlet {
   /* @Override
    public void init() throws ServletException {
        System.out.println("调用init");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("调用init,参数为cinfig");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      System.out.println("服务提供者");
      if (req.getMethod().equalsIgnoreCase("get")){
          doGet(req,resp);
      }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("调用doget");
    }

    @Override
    public void destroy() {
        System.out.println("程序销毁");
    }*/



//        String cityName=req.getParameter("cityName");
//        String orgId=req.getParameter("orgId");
//        ServletContext servletContext
//        System.out.println(cityName);
//        System.out.println(orgId);
//        TmsCityDao dao=new TmsCityDao();
//        int count=dao.AddCity(cityName,orgId,);
//        System.out.println(count);
//


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        //System.out.println("调用了doget请求");
        PrintWriter out=response.getWriter();
        //获取从客户端提交过来的参数
        String cityName= request.getParameter("cityName");
        String orgId= request.getParameter("orgId");
        //根据城市名称查找城市代码
        ServletContext context= request.getServletContext();
        Properties pt= (Properties)context.getAttribute("CITY_CODE_DATA");
        String cityCode=pt.getProperty(cityName);
       //调用dao中的AddCity方法存储数据
        TmsCityDao dao=new TmsCityDao();
        int n=dao.AddCity(cityName,cityCode,orgId);
        if(n>0){
            out.println("{\"msg\":\"success\"}");
        }else {
            out.println("{\"msg\":\"fail\"}");
        }
    }

    @Override
    public void destroy() {
        System.out.println("销毁servlet");
    }
}
