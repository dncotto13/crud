package com.api.crud.service;

import com.api.crud.model.Refugio;
import com.api.crud.repository.RefugioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefugioService {

    @Autowired
    private RefugioRepository refugioRepository;

    //Mostrar refugio
    public List<Refugio> getAllRefugios() {
        return refugioRepository.findAll();
    }

    //Crear refugio
    public Refugio createRefugio(Refugio refugio) {
        return refugioRepository.save(refugio);
    }

    //Editar refugio
    public Refugio updateRefugio(Refugio refugio) {
        return refugioRepository.save(refugio);
    }

    //Eliminar refugio
    public void deteleRefugioById(Long id) {
        refugioRepository.deleteById(id);
    }

    public void deleteRefugioById(Long id) {
    }
}
