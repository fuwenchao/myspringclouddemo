package me.springcloud.getclientjars.controller;

import com.netflix.discovery.converters.Auto;
import me.springcloud.getclientjars.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenchaofu
 * @date 2018/4/17 14:39
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Value("${server.port}")
    String port;

    @Autowired
    HelloService helloService;

    @GetMapping("/sayhello")
    public String sayhi(String name){
        return "hello this world "+name+" port: "+ port;
    }

    @GetMapping("/call")
    public String call(String name){
        return helloService.hiForZipkin(name);
    }

    @GetMapping("/info")
    public String info(String name){
        return helloService.info(name);
    }
}
