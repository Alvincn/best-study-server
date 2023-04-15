package com.example.bestStudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example")
public class BestStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BestStudyApplication.class, args);
    }

}
