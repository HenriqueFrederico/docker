package com.example.docker.queue;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Config {

    private static final String QUEUE_ACCOUNT_PRINTER = "docker";
    static final String EXCHANGE_DOCKER = "exchange-docker";

    @Bean
    Queue queue() {
        return new Queue(QUEUE_ACCOUNT_PRINTER, true);
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange(EXCHANGE_DOCKER);
    }

    @Bean
    Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("foo.docker");
    }
}
