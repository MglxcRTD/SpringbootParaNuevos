package com.pst.practicaspringboottutorial.controller;

import com.pst.practicaspringboottutorial.models.Persona;
import com.pst.practicaspringboottutorial.servicios.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class IntroduccionController {
    String rutaDatos = "../consultas.json";

    @Autowired
    PersonaService personaService;

    @GetMapping("/estado")
    public String intro(){
        return "Introduccion Controller";
    }

    @PostMapping("")
    public void create(){

    }

    @GetMapping("/getpersona")
    public Persona read(@RequestBody String nombre){
        Persona p = personaService.buscarpersona(nombre);
        return p;
    }

    @PutMapping("")
    public void update(){

    }

    @DeleteMapping("")
    public void delete(){

    }

}
