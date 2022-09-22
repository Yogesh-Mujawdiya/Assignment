package assignment.controller;

import com.assignment.controller.Controller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Controller.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ControllerTest {

    @Autowired
    Controller controller;

    @Test
    public void testValidPalindrome() {
        assertEquals(controller.isPalindrome("abba"), new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK));
    }

    @Test
    public void testInValidPalindrome() {
        assertEquals(controller.isPalindrome("prog8610"), new ResponseEntity<>(Boolean.FALSE, HttpStatus.OK));
    }

    @Test
    public void testAscii() {
        assertEquals(controller.getAscii("Assignment 1"), new ResponseEntity<>("Assignment%201", HttpStatus.OK));
    }

    @Test
    public void isValidSubstring() {
        assertEquals(controller.isSubstring("substring" , "string"), new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK));
    }

    @Test
    public void isInValidSubstring() {
        assertEquals(controller.isSubstring("substring", "strings"), new ResponseEntity<>(Boolean.FALSE, HttpStatus.OK));
    }

    @Test
    public void transposeMatrix() {
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(2, 3)
        );
        List<List<Integer>> transposeMatrix = Arrays.asList(
                Arrays.asList(0, 2),
                Arrays.asList(1, 3)
        );
        assertEquals(controller.transposeMatrix(matrix), new ResponseEntity<>(transposeMatrix, HttpStatus.OK));
    }

    @Test
    public void transposeMatrixWithInvalidData() {
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(0, 1, 3),
                Arrays.asList(2, 3)
        );
        assertEquals(controller.transposeMatrix(matrix), new ResponseEntity<>(null, HttpStatus.BAD_REQUEST));
    }

    @Test
    public void isSubstring() {
        assertEquals(controller.isSubstring("prog8610"), new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK));
        assertEquals(controller.isSubstring("abba"), new ResponseEntity<>(Boolean.FALSE, HttpStatus.OK));
    }
}
