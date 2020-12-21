package org.itcase.tms.service.city;/*
 *ClassName:CityInfoService
 *UserName:小阎王丷
 *CreateTime:2020/10/20 0:16
 */

import com.alibaba.fastjson.JSON;
import org.itcase.tms.dao.CityDao;
import org.itcase.tms.pojo.City_info;
import org.itcase.tms.pojo.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/city_info")
public class CityInfoService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json;charset=utf-8");
        String city_name=req.getParameter("city_name");
        if (city_name==null||"".equals(city_name)){
            PrintWriter out=resp.getWriter();
            CityDao dao=new CityDao();
            Page<City_info> list= dao.getCity(1,2,city_name);
            String jsonstring= JSON.toJSONString(list);
            out.println(jsonstring);
        }else {
            CityDao dao=new CityDao();
            Page<City_info> list= dao.getCity(1,2,city_name);
            PrintWriter out=resp.getWriter();
            String jsonString = JSON.toJSONString(list);
            out.println(jsonString);
        }
    }
}
