package org.itcase.tms.service.city;/*
 *ClassName:CityNodeService
 *UserName:小阎王丷
 *CreateTime:2020/11/13 11:39
 */

import com.alibaba.fastjson.JSON;
import org.itcase.tms.dao.CityDao;
import org.itcase.tms.dto.NodeDto;
import org.itcase.tms.pojo.Node;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/getnode")
public class CityNodeService extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json;charset=utf-8");
        int city_id=Integer.parseInt(req.getParameter("id"));
        CityDao dao=new CityDao();
        List<NodeDto> nodelist =dao.getCityNode(city_id);
        PrintWriter out=resp.getWriter();
        String jsonString = JSON.toJSONString(nodelist);
        out.println(jsonString);

    }
}
