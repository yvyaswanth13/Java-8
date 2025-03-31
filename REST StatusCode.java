### **Common HTTP Status Codes in a Spring Boot REST API**  

When working with a REST API, status codes indicate the **result** of a request. Here are the most important ones:

---

### **1xx – Informational Responses**  
Not commonly used in REST APIs.

---

### **2xx – Success Responses**  
These indicate the request was successful.

| **Status Code** | **Meaning** | **When to Use?** |
|---------------|------------|----------------|
| **200 OK** | Request successful | `GET` requests (e.g., fetching users) |
| **201 Created** | Resource created successfully | `POST` requests (e.g., creating a user) |
| **204 No Content** | Successful, but no data to return | `DELETE` requests |

#### **Example in Spring Boot:**
```java
@PostMapping
public ResponseEntity<User> createUser(@RequestBody User user) {
    User savedUser = service.save(user);
    return ResponseEntity.status(201).body(savedUser); // Returns HTTP 201
}
```

---

### **3xx – Redirection Responses**  
These indicate the client should take additional action (e.g., follow a different URL).

| **Status Code** | **Meaning** | **When to Use?** |
|---------------|------------|----------------|
| **301 Moved Permanently** | The resource has a new URL | Used in URL changes |
| **302 Found** | Temporary redirection | Rarely used in APIs |

---

### **4xx – Client Errors**  
These indicate a problem with the **client’s request**.

| **Status Code** | **Meaning** | **When to Use?** |
|---------------|------------|----------------|
| **400 Bad Request** | Invalid request data | Missing fields in JSON/XML |
| **401 Unauthorized** | Authentication required | Login required |
| **403 Forbidden** | User does not have permission | Restricted access |
| **404 Not Found** | Resource not found | Wrong URL or missing user |
| **405 Method Not Allowed** | HTTP method not supported | `POST` on a `GET`-only endpoint |

#### **Example for Handling 404 Not Found:**
```java
@GetMapping("/{id}")
public ResponseEntity<User> getUser(@PathVariable Long id) {
    return service.findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.status(404).body(null)); // Returns HTTP 404
}
```

---

### **5xx – Server Errors**  
These indicate an issue with the **server or API**.

| **Status Code** | **Meaning** | **When to Use?** |
|---------------|------------|----------------|
| **500 Internal Server Error** | Generic server issue | Null pointer exception, DB errors |
| **502 Bad Gateway** | Server acting as a proxy failed | External API failures |
| **503 Service Unavailable** | Server is overloaded/down | Maintenance mode |

#### **Example of Handling 500 Errors Gracefully**
```java
@ExceptionHandler(Exception.class)
public ResponseEntity<String> handleException(Exception ex) {
    return ResponseEntity.status(500).body("Internal Server Error: " + ex.getMessage());
}
```

---

### **Key Takeaways**
- **2xx** → Success  
- **4xx** → Client error (fix the request)  
- **5xx** → Server error (fix the API)  

Would you like help implementing proper error handling for your Spring Boot app?
