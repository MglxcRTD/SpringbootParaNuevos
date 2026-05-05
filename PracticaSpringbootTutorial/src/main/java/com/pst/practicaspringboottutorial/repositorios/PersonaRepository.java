package com.pst.practicaspringboottutorial.repositorios;

import com.pst.practicaspringboottutorial.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

    public interface PersonaRepository extends JpaRepository<Persona, Integer> {

    Optional<Persona> findbynombre(String nombre);
}
