package org.itcase.tms.service;/*
 *ClassName:InitNodeDataService
 *UserName:小阎王丷
 *CreateTime:2020/11/23 20:43
 */

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.*;
import java.util.Properties;

public class InitNodeDataService extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        ServletContext ctx=config.getServletContext();
        InputStream in=ctx.getResourceAsStream("data/node_code.properties");
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
        ctx.setAttribute("NODE_CODE_DATA",properties);
    }
}
