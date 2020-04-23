package com.jmax4you.learn.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author max.zheng
 * @date 2020-03-27 17:20
 */
@SpringBootApplication
public class App4Design {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(App4Design.class);
        springApplication.run(args);
    }

    @Controller
    public class AppController {
        @RequestMapping(value = {"/"})
        public String index() {
            return "index";

        }
    }
}
