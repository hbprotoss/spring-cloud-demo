package io.hbprotoss.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }

    @RequestMapping("/lag")
    public int lag(@RequestParam int number) throws InterruptedException {
        if (number > 10) {
            throw new IllegalArgumentException("number > 10");
        }
        Thread.sleep(number * 1000);
        return number * 2;
    }
}