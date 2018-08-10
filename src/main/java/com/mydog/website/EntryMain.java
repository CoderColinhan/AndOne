package com.mydog.website;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.mydog.dao")
@SpringBootApplication
@EnableTransactionManagement
public class EntryMain extends SpringBootServletInitializer{
    public static void main(String[] args){
        SpringApplication.run(EntryMain.class);
    }
}
