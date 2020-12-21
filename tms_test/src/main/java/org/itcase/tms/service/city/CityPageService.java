package org.itcase.tms.service.city;/*
 *ClassName:CityPageService
 *UserName:小阎王丷
 *CreateTime:2020/10/27 15:02
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

@WebServlet(urlPatterns = "/page")
public class CityPageService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json;charset=utf-8");
        String pNo=req.getParameter("pageNo");
        String pSize=req.getParameter("pageSize");
        String city_name=req.getParameter("city_name");
        int pageNo = Integer.parseInt(pNo);
        int pageSize = Integer.parseInt(pSize);
        CityDao dao=new CityDao();
        Page<City_info> page = dao.getCity(pageNo, pageSize, city_name);
      //  List<City_info> list = page.getList();
        String jsonString = JSON.toJSONString(page);
        PrintWriter out = resp.getWriter();
        out.println(jsonString);
       }
    }

