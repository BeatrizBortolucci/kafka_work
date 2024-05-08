package com.antifraud.msantifraud.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bibia")
public class BeatrizBortolucciController {
//    private final KafkaProducer producer;

    @GetMapping
    public String beatrizDizOi() {
        return "Olá, sou a Beatriz Bortolucci Domingos";
    }

//    @PostMapping
//    public void beatrizMandaMsg() {
//        producer.publish("a", "vered_antifraude", "oi");
//    }
}
