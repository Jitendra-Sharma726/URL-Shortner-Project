package com.example.demo.service;

import com.example.demo.repository.UrlRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class UrlService {

    private final UrlRepository urlRepository;

    // Constructor Injection
    public UrlService(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    // Method: To Shorten URL
    public String shortenUrl(String originalUrl) {
        String fullHash = DigestUtils.md5DigestAsHex(originalUrl.getBytes());
        String shortCode = fullHash.substring(0, 6);

        if (!urlRepository.exists(shortCode)) {
            urlRepository.saveUrl(shortCode, originalUrl);
        }
        return shortCode;
    }

    // Method: To Retrieve Original URL
    public String getOriginalUrl(String shortCode) {
        return urlRepository.getOriginalUrl(shortCode);
    }
}


