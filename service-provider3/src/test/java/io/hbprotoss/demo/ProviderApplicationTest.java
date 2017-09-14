package io.hbprotoss.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.sleuth.Span;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProviderApplicationTest {
    @Resource
    private Tracer tracer;

    @Test
    public void testTracer() throws InterruptedException {
        System.out.println(tracer);
        tracer.addTag("lalala", "123");
        Span span = tracer.createSpan("http:span");
        span.logEvent("Before Calling");
        Thread.sleep(1000L);
        span.logEvent("After Calling");
        tracer.close(span);
    }
}