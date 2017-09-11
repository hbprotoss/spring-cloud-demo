package io.hbprotoss.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private HelloRemote helloRemote;

    @RequestMapping("/test")
    public String test(@RequestParam int param) {
        return String.valueOf(helloRemote.lag(param));
    }
}