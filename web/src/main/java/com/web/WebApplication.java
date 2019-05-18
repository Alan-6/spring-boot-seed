package com.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author LuHailun
 * @Title: WebApplication
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/12 18:07
 */
@SpringBootApplication
@MapperScan("com.web.dao.mapper")
@EnableSwagger2
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
