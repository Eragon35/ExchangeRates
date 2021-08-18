package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CurrencyController {
    @PostMapping("ratio")
    public double ratio(@RequestBody String cur1, String cur2) {
        System.out.println(cur1 + " " + cur2);
        double ratio = 2.0;
        return ratio;
    }
}
