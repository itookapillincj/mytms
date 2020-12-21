package org.itcase.tms.service.city;/*
 *ClassName:UpdateNodeService
 *UserName:小阎王丷
 *CreateTime:2020/11/21 15:26
 */


import org.itcase.tms.dao.CityDao;
import org.itcase.tms.dto.NodeDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/update_node")
public class UpdateNodeService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String id = req.getParameter("city_id");
        int city_id = Integer.parseInt(id);
        CityDao dao = new CityDao();
        List list = dao.getNodestate(city_id);
        PrintWriter out = resp.getWriter();
        if (list.contains("1")){
            out.println("{\"msg\":\"fail\"}");
        }else {
            int n=dao.cancellationCity(city_id);
            if (n>0) {
                out.println("{\"msg\":\"success\"}");
            }
        }
    }
}



