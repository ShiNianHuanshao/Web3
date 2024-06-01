package com.example.web3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.web3.mapper")
public class Web3Application {

    public static void main(String[] args) {
        SpringApplication.run(Web3Application.class, args);
    }

}
