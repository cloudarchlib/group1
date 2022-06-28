package com.mahesh.app.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class AppConsumer {
    @JmsListener(destination = "${jms.queue.destination}")
    public void receive(String msg){
        System.out.println("Got Message: " + msg);
    }
}
