package com.antifraud.msantifraud.controller;

import com.antifraud.msantifraud.kafka.producer.AntifraudProducer;
import com.antifraud.msantifraud.model.AntifraudEvent;
import com.antifraud.msantifraud.model.AntifraudResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    public void beatrizMandaMsg(@RequestBody final AntifraudEvent event) {
        producer.send("cons_antifraude", event.getCpf());
    }
}
