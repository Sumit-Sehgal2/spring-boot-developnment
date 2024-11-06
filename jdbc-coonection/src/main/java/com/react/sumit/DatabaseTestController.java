package com.react.sumit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseTestController {

    @Autowired
    private DatabaseTestRepository repository;

    @GetMapping("/test-connection")
    public String testConnection() {
        try {
            int count = repository.getRecordCount();
            return "Connection successful. Number of records in the table: " + count;
        } catch (Exception e) {
            return "Connection failed: " + e.getMessage();
        }
    }
}

