package microservicioVitafit.Vitafit.controllers;


import microservicioVitafit.Vitafit.models.Ejercicio;
import microservicioVitafit.Vitafit.repository.EjercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ejercicios")
@CrossOrigin("*")
public class EjercicioController {

    @Autowired
    private EjercicioRepository repo;

    @PostMapping("/crear")
    public Ejercicio crear(@RequestBody Ejercicio ejercicio) {
        return repo.save(ejercicio);
    }

    @GetMapping("/listar")
    public List<Ejercicio> listar() {
        return repo.findAll();
    }
}
