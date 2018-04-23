package me.springcloud.ribbonservice.controller;

import me.springcloud.ribbonservice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenchaofu
 * @date 2018/4/19 15:01
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value="/test")
    public String test(){
        return "this is a test";
    }
    @RequestMapping(value="/hi")
    public String hi(@RequestParam String name){
        return helloService.sayHello(name);
    }
}
