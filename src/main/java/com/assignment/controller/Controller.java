package com.assignment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class Controller {

    @GetMapping("/palindrome/{string}")
    public ResponseEntity<Boolean> isPalindrome(@RequestParam("string") String str) {
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        if (str.equals(sbr.toString())) {
            return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
        }
        return new ResponseEntity<>(Boolean.FALSE, HttpStatus.OK);
    }

    @GetMapping("/substring/")
    public ResponseEntity<Boolean> isSubstring(@RequestParam("s1") String s1, @RequestParam("s2") String s2) {
        if(s1.contains(s2)) {
            return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
        }
        return new ResponseEntity<>(Boolean.FALSE, HttpStatus.OK);
    }

    @PostMapping("/transpose/")
    public ResponseEntity<List<List<Integer>>> transposeMatrix(@RequestBody List<List<Integer>> matrix) {
        System.out.println(matrix.toString());
        if(matrix.size()!=matrix.get(0).size())
            return new ResponseEntity<>(null, HttpStatus.OK);
        List<List<Integer>> transposeMatrix;
        for(int row=0;row<matrix.size();row++) {
            List<Integer> m = new ArrayList<>();
            for (int col = 0; col < matrix.get(row).size(); col++)
                m.add(matrix.get(col).get(row))
        }
        return new ResponseEntity<>(matrix, HttpStatus.OK);
    }
}
