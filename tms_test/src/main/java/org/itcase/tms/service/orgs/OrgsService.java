package org.itcase.tms.service.orgs;/*
 *ClassName:OrgsService
 *UserName:小阎王丷
 *CreateTime:2020/9/29 14:09
 */

import com.alibaba.fastjson.JSON;
import org.itcase.tms.dao.OrgsDao;
import org.itcase.tms.pojo.Orgs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

@WebServlet(urlPatterns = "/orgs_mgr")
public class OrgsService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     resp.setContentType("text/json;charset=utf-8");
      Enumeration<String> enum1= req.getHeaderNames();
      while (enum1.hasMoreElements()){
          String key=enum1.nextElement();
          String value=req.getHeader("key");
          System.out.println(key+ ": " +value);
      }
      PrintWriter out= resp.getWriter();
        //创建dao对象，调用查询方法
        OrgsDao dao=new OrgsDao();
        List<Orgs> orgsList=dao.getOrgs();
      //  System.out.println(orgsList);
        //将集合转换为Json格式
       String jsonstring= JSON.toJSONString(orgsList);
        out.println(jsonstring);
       // System.out.println(jsonstring);
    }


}
