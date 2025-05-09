package com.link.namjin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.link.namjin.board.mapper"})
public class NamjinApplication {

    public static void main(String[] args) {
        SpringApplication.run(NamjinApplication.class, args);
    }

}
