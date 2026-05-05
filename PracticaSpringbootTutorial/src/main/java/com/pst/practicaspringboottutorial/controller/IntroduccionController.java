package com.pst.practicaspringboottutorial.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class IntroduccionController {
    String rutaDatos = "../consultas.json";

    @GetMapping("/estado")
    public String intro(){
        return "Introduccion Controller";
    }

    @PostMapping("")
    public void create(){

    }

    @GetMapping("")
    public void read(){

    }

    @PutMapping("")
    public void update(){

    }

    @DeleteMapping("")
    public void delete(){

    }

}
