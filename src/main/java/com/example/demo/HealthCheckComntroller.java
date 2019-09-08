package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HealthCheckController {

    @GetMapping("/api/health")
    public String healthCheck(){
        return "21/08/19 3:00am still Bishal is here, application working";
    }
}
