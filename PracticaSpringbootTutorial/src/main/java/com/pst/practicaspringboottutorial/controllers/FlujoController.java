package com.pst.practicaspringboottutorial.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FlujoController {

    @GetMapping("/intro")
    public String intro() {
        return "Introduccion Controller";
    }
}
