package com.example.jmsstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JmsStartApplication {


    public static void main(String[] args) {
        SpringApplication.run(JmsStartApplication.class, args);
    }

    @PostConstruct
    public void call() {
        System.out.println("called");
        //Order order = new Order();
        //jmsOrderMessagingService.sendOrder(order);
    }

}
