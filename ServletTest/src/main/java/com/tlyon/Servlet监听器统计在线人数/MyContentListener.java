package com.tlyon.Servlet监听器统计在线人数;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class MyContentListener
 */
@WebListener("This is only a demo listener")
public class MyContentListener implements ServletContextListener {

    /**
     * Default constructor.
     */
    public MyContentListener() {
        // TODO Auto-generated constructor stub
    }

    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub

    }

    public void contextInitialized(ServletContextEvent arg0) {
        // TODO Auto-generated method stub

    }


}
