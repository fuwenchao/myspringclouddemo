package me.springcloud.servicecalled.controller;

import me.springcloud.servicecalled.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenchaofu
 * @date 2018/4/22 22:14
 */

@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    HelloService helloService;

    @Value("${server.port}")
    String port;

    @GetMapping("/called")
    public String called(String name){
        return "called in " + port;
    }

    @GetMapping("/call")
    public String call(String name){
        return helloService.call(name);

    }

}
