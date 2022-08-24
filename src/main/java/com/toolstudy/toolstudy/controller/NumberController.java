package com.toolstudy.toolstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("numbers")
public class NumberController {

    @GetMapping
    public Integer getNumber() {
        return 2022;
    }
}
