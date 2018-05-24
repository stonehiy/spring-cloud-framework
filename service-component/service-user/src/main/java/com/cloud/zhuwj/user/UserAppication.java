package com.cloud.zhuwj.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author zhuwj
 * @version V1.0
 * @Description: 用户服务启动入口
 * @date 2018/1/21.
 */
@EnableWebMvc
@Configuration
@EnableEurekaClient
@EnableFeignClients
@EnableScheduling
@SpringBootApplication
@ComponentScan(basePackages={"com.cloud.zhuwj"})
@MapperScan("com.cloud.zhuwj.user.dao")
public class UserAppication {
    public static void main(String[] args) {
        SpringApplication.run(UserAppication.class, args);
    }
}
