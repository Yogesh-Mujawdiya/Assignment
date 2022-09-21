package com.dairy.controller;

import com.dairy.model.Company;
import com.dairy.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/company")
@CrossOrigin
public class CompanyController {
    @Autowired
    CompanyRepository companyRepository;

    @GetMapping("/")
    public ResponseEntity<List<Company>> getAllCompanies() {
        try {
            return new ResponseEntity<>(companyRepository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/count")
    public ResponseEntity<Long> getAllCompaniesCount() {
        try {
            return new ResponseEntity<>(companyRepository.count(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<Company> getCompanyById(@PathVariable("id") Integer id) {
        Optional<Company> companyData = companyRepository.findById(id);
        return companyData.map(company -> new ResponseEntity<>(company, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/")
    public ResponseEntity<Company> createCompany(@RequestBody Company company) {
        try {
            return new ResponseEntity<>(companyRepository.save(company), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Company> updateCompany(@PathVariable("id") Integer id, @RequestBody Company company) {
        Optional<Company> companyData = companyRepository.findById(id);
        if (companyData.isPresent()) {
            company.setId(id);
            return new ResponseEntity<>(companyRepository.save(company), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCompany(@PathVariable("id") Integer id) {
        try {
            companyRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/")
    public ResponseEntity<HttpStatus> deleteAllCompanies() {
        try {
            companyRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}