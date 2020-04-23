package com.jmax4you.learn.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author max.zheng
 * @date 2020-03-31 18:26
 */
@EnableAdminServer
@SpringBootApplication
public class App4Admin {
    public static void main(String[] args) {
        SpringApplication.run(App4Admin.class, args);
    }
}
