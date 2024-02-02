package com.api.crud.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Refugio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRefugio;

    private String nombre;
    private String direccion;
    private String telefono;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Animal> animales = new ArrayList<>();

    public void setIdRefugio(Long id) {
    }
}
