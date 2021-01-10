package ru.julia.leetcode180_consecutive.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.julia.leetcode180_consecutive.service.NumService;

import java.util.List;

@RestController
public class Leetcode180ConsecutiveController {
    NumService numService;

    public Leetcode180ConsecutiveController(NumService numService) {
        this.numService = numService;
    }

    @RequestMapping("/")
    public static String hi(){
        return "nananana";
    }
    @RequestMapping("/consequtiveNumber")
    public List<Integer> getConsecutiveNumbers(){
        return numService.getConsecutiveNumbers();
    }
}
