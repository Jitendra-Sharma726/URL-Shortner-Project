# URL-Shortner-Project
### URL Shortener Project Description

The **URL Shortener Project** is a backend application built using **Spring Boot** that transforms long URLs into short, easy-to-share links. The application exposes REST APIs that allow users to submit a lengthy URL and receive a unique short code in return. When the generated short URL is accessed, the system automatically redirects the user to the original destination.

This project demonstrates the implementation of a **Layered Architecture** commonly used in enterprise applications, consisting of:

* **Controller Layer** – Handles HTTP requests and responses.
* **Service Layer** – Contains business logic for generating and managing short URLs.
* **Repository Layer** – Manages data storage using an in-memory HashMap.
* **Model Layer** – Represents request data transferred between client and server.

### Key Features

* Generate a unique short code for any valid URL.
* Redirect users from a short URL to the original URL.
* Store URL mappings in memory using a HashMap.
* Use **MD5 hashing** to create deterministic and compact short codes.
* Implement RESTful APIs using Spring Boot annotations.
* Follow Dependency Injection and Separation of Concerns principles.

### Technical Workflow

1. A user sends a POST request containing a long URL.
2. The Service layer generates an MD5 hash of the URL.
3. The first six characters of the hash are used as the short code.
4. The Repository stores the mapping between the short code and original URL.
5. The API returns the generated short code to the user.
6. When a user accesses the short URL, the Controller retrieves the original URL from storage and responds with an HTTP **302 Redirect**, directing the browser to the destination website.

### Learning Objectives

By completing this project, learners will gain hands-on experience with:

* Spring Boot REST API development
* Layered application architecture
* Dependency Injection
* Repository and Service patterns
* Request/Response handling
* HTTP status codes (302 Redirect, 404 Not Found)
* Hashing techniques using MD5
* In-memory data storage with HashMap
* JSON serialization and deserialization

### Expected Outcome

After implementing all TODO sections, the application will function as a complete URL shortening service capable of:

* Accepting long URLs through a REST API.
* Generating consistent short codes.
* Storing URL mappings efficiently.
* Redirecting users to the original URL using the generated short link.

This project provides a practical introduction to building scalable backend services and demonstrates core Spring Boot concepts used in real-world web applications.
