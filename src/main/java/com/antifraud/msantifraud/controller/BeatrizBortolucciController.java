package com.antifraud.msantifraud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bibia")
public class BeatrizBortolucciController {
    @GetMapping
    public String beatrizDizOi() {
        return "Olá, sou a Beatriz Bortolucci Domingos";
    }
}
