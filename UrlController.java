package com.example.demo.controller;

import com.example.demo.model.UrlRequest;
import com.example.demo.service.UrlService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Collections;
import java.util.Map;

@RestController
public class UrlController {

    private final UrlService urlService;

    // Constructor Injection
    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    // POST: Create Short URL
    @PostMapping("/api/shorten")
    public ResponseEntity<Map<String, String>> shortenUrl(@RequestBody UrlRequest request) {

        // Generate Short Code
        String shortCode = urlService.shortenUrl(request.getOriginalUrl());
        
        // Return the short code in the response body as JSON
        // Returning JSON: { "shortCode": "5d4140" }
        return ResponseEntity.ok(Collections.singletonMap("shortCode", shortCode));
    }

    // GET: Redirect to Original URL
    @GetMapping("/{shortCode}")
    public ResponseEntity<Void> redirectToOriginal(@PathVariable String shortCode) {

        // Retrieve Original URL
        String originalUrl = urlService.getOriginalUrl(shortCode);

        // If not found, return 404 Not Found
        if (originalUrl == null) {
            return ResponseEntity.notFound().build();
        }

        // If found, redirect to the original URL 
        // Return HTTP 302 (Found/Redirect) with the Location header
        return ResponseEntity.status(302)
                .location(URI.create(originalUrl))
                .build();
    }
}


