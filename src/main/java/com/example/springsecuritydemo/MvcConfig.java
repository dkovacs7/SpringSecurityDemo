package com.example.springsecuritydemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        //registry.addViewController("/home").setViewName("home"); // This line is commented out for just a login page and the hello page
        //registry.addViewController("/").setViewName("home"); // This line is commented out for just a login page and the hello page
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/").setViewName("hello");
        //registry.addViewController("/login").setViewName("login");  // Comment this out to use the default login page
    }

}