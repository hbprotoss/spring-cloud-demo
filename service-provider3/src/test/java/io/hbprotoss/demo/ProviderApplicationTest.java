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
    public void testOneSpan() throws InterruptedException {
        tracer.addTag("lalala", "123");
        Span span = tracer.createSpan("http:span");
        span.logEvent("Before Calling");
        Thread.sleep(1000L);
        span.logEvent("After Calling");
        tracer.close(span);
    }

    @Test
    public void testTwoSpan() throws InterruptedException {
        tracer.addTag("lalala", "123");
        Span span = tracer.createSpan("http:span");
        span.logEvent("Before Calling");
        Thread.sleep(1000L);
        Span span2 = tracer.createSpan("http:span2", span);
        span2.logEvent("Before span2 Calling");
        Thread.sleep(1000L);
        span2.logEvent("After span2 Calling");
        tracer.close(span2);
        span.logEvent("After Calling");
        tracer.close(span);
    }
}