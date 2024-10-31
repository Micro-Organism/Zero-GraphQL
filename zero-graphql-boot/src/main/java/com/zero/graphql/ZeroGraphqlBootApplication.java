package com.zero.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.zero.graphql.common.queryresolvers")
public class ZeroGraphqlBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeroGraphqlBootApplication.class, args);
    }

}
