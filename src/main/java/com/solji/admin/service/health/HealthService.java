package com.solji.admin.service.health;


import org.springframework.stereotype.Service;

@Service
public class HealthService {
    public String healthCheck(){
        return "ok";
    }
}
