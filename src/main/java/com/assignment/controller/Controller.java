package com.assignment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class Controller {

    @GetMapping("/palindrome/{string}")
    public ResponseEntity<Boolean> isPalindrome(@PathVariable("string") String str) {
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        if (str.equals(sbr.toString())) {
            return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
        }
        return new ResponseEntity<>(Boolean.FALSE, HttpStatus.OK);
    }


    @GetMapping("/ascii/")
    public ResponseEntity<String> getAscii(@RequestParam("url") String url) {
        return new ResponseEntity<>(url.replaceAll(" ", "%20"), HttpStatus.OK);
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
        if(matrix.size()!=matrix.get(0).size())
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        List<List<Integer>> transposeMatrix = new ArrayList<>();
        for(int row=0;row<matrix.size();row++) {
            List<Integer> m = new ArrayList<>();
            for (int col = 0; col < matrix.get(row).size(); col++)
                m.add(matrix.get(col).get(row));
            transposeMatrix.add(m);
        }
        return new ResponseEntity<>(transposeMatrix, HttpStatus.OK);
    }

    @GetMapping("/substring/{string}")
    public ResponseEntity<Boolean> isSubstring(@PathVariable("string") String str) {
        HashSet<Character> char_set = new HashSet<>();
        for(int c  = 0; c< str.length();c++)
            char_set.add(str.charAt(c));
        return new ResponseEntity<>(char_set.size() == str.length(), HttpStatus.OK);
    }
}
