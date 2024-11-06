package com.react.sumit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.react.sumit.Dto.EmployeeDto;
import com.react.sumit.service.Employeeservice;
@RestController
@RequestMapping("/get")
public class Controller {

    @Autowired
    private Employeeservice empservice;

    @CrossOrigin(origins = "http://localhost:5173")  // Correct port for React
    @PostMapping("/info")
    public ResponseEntity<String> getdata(@RequestBody EmployeeDto emp) {
        try {
            // Log the received data for debugging
            System.out.println("Received EmployeeDto: " + emp);

            // Save employee details using the service
            String result = empservice.savedetails(emp);

            // Return success response
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        } catch (Exception e) {
            // Log the error
            e.printStackTrace();
            // Handle exceptions and return error response
            return new ResponseEntity<>("Error saving employee data: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
