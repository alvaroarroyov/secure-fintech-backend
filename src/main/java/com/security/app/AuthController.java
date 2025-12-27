package com.security.app;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private JwtUtils jwtUtils;

   
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String username) {
        
      
        String token = jwtUtils.generateToken(username);
        
        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        response.put("message", "Login exitoso. Usa este token para acceder a /secure-data");
        
        return ResponseEntity.ok(response);
    }

   
    @GetMapping("/secure-data")
    public ResponseEntity<?> getSecureData() {
        Map<String, String> data = new HashMap<>();
        data.put("secret", "JWT Access token valid.");
        data.put("balance", "$1,000,000 USD");
        
        return ResponseEntity.ok(data);
    }
}