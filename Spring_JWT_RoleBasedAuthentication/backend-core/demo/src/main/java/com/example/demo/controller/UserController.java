package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*")
public class UserController {

    @GetMapping("/dashboard")
    public Map<String, String> getUserDashboard() {
        return Map.of("message", "Welcome to the Secure User Dashboard! Profile Active.");
    }
}
