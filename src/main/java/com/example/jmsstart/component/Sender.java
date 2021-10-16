package com.example.jmsstart.component;

import com.example.jmsstart.Email;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    private final JmsTemplate jmsTemplate;

    public Sender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void send(Email email) {
        jmsTemplate.convertAndSend("email.q", email);
    }

}
