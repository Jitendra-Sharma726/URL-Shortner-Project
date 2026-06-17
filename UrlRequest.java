package com.example.demo.model;

public class UrlRequest {
    private String originalUrl;
    
    // Needed to convert JSON to Object
    public UrlRequest() {}

    // PARAMETERIZED CONSTRUCTOR
    public UrlRequest(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    // Getters and Setters
    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }
}


