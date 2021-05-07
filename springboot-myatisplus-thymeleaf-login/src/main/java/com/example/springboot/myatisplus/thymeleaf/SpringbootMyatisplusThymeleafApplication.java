package com.example.springboot.myatisplus.thymeleaf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot.myatisplus.thymeleaf.mapper")
public class SpringbootMyatisplusThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMyatisplusThymeleafApplication.class, args);
    }

}
