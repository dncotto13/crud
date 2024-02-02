package com.api.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAnimal;

    private String nombre;
    private String edad;
    private String especie;
    private String raza;

    public void setIdAnimal(Long id) {
    }
}
