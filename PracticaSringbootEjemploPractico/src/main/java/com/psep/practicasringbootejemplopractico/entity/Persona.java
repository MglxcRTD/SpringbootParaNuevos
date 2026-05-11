package com.psep.practicasringbootejemplopractico.entity;

import jakarta.persistence.*;

// Entidad (tabla) persona con sus getters y setters
@Entity
@Table(name = "personas")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String contrasena;
    private Double dinero = 0.0;


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public Double getDinero() {
        return dinero;
    }
    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
