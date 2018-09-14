package com.cutiechi.demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Web App 配置类, 相当于 web.xml
 *
 * @author Cutie Chi
 */
public class WebAppConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses () {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses () {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings () {
        return new String[0];
    }
}
