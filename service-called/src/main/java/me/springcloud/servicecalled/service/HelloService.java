package me.springcloud.servicecalled.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wenchaofu
 * @date 2018/4/22 22:45
 */

@Service
public class HelloService {


    @Autowired
    RestTemplate restTemplate;

    public String call(String name){
        return restTemplate.getForObject("http://localhost:2001/hello/sayhello?name=" + name,String.class);
    }
}
