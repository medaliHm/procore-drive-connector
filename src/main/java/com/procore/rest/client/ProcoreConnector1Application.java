package com.procore.rest.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ProcoreConnector1Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ProcoreConnector1Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ProcoreConnector1Application.class, args);
    }
}
