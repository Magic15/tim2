package com.example.tim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TimApplication extends SpringBootServletInitializer
{
    public static void main(String[] args)
    {
        SpringApplication.run(TimApplication.class, args);
    }
}
