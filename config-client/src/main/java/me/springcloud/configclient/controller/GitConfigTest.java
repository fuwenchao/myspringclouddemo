package me.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenchaofu
 * @date 2018/4/20 11:25
 */
@RestController
@RefreshScope
public class GitConfigTest {

    @Value("${foo}")
    String foo;

    @RequestMapping("/hi")
    public String hi(String name){
        return name + " in config client " + foo;
    }
}
