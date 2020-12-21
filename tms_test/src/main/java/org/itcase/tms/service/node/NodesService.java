package org.itcase.tms.service.node;/*
 *ClassName:NodesService
 *UserName:小阎王丷
 *CreateTime:2020/11/15 15:14
 */

import com.alibaba.fastjson.JSON;
import org.itcase.tms.dao.NodeDao;
import org.itcase.tms.pojo.Nodes;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/tms_nodes")
public class NodesService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json;charset=utf-8");
        NodeDao dao=new NodeDao();
        List<Nodes> nodelist =dao.getNodes();
        PrintWriter out=resp.getWriter();
        String jsonString = JSON.toJSONString(nodelist);
        out.println(jsonString);
    }
}
