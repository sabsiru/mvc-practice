package org.example.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/calculator")
public class CalculateServlet implements Servlet {

    private static final Logger log= Logger.getLogger(CalculateServlet.class.getName());

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        log.info("init");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        log.info("service");
    }

    @Override
    public void destroy() {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return "";
    }
}
