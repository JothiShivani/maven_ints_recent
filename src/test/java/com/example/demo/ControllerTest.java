package com.example.demo;

import com.example.demo.Controller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControllerTest{
@Test
void testAdd() {
    Controller controller = new Controller();
    int result = controller.add();
    assertEquals(3, result, "The add() method should return the sum of 1 and 2.");
}

}

