package com.in28minutes.microservices.limitsservice.controller;

import com.in28minutes.microservices.limitsservice.config.Configuration;
import com.in28minutes.microservices.limitsservice.entity.Limits;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitsController {

    private final Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
