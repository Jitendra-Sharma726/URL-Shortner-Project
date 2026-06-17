package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UrlRepository {

    // In-memory storage for URL mappings
    private final Map<String, String> urlStore = new HashMap<>();

    // Method: To Save URL
    public void saveUrl(String shortCode, String originalUrl) {
        urlStore.put(shortCode, originalUrl);
    }

    // Method: To Retrieve Original URL
    public String getOriginalUrl(String shortCode) {
        return urlStore.get(shortCode);
    }

    // Method: To Check if Short Code Exists
    public boolean exists(String shortCode) {
        return urlStore.containsKey(shortCode);
    }
    
    // Method: To Get All URL Mappings
    public Map<String, String> getAllUrls() {
        return urlStore;
    }
}


