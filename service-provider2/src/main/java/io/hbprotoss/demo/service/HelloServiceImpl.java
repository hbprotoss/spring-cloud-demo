package io.hbprotoss.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String echo(String src) {
        return "echo " + src;
    }
}
