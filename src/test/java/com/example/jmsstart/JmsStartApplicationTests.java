package com.example.jmsstart;

import com.example.jmsstart.component.Receiver;
import com.example.jmsstart.component.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class JmsStartApplicationTests {

    @Autowired
    private Sender sender;

    @Autowired
    private Receiver receiver;

    @Test
    void test() throws Exception {
        Email email = new Email("test@test.com", "hello jms");
        sender.send(email);

        receiver.getLatch().await(1000, TimeUnit.MILLISECONDS);

    }

}
