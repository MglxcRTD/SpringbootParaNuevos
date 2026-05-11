package com.psep.practicasringbootejemplopractico.controller;

import com.psep.practicasringbootejemplopractico.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.psep.practicasringbootejemplopractico.repository.PersonaRepository;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    @Autowired
    private PersonaRepository personaRepository;

    // Método GET para obtener los usuarios registrados
    @GetMapping
    public List<Persona> listar() {
        return personaRepository.findAll();
    }

    // Método POST para registrar usuarios
    @PostMapping
    public Persona crear(@RequestBody Persona persona) {
        return personaRepository.save(persona);
    }

    // Método PUT para actualizar el dinero de un usuario
    @PutMapping("/{id}/dinero")
        public ResponseEntity<Persona> actualizarDinero(@PathVariable Long id, @RequestBody Double dinero) {
        return personaRepository.findById(id).map(persona -> {
            persona.setDinero(persona.getDinero() + dinero);

            // Si el dinero es negativo, el usuario se borra automáticamente
            if (persona.getDinero() < 0) {
                personaRepository.delete(persona);
                return ResponseEntity.ok().<Persona>build();
            }
            return ResponseEntity.ok(personaRepository.save(persona));
        }).orElse(ResponseEntity.notFound().build());
    }

    // Método DELETE para borrar un usuario
    @DeleteMapping("/{id}")
    public void  eliminar(@PathVariable Long id) {
        personaRepository.deleteById(id);
    }
}
