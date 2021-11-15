package com.heqing.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author heqing
 * @date 2021/7/14 10:40
 */
@SpringBootApplication
public class ZuulServerApplication {

    public static void main(String[] args) {
        new SpringApplication(ZuulServerApplication.class).run(args);
    }

}
