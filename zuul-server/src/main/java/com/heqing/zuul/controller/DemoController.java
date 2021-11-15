package com.heqing.zuul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heqing
 * @date 2021/7/16 16:34
 */
@RestController
@RequestMapping("/study")
public class DemoController {

    @GetMapping("/zuul")
    public String zuul(){
        return "hello zuul";
    }
}
