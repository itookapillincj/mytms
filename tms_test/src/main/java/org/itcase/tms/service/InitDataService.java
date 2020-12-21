package org.itcase.tms.service;/*
 *ClassName:initDataService
 *UserName:小阎王丷
 *CreateTime:2020/9/28 14:36
 */



import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.*;
import java.util.Properties;

public class InitDataService extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        ServletContext ctx=config.getServletContext();
        InputStream in=ctx.getResourceAsStream("data/city_code.properties");
        Reader reader=null;
        try {
            reader=new InputStreamReader(in,"gbk");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("初始化");
        //存储
        Properties properties=new Properties();
        try {
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(properties.size());
//        System.out.println(properties);
        ctx.setAttribute("CITY_CODE_DATA",properties);
    }
}
