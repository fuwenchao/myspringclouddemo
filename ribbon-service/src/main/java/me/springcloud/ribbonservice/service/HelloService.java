package me.springcloud.ribbonservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wenchaofu
 * @date 2018/4/19 14:57
 */

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "meetError")
    public String sayHello(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT-SERVICE-PROVIDER/hello/sayhello?name="+name,String.class);
    }

    public String meetError(String name){
        return "sorry," + name + " I got a mistake";
    }
}

