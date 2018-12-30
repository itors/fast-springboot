package com.itors.fastspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author itors
 * @date 2018/12/28  - 下午11:12
 */
@SpringBootApplication
@MapperScan("com.itors.fastspringboot.mapper")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
