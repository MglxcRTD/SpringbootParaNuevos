package com.psep.practicasringbootejemplopractico.repository;

import com.psep.practicasringbootejemplopractico.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

// Interfaz que conecta la BBDD con la entidad Persona - Java
public interface PersonaRepository extends JpaRepository<Persona, Long> {}