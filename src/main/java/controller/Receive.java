package controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receive {
    @RabbitListener


    public void doReceive(){
        System.out.println("do receive...");
    }
}
