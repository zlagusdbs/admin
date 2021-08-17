package com.solji.admin.controller.health;

import com.solji.admin.service.health.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/health")
public class HealthController {
    @Autowired
    private HealthService healthService;


    @GetMapping(value = "/check")
    public String healthCheck(){
        return healthService.healthCheck();
    }
}
