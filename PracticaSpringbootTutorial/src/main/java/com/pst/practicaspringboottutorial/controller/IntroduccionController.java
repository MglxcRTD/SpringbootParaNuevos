package com.pst.practicaspringboottutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IntroduccionController {
    String rutaDatos = "../consltas.json";

    @GetMapping("/estado")
    public String intro(){
        return "Introduccion Controller";
    }

    @PostMapping("")
    public void create(){

    }

    public void read(){

    }

    public void update(){

    }

    public void delete(){

    }

}
