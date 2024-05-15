package com.antifraud.msantifraud.controller;

import com.antifraud.msantifraud.kafka.producer.AntifraudProducer;
import com.antifraud.msantifraud.model.AntifraudEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bibia")
public class BeatrizBortolucciController {
    private final AntifraudProducer producer;

    @GetMapping
    public String beatrizDizOi() {
        return "Olá, sou a Beatriz Bortolucci Domingos";
    }

    @PostMapping
    public void beatrizMandaMsg() {
        var event = new AntifraudEvent("39391215840");

        producer.send("cons_antifraude", event);
    }
}
