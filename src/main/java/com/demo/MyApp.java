package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Sfy
 * @Date: 2020/7/14 0014
 */
@SpringBootApplication
@MapperScan("com.demo.mapper")
public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class);
    }
}
