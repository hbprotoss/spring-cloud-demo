package io.hbprotoss.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RefreshScope
public class HelloController {

    @Value("${foo}")
    private String foo;

    @Resource
    private HelloRemote helloRemote;

    @RequestMapping("/test")
    public String test(@RequestParam int param) {
        return String.valueOf(helloRemote.lag(param));
    }

    @RequestMapping(value = "/foo")
    public String foo() {
        return foo;
    }

}