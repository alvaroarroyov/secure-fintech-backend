package com.security.app;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JwtUtils {

   
    private final SecretKey key = Jwts.SIG.HS256.key().build();

    //  1 hour (3600000 ms)
    private final long EXPIRATION_TIME = 3600000;

    public String generateToken(String username) {
        return Jwts.builder()
                .subject(username) // .setSubject() ahora es .subject()
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(key)
                .compact();
    }

    public boolean validateToken(String token) {
        try {
            
            Jwts.parser()
                .verifyWith(key)
                .build()
                .parseSignedClaims(token);
            return true;
        } catch (Exception e) {
            
            return false;
        }
    }
    
    public String extractUsername(String token) {
        return Jwts.parser()
                .verifyWith(key)
                .build()
                .parseSignedClaims(token)
                .getPayload() // .getBody() ahora es .getPayload()
                .getSubject();
    }
}