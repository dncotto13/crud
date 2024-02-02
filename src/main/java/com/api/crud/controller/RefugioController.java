package com.api.crud.controller;

import com.api.crud.model.Refugio;
import com.api.crud.service.RefugioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/refugios")
public class RefugioController {

    @Autowired
    private RefugioService serviceR;

    //GET
    @GetMapping
    public List<Refugio> listarTodo() {
        return serviceR.getAllRefugios();
    }

    //POST
    @PostMapping
    public Refugio crear(@RequestBody Refugio refugio) {
        return serviceR.createRefugio(refugio);
    }

    //PUT
    @PostMapping("editar/{id}")
    public Refugio actualizar(@RequestBody Refugio refugio, @PathVariable Long id) {
        refugio.setIdRefugio(id);
        return serviceR.updateRefugio(refugio);
    }

    //DELETE
    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        serviceR.deleteRefugioById(id);
    }
}
