package com.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybatis.mapper")
public class MybatisSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisSpringbootApplication.class, args);
    }

}
