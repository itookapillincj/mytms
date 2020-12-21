package org.itcase.tms.service.node;/*
 *ClassName:SelectNodeService
 *UserName:小阎王丷
 *CreateTime:2020/11/19 10:01
 */

import com.alibaba.fastjson.JSON;
import org.itcase.tms.dao.NodeDao;
import org.itcase.tms.dto.NodesDto;
import org.itcase.tms.pojo.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/get_node")
public class SelectNodeService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json;charset=utf-8");
        String pNo=req.getParameter("pageNo");
        String pSize=req.getParameter("pageSize");
        String city_name=req.getParameter("city_name");
        String node_type=req.getParameter("node_type");
        String node_name=req.getParameter("node_name");
        int pageNo = Integer.parseInt(pNo);
        int pageSize = Integer.parseInt(pSize);
        NodeDao dao=new NodeDao();
        Page<NodesDto> page = dao.getNode(pageNo,pageSize,city_name,node_type,node_name);
        String jsonString = JSON.toJSONString(page);
        PrintWriter out = resp.getWriter();
        out.println(jsonString);
    }
    }

