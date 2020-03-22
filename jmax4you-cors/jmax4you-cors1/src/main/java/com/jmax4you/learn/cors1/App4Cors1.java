package com.jmax4you.learn.cors1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author max.zheng
 * @date 2020-03-21 20:10
 */
@SpringBootApplication
public class App4Cors1 {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(App4Cors1.class);
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
