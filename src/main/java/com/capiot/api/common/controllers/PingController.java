package com.capiot.api.common.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/ackoGI/api")
public class PingController {
    @GetMapping(value = "/v1/ping", produces = "application/json")
    public String pingService() {
        return "{\"ping\":\"OK\"}";
    }
}
