package com.example.jmsstart.component;

import com.example.jmsstart.Email;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch() {
        return latch;
    }

    @JmsListener(destination = "email.q")
    public void receive(Email email) {
        System.out.println("receive email : " + email);
        latch.countDown();
    }

}
