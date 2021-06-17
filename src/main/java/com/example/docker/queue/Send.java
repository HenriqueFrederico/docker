package com.example.docker.queue;

import com.example.docker.model.Pessoa;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Send {

    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public Send(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(Pessoa pessoa) {
        rabbitTemplate.convertAndSend(Config.EXCHANGE_DOCKER, "foo.docker", pessoa);
    }
}

