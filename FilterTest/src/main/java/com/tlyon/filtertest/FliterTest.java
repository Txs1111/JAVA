package com.tlyon.filtertest;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 2021年8月18日17:44:47
 *
 * @author Lyon
 */
public class FliterTest implements Filter {
    /**
     * 来访数量
     */
    private int count;

    public void init(FilterConfig filterConfig) throws ServletException {
        //初始化参数
        String param = filterConfig.getInitParameter("count");
        //将字符串转换为int
        count = Integer.valueOf(param);
        System.out.println("init");
    }

    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        count++;
        //将ServletRequest装换为HttpServletRequest
        HttpServletRequest req = (HttpServletRequest) request;
        //获取ServletContent
        ServletContext context = req.getSession().getServletContext();
        //将来访数量值放入ServletContext
        context.setAttribute("count", count);
        //向下传递过滤器
        System.out.println("dofilter_request");
        chain.doFilter(request, response);
        System.out.println("dofilter_response");
    }

    public void destroy() {
        System.out.println("detroy");
    }
}
















