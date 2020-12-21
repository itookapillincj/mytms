package org.itcase.tms.service.node;/*
 *ClassName:NodeManagerService
 *UserName:小阎王丷
 *CreateTime:2020/11/24 0:25
 */

import org.itcase.tms.dao.NodeDao;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/add_node")
public class NodeManagerService extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json;charset=utf-8");
        System.out.println("调用post");
        String city_name = req.getParameter("city_name");
        String node_type = req.getParameter("node_type");
        String node_name = req.getParameter("node_name");
        String node_remark = req.getParameter("node_remark");
        NodeDao dao = new NodeDao();
        int cityId = dao.getCityId(city_name);
        int node_id = dao.getNodeId(node_type);
        ServletContext context = req.getServletContext();
        int n=dao.addNodeInfo(node_name,node_remark,cityId,node_id);
        System.out.println(n);
        PrintWriter out =resp.getWriter();
        if (n>0){
            out.println("{\"msg\":\"success\"}");
        }else {
            out.println("{\"msg\":\"fail\"}");
        }
    }
}


