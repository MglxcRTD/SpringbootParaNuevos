package com.pst.practicaspringboottutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IntroduccionController {

    @GetMapping("/estado")
    public String intro(){
        return "Introduccion Controller";
    }

}
