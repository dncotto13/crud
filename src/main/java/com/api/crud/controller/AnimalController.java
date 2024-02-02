package com.api.crud.controller;

import com.api.crud.model.Animal;
import com.api.crud.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/animales")
public class AnimalController {

    @Autowired
    private AnimalService serviceA;

    //GET
    @GetMapping
    public List<Animal> listarTodo() {
        return serviceA.getAllAnimales();
    }

    //POST
    @PostMapping
    public Animal crear(@RequestBody Animal animal) {
        return serviceA.createAnimal(animal);
    }

    //PUT
    @PostMapping("editar/{id}")
    public Animal editar(@RequestBody Animal animal, @PathVariable Long id) {
        animal.setIdAnimal(id);
        return serviceA.updateAnimal(animal);
    }

    //DELETE
    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        serviceA.deleteAnimalById(id);
    }
}