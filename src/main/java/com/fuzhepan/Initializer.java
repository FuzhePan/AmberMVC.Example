package com.fuzhepan;

import AmberMVC.RouteData;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by FuzhePan on 2016/3/12.
 */
public class Initializer implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        //×¢²áÂ·ÓÉ
        try {
            RouteData.getInstance().addActionInfo("/",new DefaultController(),DefaultController.class.getMethod("index"));
            RouteData.getInstance().addActionInfo("/default/index", new DefaultController(), DefaultController.class.getMethod("index"));
            RouteData.getInstance().addActionInfo("/default/login", new DefaultController(), DefaultController.class.getMethod("login"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
