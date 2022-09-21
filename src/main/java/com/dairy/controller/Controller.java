package com.dairy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class Controller {

    @GetMapping("/palindrome")
    public ResponseEntity<Boolean> getAllCompanies() {

            return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);

    }
}