//package com.config;
//
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;
//
//public class ServletConfig1 extends AbstractDispatcherServletInitializer {
//    protected WebApplicationContext createServletApplicationContext() {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(SpringMvcConfig.class);
//        return ctx;
//    }
//
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//
//    protected WebApplicationContext createRootApplicationContext() {
//        return null;
//    }
//}
