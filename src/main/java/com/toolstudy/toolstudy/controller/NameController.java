package com.toolstudy.toolstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("names")
public class NameController {
    @GetMapping("person")
    public String getPersonName() {
        return "Giovanni";
    }
    @GetMapping("city")
    public String getCityName() {
        return "Nova Trento";
    }
}


