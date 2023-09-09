package com.cybersoft.demospringboot02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Annotation: Định nghĩa đường dẫn
 * @Controller : Định nghĩa đuờng dẫn đc dùng để trả ra nội dung html
 * @ResponseBody : Giúp trả nội dung kiểu String
 * @RestController : Định nghĩa đường dẫn, nội dung trả về String (chuyên dùng để viết API)
 * => Dùng RestController
 */


// /hello, /hello/cybersoft
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello(){
        return "Hello String boot";
    }

    @GetMapping("/cybersoft")
    public String helloCybersoft(){
        return "Hello CyberSoft";
    }

}
