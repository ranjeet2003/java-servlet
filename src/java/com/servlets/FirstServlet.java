
package com.servlets;
import javax.servlet.*;

public class FirstServlet implements Servlet{
//    lifecycle method
    ServletConfig conf;
    public void init(ServletConfig conf){
        this.conf=conf;
        System.out.println("Creating objects");
    }
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
    {
        System.out.println("Servicing...........");
    }
    public void destroy(){
        System.out.println("going to destroy objects");
    }
//    non life cycle method
    public ServletConfig getServletConfig(){
        return this.conf;
    }
    public String getServletInfo(){
        return "this servlet is created by ranjeet gautam";
    }
}
