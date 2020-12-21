package org.itcase.tms.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;


public class LoginFilter implements Filter {

    List<String> unFilterPathList = new ArrayList<>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化过滤器");
        Enumeration<String> enumer = filterConfig.getInitParameterNames();
        while (enumer.hasMoreElements()){
            String pathName = enumer.nextElement();
            unFilterPathList.add(filterConfig.getInitParameter(pathName));
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       // System.out.println("过滤器拦截了请求");
        // /tms_test/login.html ,/tms_test/userlogin 不需要过滤

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String path = request.getRequestURI();
        //System.out.println(path);
        //如果包含了不需要拦截处理的路径则放行
        if (this.unFilterPathList.contains(path)){
            //if (path.toString().contains(".css")||path.toString().contains(".js")||path.toString().contains(".jpg")) {
                //调用过滤器，如果没有下一个过滤器，则直接转到请求的资源（服务）
                filterChain.doFilter(servletRequest, servletResponse);
                return;

        }
        //获取登陆信息
        HttpSession session = request.getSession();
        Object account = session.getAttribute("ACCOUNT");
       // System.out.println("account:" +account );
        //如果没有登陆信息，则跳转到登陆页面
        if (account==null){
           // System.out.println("未登录，跳转到下一个页面");
            response.sendRedirect("login.html");
            return;
        }
        //放行,如果有下一个过滤器，则继续调用下一个过滤器，否则访问真正的服务器资源
        filterChain.doFilter(servletRequest, servletResponse);
    }
    @Override
    public void destroy() {

    }
}
