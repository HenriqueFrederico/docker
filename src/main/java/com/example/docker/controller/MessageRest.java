package com.example.docker.controller;

import com.example.docker.model.Pessoa;
import com.example.docker.queue.Send;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class MessageRest {

    private final Send send;

    public MessageRest(Send send) {
        this.send = send;
    }

    @PostMapping
    public void sendMessage(@RequestBody Pessoa pessoa) {
        send.sendMessage(pessoa);
    }
}
