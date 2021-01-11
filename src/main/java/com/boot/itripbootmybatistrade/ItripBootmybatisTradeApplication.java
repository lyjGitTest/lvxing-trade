package com.boot.itripbootmybatistrade;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.controller","com.service","com.util"})
@MapperScan(basePackages = {"com.mapper"})
public class ItripBootmybatisTradeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItripBootmybatisTradeApplication.class, args);
    }

}
