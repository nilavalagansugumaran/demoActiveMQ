package com.example.demoActiveMQ;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyReceiverComponent {

    @JmsListener(destination = "simpleMessageBox")
    public void receiverSimpleMessage(String message) {

        log.debug("received simple message >>> {}" , message);
    }
}
