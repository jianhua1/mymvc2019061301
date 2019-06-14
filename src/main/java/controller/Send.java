package controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class Send {

    private RabbitTemplate rabbitTemplate;

    public void doSend(){
        System.out.println("send...");
        rabbitTemplate.convertAndSend("abcdefg...");
    }

    public void setRabbitTemplate(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate=rabbitTemplate;
    }
}
