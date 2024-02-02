package com.api.crud.service;

import com.api.crud.model.Animal;
import com.api.crud.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    //Mostrar animal
    public List<Animal> getAllAnimales() {
        return animalRepository.findAll();
    }

    //Crear animal
    public Animal createAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    //Editar animal
    public Animal updateAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    //Eliminar animal
    public void deteleAnimalById(Long id) {
        animalRepository.deleteById(id);
    }

    public void deleteAnimalById(Long id) {
    }
}