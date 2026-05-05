package com.pst.practicaspringboottutorial.servicios;

import com.pst.practicaspringboottutorial.models.Persona;
import com.pst.practicaspringboottutorial.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public Persona buscarpersona(String nombre) {
      Persona p = personaRepository.findbynombre(nombre).get();
      return p;
    }
}
