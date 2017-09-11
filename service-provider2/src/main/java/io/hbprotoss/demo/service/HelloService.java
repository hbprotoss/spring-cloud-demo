package io.hbprotoss.demo.service;

import javax.jws.WebService;

@WebService
public interface HelloService {
    String echo(String src);
}
