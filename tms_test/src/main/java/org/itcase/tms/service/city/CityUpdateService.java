package org.itcase.tms.service.city;/*
 *ClassName:CityUpdateService
 *UserName:小阎王丷
 *CreateTime:2020/10/30 16:14
 */

import org.itcase.tms.dao.CityDao;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

@WebServlet(urlPatterns = "/updateCity")
public class CityUpdateService extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        System.out.println("dopost");
        //获取从客户端提交过来的参数
        int id=Integer.parseInt(request.getParameter("id"));
        String cityName= request.getParameter("cityName");
        String orgId= request.getParameter("orgId");
        ServletContext context= request.getServletContext();
        Properties pt= (Properties)context.getAttribute("CITY_CODE_DATA");
        String cityCode=pt.getProperty(cityName);
        CityDao dao=new CityDao();
        int n=dao.updateCity(cityName,orgId,cityCode,id);
        if(n>0){
            out.println("{\"msg\":\"success\"}");
        }else {
            out.println("{\"msg\":\"fail\"}");
        }
    }
}
