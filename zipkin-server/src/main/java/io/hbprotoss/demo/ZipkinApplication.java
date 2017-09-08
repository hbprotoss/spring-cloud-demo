package io.hbprotoss.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.sleuth.stream.SleuthStreamAutoConfiguration;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication(exclude = SleuthStreamAutoConfiguration.class)
@EnableZipkinServer
public class ZipkinApplication {
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(ZipkinApplication.class);
//    }

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class);
    }
}
