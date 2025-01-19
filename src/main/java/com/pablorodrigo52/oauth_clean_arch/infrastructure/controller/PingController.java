package com.pablorodrigo52.oauth_clean_arch.infrastructure.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/public")
public class PingController {
    
    @GetMapping("/ping")
    public String pring() {
        return "pong";
    }
    
}
