package co.develhope.Angelo.Deploy02.Exercise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BasicController {

    @Autowired
    private Environment environment;

    //returns the sum of 2 random integers
    @GetMapping("/sum")
    public double mainEndpoint(){
        // Generate random number
        Double random1 = 1 + Math.random();
        Double random2 = 1 + Math.random();
        return random1*random2;
    }
}
