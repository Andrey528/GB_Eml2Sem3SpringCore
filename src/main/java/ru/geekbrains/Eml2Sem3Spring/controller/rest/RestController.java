package ru.geekbrains.Eml2Sem3Spring.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/ciao")
    public String ciao() {
        return "ciao";
    }
}
