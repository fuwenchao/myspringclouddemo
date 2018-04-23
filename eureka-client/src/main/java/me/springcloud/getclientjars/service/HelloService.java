package me.springcloud.getclientjars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wenchaofu
 * @date 2018/4/22 22:03
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiForZipkin(String name){
        return restTemplate.getForObject("http://localhost:2010/hello/called?name="+name,String.class);
    }

    public String info(String name){
        return  "info-->" + name;
    }
}
