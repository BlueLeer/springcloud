package com.lee.springcloud.register.servlet.config;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HttpServletBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author WangLe
 * @date 2019/7/16 10:06
 * @description 使用ServletRegistrationBean向Spring容器中添加Servlet, 效果和写在web.xml中是一样的
 */

@Configuration
public class ServletRegisterConfig {
    @Bean
    public ServletRegistrationBean httpServletBean() {
        HttpServletBean httpServletBean = new HttpServletBean() {
            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                resp.getWriter().write("hello servlet!");
            }
        };

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(httpServletBean);
        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.addUrlMappings("/hello");
        servletRegistrationBean.setName("servletRegistrationBean");

        return servletRegistrationBean;
    }
}
