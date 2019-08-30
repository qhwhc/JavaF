package com.fast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author: cyb
 * @Date: 2019/8/1 10:38
 * @Version 1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class VelocityApplication {
    public static void main(String[] args) {
        SpringApplication.run(VelocityApplication.class);
    }
}
