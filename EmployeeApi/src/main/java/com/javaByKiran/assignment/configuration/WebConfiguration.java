package com.javaByKiran.assignment.configuration;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;

@Configuration
public class WebConfiguration {
	    @Bean
	    ServletRegistrationBean h2servletRegistration(){
	        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
	        registrationBean.addUrlMappings("/console/*");
	        return registrationBean;
	    }
	    
	    
	}


