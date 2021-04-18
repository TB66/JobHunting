package com.tanben.jobhunting;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tanben.jobhunting.dao")
public class JobHuntingApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobHuntingApplication.class, args);
    }

}
